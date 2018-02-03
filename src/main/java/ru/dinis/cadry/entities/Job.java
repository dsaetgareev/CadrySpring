package ru.dinis.cadry.entities;


import java.sql.Timestamp;

/**
 * Create by dinis of 03.02.18.
 */
public class Job {

    private int id;
    private Integer userId;
    private String position;
    private String kategory;
    private String subdivision;
    private Double rate;
    private Double salary;
    private String orderNumber;
    private Timestamp orderDate;
    private Timestamp emplDate;
    private String orderDismissal;
    private Timestamp orderDisDate;
    private Timestamp disDate;
    private Timestamp term;
    private Integer workHours;

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

    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    public Timestamp getEmplDate() {
        return emplDate;
    }

    public void setEmplDate(Timestamp emplDate) {
        this.emplDate = emplDate;
    }

    public String getOrderDismissal() {
        return orderDismissal;
    }

    public void setOrderDismissal(String orderDismissal) {
        this.orderDismissal = orderDismissal;
    }

    public Timestamp getOrderDisDate() {
        return orderDisDate;
    }

    public void setOrderDisDate(Timestamp orderDisDate) {
        this.orderDisDate = orderDisDate;
    }

    public Timestamp getDisDate() {
        return disDate;
    }

    public void setDisDate(Timestamp disDate) {
        this.disDate = disDate;
    }

    public Timestamp getTerm() {
        return term;
    }

    public void setTerm(Timestamp term) {
        this.term = term;
    }

    public Integer getWorkHours() {
        return workHours;
    }

    public void setWorkHours(Integer workHours) {
        this.workHours = workHours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Job job = (Job) o;

        if (id != job.id) return false;
        if (userId != null ? !userId.equals(job.userId) : job.userId != null) return false;
        if (position != null ? !position.equals(job.position) : job.position != null) return false;
        if (kategory != null ? !kategory.equals(job.kategory) : job.kategory != null) return false;
        if (subdivision != null ? !subdivision.equals(job.subdivision) : job.subdivision != null) return false;
        if (rate != null ? !rate.equals(job.rate) : job.rate != null) return false;
        if (salary != null ? !salary.equals(job.salary) : job.salary != null) return false;
        if (orderNumber != null ? !orderNumber.equals(job.orderNumber) : job.orderNumber != null) return false;
        if (orderDate != null ? !orderDate.equals(job.orderDate) : job.orderDate != null) return false;
        if (emplDate != null ? !emplDate.equals(job.emplDate) : job.emplDate != null) return false;
        if (orderDismissal != null ? !orderDismissal.equals(job.orderDismissal) : job.orderDismissal != null)
            return false;
        if (orderDisDate != null ? !orderDisDate.equals(job.orderDisDate) : job.orderDisDate != null) return false;
        if (disDate != null ? !disDate.equals(job.disDate) : job.disDate != null) return false;
        if (term != null ? !term.equals(job.term) : job.term != null) return false;
        if (workHours != null ? !workHours.equals(job.workHours) : job.workHours != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (kategory != null ? kategory.hashCode() : 0);
        result = 31 * result + (subdivision != null ? subdivision.hashCode() : 0);
        result = 31 * result + (rate != null ? rate.hashCode() : 0);
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        result = 31 * result + (orderNumber != null ? orderNumber.hashCode() : 0);
        result = 31 * result + (orderDate != null ? orderDate.hashCode() : 0);
        result = 31 * result + (emplDate != null ? emplDate.hashCode() : 0);
        result = 31 * result + (orderDismissal != null ? orderDismissal.hashCode() : 0);
        result = 31 * result + (orderDisDate != null ? orderDisDate.hashCode() : 0);
        result = 31 * result + (disDate != null ? disDate.hashCode() : 0);
        result = 31 * result + (term != null ? term.hashCode() : 0);
        result = 31 * result + (workHours != null ? workHours.hashCode() : 0);
        return result;
    }
}
