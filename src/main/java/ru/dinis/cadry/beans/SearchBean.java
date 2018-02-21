package ru.dinis.cadry.beans;


import org.springframework.stereotype.Component;

/**
 * Create by dinis of 18.02.18.
 */
@Component
public class SearchBean {

    private String firstName;

    private String lastName;

    private String patronymic;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
}
