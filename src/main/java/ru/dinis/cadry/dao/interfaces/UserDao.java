package ru.dinis.cadry.dao.interfaces;

import org.springframework.stereotype.Component;

import ru.dinis.cadry.entities.*;

import java.util.Set;

/**
 * Create by dinis of 04.02.18.
 */
@Component
public interface UserDao {

    void addUser(User user, Set<Job> jobs, Passport passport, Set<Address> addresses, Set<Phone> phones);

    void addUser(User user, Set<Job> jobs, Passport passport, Address address, Phone phone);

    void addUser(User user, Job job, Passport passport, Address address, Phone phone);

    Set<User> getUsers();

    Set<User> getUser(String subdivision);

    Set<User> getUserByName(String firstName, String lastName, String patronymic);


}
