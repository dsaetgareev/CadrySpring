package ru.dinis.cadry.service;



import ru.dinis.cadry.entities.Address;
import ru.dinis.cadry.entities.User;

/**
 * Create by dinis of 11.02.18.
 */
public class Synchronised {

    private void synchUserAddress(User user, Address address) {

        address.setUser(user);
        user.getAddresses().add(address);

    }

}
