package ru.dinis.cadry.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


/**
 * Create by dinis of 04.02.18.
 */
@Entity
@Table(name = "job")
public class Job implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "position")
    private String position;

    @Column(name = "kategory")
    private String kategory;

    @Column(name = "subdivision")
    private String subdivision;

    @Column(name = "rate")
    private Double rate;

    @Column(name = "salary")
    private Double salary;

    @Column(name = "order_number")
    private String orderNumber;

    @Column(name = "order_date")
    private Date orderDate;

    @Column(name = "empl_date")
    private Date emplDate;

    @Column(name = "order_dismissal")
    private String orderDismissal;

    @Column(name = "order_dis_date")
    private Date orderDisDate;

    @Column(name = "dis_date")
    private Date disDate;

    @Column(name = "term")
    private Date term;
    @Column(name = "work_hourse")
    private int workHours;

    public Job() {
    }

    public Job(User user, String position, String kategory, String subdivision, Double rate, Double salary, String orderNumber, Date orderDate, Date emplDate, String orderDismissal, Date orderDisDate, Date disDate, Date term, int workHours) {
        this.user = user;
        this.position = position;
        this.kategory = kategory;
        this.subdivision = subdivision;
        this.rate = rate;
        this.salary = salary;
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.emplDate = emplDate;
        this.orderDismissal = orderDismissal;
        this.orderDisDate = orderDisDate;
        this.disDate = disDate;
        this.term = term;
        this.workHours = workHours;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getKategory() {
        return kategory;
    }

    public void setKategory(String kategory) {
        this.kategory = kategory;
    }

    public String getSubdivision() {
        return subdivision;
    }

    public void setSubdivision(String subdivision) {
        this.subdivision = subdivision;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getEmplDate() {
        return emplDate;
    }

    public void setEmplDate(Date emplDate) {
        this.emplDate = emplDate;
    }

    public String getOrderDismissal() {
        return orderDismissal;
    }

    public void setOrderDismissal(String orderDismissal) {
        this.orderDismissal = orderDismissal;
    }

    public Date getOrderDisDate() {
        return orderDisDate;
    }

    public void setOrderDisDate(Date orderDisDate) {
        this.orderDisDate = orderDisDate;
    }

    public Date getDisDate() {
        return disDate;
    }

    public void setDisDate(Date disDate) {
        this.disDate = disDate;
    }

    public Date getTerm() {
        return term;
    }

    public void setTerm(Date term) {
        this.term = term;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }
}
