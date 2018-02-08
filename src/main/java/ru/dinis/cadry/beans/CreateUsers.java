package ru.dinis.cadry.beans;


import ru.dinis.cadry.entities.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * Create by dinis of 06.02.18.
 */
public class CreateUsers {

    public List<User> getUsers(int value, String name) {
        List<User> list = new ArrayList<User>();
        for (int i = 0; i < value; i++) {
            User user = new User();
            user.setFirstName(name + i);
            user.setLastName("LL" + name + i);
            user.setPatronymic("PPP" + name + i);
            list.add(user);
        }
        return list;
    }

    public List<Job> getJobs(int value) {
        List<Job> list = new ArrayList<Job>();
        for (int i = 0; i< value; i++) {
            Job job = new Job();
            job.setDisDate(null);
            job.setEmplDate(new Date(105, 10, 10));
            job.setKategory("aaa" + i);
            job.setOrderDate(new Date(System.currentTimeMillis()));
            job.setOrderDisDate(null);
            job.setOrderNumber("bbb" + i);
            job.setPosition("ccc" + i);
            job.setRate(2323.23);
            job.setSalary(4000.0);
            job.setSubdivision("dddd" + i);
            job.setTerm(new Date(120, 10, 10));
            job.setWorkHours(5 + i);
            list.add(job);
        }
        return list;
    }

    public List<Passport> getPassports(int value) {
        List<Passport> list = new ArrayList<Passport>();
        for (int i = 0; i < value; i++) {
            Passport passport = new Passport();
            passport.setExDate(new Date(2005, 06, 04));
            passport.setExtradition("aaaa" + i);
            passport.setInn("bbb" + i);
            passport.setNumberPassport("ddd" + i);
            passport.setSerPassport("ccc" + i);
            passport.setSnils("eee" + i);
            list.add(passport);
        }
        return list;
    }

    public List<Phone> getPhones(int value) {
        List<Phone> list = new ArrayList<Phone>();
        for (int i = 0 ; i < value; i++) {
            Phone phone = new Phone();
            phone.setPhoneNumber("23242342" + i);
            list.add(phone);
        }
        return list;
    }

    public List<Address> getAddress(int value) {
        List<Address> list = new ArrayList<Address>();
        for (int i = 0; i < value; i++) {
            Address address = new Address();
            address.setAddressReg("djfkdjf" + i);
            address.setAddressRes("eeeeeeee" + i);
            list.add(address);
        }
        return list;
    }

    public void forUser(User user, List<Address> addresses, List<Job> jobs, List<Phone> phones, Passport passport) {
        user.setAddresses(addresses);
        user.setJobs(jobs);
        user.setPhones(phones);
        user.setPassport(passport);
    }

    public void forAddress(List<Address> addresses, User user) {
        for (Address address : addresses) {
            address.setUser(user);
        }
    }

    public void forJob(List<Job> jobs, User user) {
        for (Job job : jobs) {
            job.setUser(user);
        }
    }

    public void forPhone(List<Phone> phones, User user) {
        for (Phone phone : phones) {
            phone.setUser(user);
        }
    }


}
