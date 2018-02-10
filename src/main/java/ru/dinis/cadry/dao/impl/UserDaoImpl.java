package ru.dinis.cadry.dao.impl;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.webflow.execution.ScopeType;
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


//    private List<User> users;

//    public void setUsers(List<User> users) {
//        this.users = users;
//    }

    @Transactional
    @Override
    public int addUser(User user, List<Address> addresses, List<Job> jobs, List<Phone> phones, Passport passport) {
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
        return user.getUserId();
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

//    public List<User> getUsers() {
//
//        return users;
//    }

    @Transactional
    public List<User> getUsers() {
        return sessionFactory.openSession().createCriteria(User.class).list();
    }


}
