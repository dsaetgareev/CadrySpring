package ru.dinis.cadry.dao.impl;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.dinis.cadry.dao.interfaces.UserDao;
import ru.dinis.cadry.entities.*;

import java.util.List;

/**
 * Create by dinis of 04.02.18.
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;



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


}
