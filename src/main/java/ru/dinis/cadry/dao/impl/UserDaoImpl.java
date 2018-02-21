package ru.dinis.cadry.dao.impl;


import org.hibernate.*;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import ru.dinis.cadry.dao.interfaces.UserDao;
import ru.dinis.cadry.entities.*;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Create by dinis of 04.02.18.
 */

@Controller
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserDaoImpl implements UserDao {


    @Autowired
    private SessionFactory sessionFactory;

    public UserDaoImpl() {

    }



    @Transactional
    @Override
    public void addUser(User user, Set<Job> jobs, Passport passport, Set<Address> addresses, Set<Phone> phones) {

        Session session = this.sessionFactory.openSession();
        Transaction tr =  session.beginTransaction();

        for (Address address : addresses) {
            address.setUser(user);
        }

        for (Job job : jobs) {
            job.setUser(user);
        }

        for (Phone phone : phones) {
            phone.setUser(user);
        }

        passport.setUser(user);

        user.setAddresses(addresses);
        user.setJobs(jobs);
        user.setPhones(phones);
        user.setPassport(passport);

        try {
            session.merge(user);
            tr.commit();
        } catch (HibernateException he) {
            tr.rollback();
            he.printStackTrace();
        } finally {
            session.close();
        }
    }
    @Transactional
    @Override
    public void addUser(User user, Set<Job> jobs, Passport passport, Address address, Phone phone) {

        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

            for (Job job : jobs) {
                job.setUser(user);
            }

        passport.setUser(user);
        address.setUser(user);
        phone.setUser(user);

        user.setJobs(jobs);
        user.setPassport(passport);
        user.getAddresses().add(address);
        user.getPhones().add(phone);


        try {
            session.saveOrUpdate(user);
            transaction.commit();
        } catch (HibernateException he) {
            transaction.rollback();
            he.fillInStackTrace();
        } finally {
            session.close();
        }
    }

    @Transactional
    @Override
    public void addUser(User user, Job job, Passport passport, Address address, Phone phone) {

        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        job.setUser(user);

        passport.setUser(user);
        address.setUser(user);
        phone.setUser(user);

        user.getJobs().add(job);
        user.setPassport(passport);
        user.getAddresses().add(address);
        user.getPhones().add(phone);


        try {
            session.saveOrUpdate(user);
            transaction.commit();
        } catch (HibernateException he) {
            transaction.rollback();
            he.fillInStackTrace();
        } finally {
            session.close();
        }
    }



    @Transactional
    @Override
    public Set<User> getUsers() {
        Session session = this.sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        List<User> users = null;
        try {
            users = session.createQuery("FROM User").list();
            tr.commit();
        } catch (HibernateException he) {
            tr.rollback();
            he.printStackTrace();
        } finally {
            session.close();
        }
        return new TreeSet<User>(users);
    }

    @Transactional
    @Override
    public Set<User> getUser(String subdiv) {
        Session session = this.sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        List<User> users = null;
        try {
            users = session.createQuery("select user from Job j where j.subdivision = '" + subdiv + "'").list();
            tr.commit();
        } catch (HibernateException he) {
            tr.rollback();
            he.printStackTrace();
        } finally {
            session.close();
        }
        return new TreeSet<User>(users);
    }

    @Override
    public Set<User> getUserByName(String firstName, String lastName, String patronymic) {
        Session session = this.sessionFactory.openSession();
        Criteria criteria = session.createCriteria(User.class, "u");
        Transaction tr = session.beginTransaction();
        List<User> users = null;
        if (firstName != null) {
            criteria = criteria.add(Restrictions.ilike("u.firstName",firstName, MatchMode.START));;
        }
        if (lastName != null) {
            criteria = criteria.add(Restrictions.ilike("u.lastName",lastName, MatchMode.START));;
        }
        if (patronymic != null) {
            criteria = criteria.add(Restrictions.ilike("u.patronymic",patronymic, MatchMode.START));;
        }
        try {
            users = criteria.list();
            tr.commit();
        } catch (HibernateException he) {
            tr.rollback();
            he.printStackTrace();
        } finally {
            session.close();
        }
        return new TreeSet<User>(users);
    }
}
