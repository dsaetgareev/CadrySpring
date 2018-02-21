package ru.dinis.cadry.beans;


import jdk.nashorn.internal.scripts.JO;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
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
        Transaction tr = session.beginTransaction();
        Criteria criteria = session.createCriteria(User.class, "u");

        String firstName = "";
        String lastName = "р";
        String patronymic = "н";


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

        for (User user : users) {
            System.out.println(user.getFirstName() + user.getLastName() + user.getPatronymic());
        }

    }

}
