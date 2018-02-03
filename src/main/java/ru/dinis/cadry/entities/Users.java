package ru.dinis.cadry.entities;


/**
 * Create by dinis of 03.02.18.
 */
public class Users {

    private int userId;
    private String firstName;
    private String lastName;
    private String patronymic;
    private String gender;
    private Byte marStatus;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Byte getMarStatus() {
        return marStatus;
    }

    public void setMarStatus(Byte marStatus) {
        this.marStatus = marStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;

        if (userId != users.userId) return false;
        if (firstName != null ? !firstName.equals(users.firstName) : users.firstName != null) return false;
        if (lastName != null ? !lastName.equals(users.lastName) : users.lastName != null) return false;
        if (patronymic != null ? !patronymic.equals(users.patronymic) : users.patronymic != null) return false;
        if (gender != null ? !gender.equals(users.gender) : users.gender != null) return false;
        if (marStatus != null ? !marStatus.equals(users.marStatus) : users.marStatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (patronymic != null ? patronymic.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (marStatus != null ? marStatus.hashCode() : 0);
        return result;
    }
}
