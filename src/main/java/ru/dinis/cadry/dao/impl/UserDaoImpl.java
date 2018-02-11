package ru.dinis.cadry.dao.impl;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.webflow.execution.ScopeType;
import ru.dinis.cadry.beans.CreateUsers;
import ru.dinis.cadry.dao.interfaces.UserDao;
import ru.dinis.cadry.entities.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import java.util.List;

/**
 * Create by dinis of 04.02.18.
 */

@Controller
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserDaoImpl implements UserDao {


    @Autowired
    private SessionFactory sessionFactory;



    @Transactional
    @Override
    public void addUser(User user, List<Address> addresses, List<Job> jobs, List<Phone> phones, Passport passport) {

        Session session = this.sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();

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
            session.saveOrUpdate(user);
            transaction.commit();
            session.close();
        } catch (HibernateException he) {
            transaction.rollback();
        }
    }
    @Transactional
    public void addUser(User user, Job job, Passport passport, Address address, Phone phone) {

        Session session = this.sessionFactory.getCurrentSession();
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
        }
    }



    @Transactional
    public List<User> getUsers() {
        return sessionFactory.openSession().createCriteria(User.class).list();
    }


}
