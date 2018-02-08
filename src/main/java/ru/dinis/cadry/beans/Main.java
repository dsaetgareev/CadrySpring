package ru.dinis.cadry.beans;


import jdk.nashorn.internal.scripts.JO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import ru.dinis.cadry.entities.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Create by dinis of 06.02.18.
 */
public class Main {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        new Date(2001, 10, 10);

        Transaction tr = session.beginTransaction();
        CreateUsers create = new CreateUsers();
        User user = create.getUsers(1, "k").get(0);

        List<Address> addresses = create.getAddress(1);
        create.forAddress(addresses, user);

        List<Job> jobs = create.getJobs(3);
        create.forJob(jobs, user);

        List<Phone> phones = create.getPhones(1);
        create.forPhone(phones, user);

        Passport passport = create.getPassports(1).get(0);
        passport.setUser(user);

        create.forUser(user, addresses, jobs, phones, passport);


        session.saveOrUpdate(user);


        tr.commit();

    }

}
