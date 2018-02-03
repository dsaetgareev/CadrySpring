package ru.dinis.cadry.beans;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Create by dinis of 03.02.18.
 */
@Controller
public class Test {

    @Autowired
    private SessionFactory sessionFactory;

    public void test() {
        System.out.println("SessionFactory " + sessionFactory);
    }


}
