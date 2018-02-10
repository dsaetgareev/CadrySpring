package ru.dinis.cadry.entities;



import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

/**
 * Create by dinis of 04.02.18.
 */
@Entity
@Table(name = "passport")
public class Passport implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "ser_passport")
    private String serPassport;

    @Column(name = "number_passport")
    private String numberPassport;
    @Column(name = "extradition")
    private String extradition;

    @Column(name = "ex_date")
    private Date exDate;

    @Column(name = "inn")
    private String inn;
    @Column(name = "snils")
    private String snils;

    public Passport() {
    }

    public Passport(User user, String serPassport, String numberPassport, String extradition, Date exDate, String inn, String snils) {
        this.user = user;
        this.serPassport = serPassport;
        this.numberPassport = numberPassport;
        this.extradition = extradition;
        this.exDate = exDate;
        this.inn = inn;
        this.snils = snils;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public Date getExDate() {
        return exDate;
    }

    public void setExDate(Date exDate) {
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
}
