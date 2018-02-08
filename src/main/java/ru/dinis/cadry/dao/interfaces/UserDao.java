package ru.dinis.cadry.dao.interfaces;

import ru.dinis.cadry.entities.*;

import java.util.List;

/**
 * Create by dinis of 04.02.18.
 */
public interface UserDao {

    int addUser(User user, List<Address> addresses, List<Job> jobs, List<Phone> phones, Passport passport);
}
