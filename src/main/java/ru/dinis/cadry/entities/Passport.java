package ru.dinis.cadry.entities;


import java.sql.Timestamp;

/**
 * Create by dinis of 03.02.18.
 */
public class Passport {

    private int id;
    private Integer userId;
    private String serPassport;
    private String numberPassport;
    private String extradition;
    private Timestamp exDate;
    private String inn;
    private String snils;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSerPassport() {
        return serPassport;
    }

    public void setSerPassport(String serPassport) {
        this.serPassport = serPassport;
    }

    public String getNumberPassport() {
        return numberPassport;
    }

    public void setNumberPassport(String numberPassport) {
        this.numberPassport = numberPassport;
    }

    public String getExtradition() {
        return extradition;
    }

    public void setExtradition(String extradition) {
        this.extradition = extradition;
    }

    public Timestamp getExDate() {
        return exDate;
    }

    public void setExDate(Timestamp exDate) {
        this.exDate = exDate;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getSnils() {
        return snils;
    }

    public void setSnils(String snils) {
        this.snils = snils;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Passport passport = (Passport) o;

        if (id != passport.id) return false;
        if (userId != null ? !userId.equals(passport.userId) : passport.userId != null) return false;
        if (serPassport != null ? !serPassport.equals(passport.serPassport) : passport.serPassport != null)
            return false;
        if (numberPassport != null ? !numberPassport.equals(passport.numberPassport) : passport.numberPassport != null)
            return false;
        if (extradition != null ? !extradition.equals(passport.extradition) : passport.extradition != null)
            return false;
        if (exDate != null ? !exDate.equals(passport.exDate) : passport.exDate != null) return false;
        if (inn != null ? !inn.equals(passport.inn) : passport.inn != null) return false;
        if (snils != null ? !snils.equals(passport.snils) : passport.snils != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (serPassport != null ? serPassport.hashCode() : 0);
        result = 31 * result + (numberPassport != null ? numberPassport.hashCode() : 0);
        result = 31 * result + (extradition != null ? extradition.hashCode() : 0);
        result = 31 * result + (exDate != null ? exDate.hashCode() : 0);
        result = 31 * result + (inn != null ? inn.hashCode() : 0);
        result = 31 * result + (snils != null ? snils.hashCode() : 0);
        return result;
    }
}
