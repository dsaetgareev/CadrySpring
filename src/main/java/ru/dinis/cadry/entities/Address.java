package ru.dinis.cadry.entities;


/**
 * Create by dinis of 03.02.18.
 */
public class Address {

    private int id;
    private Integer userId;
    private String addressReg;
    private String addressRes;

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

    public String getAddressReg() {
        return addressReg;
    }

    public void setAddressReg(String addressReg) {
        this.addressReg = addressReg;
    }

    public String getAddressRes() {
        return addressRes;
    }

    public void setAddressRes(String addressRes) {
        this.addressRes = addressRes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (id != address.id) return false;
        if (userId != null ? !userId.equals(address.userId) : address.userId != null) return false;
        if (addressReg != null ? !addressReg.equals(address.addressReg) : address.addressReg != null) return false;
        if (addressRes != null ? !addressRes.equals(address.addressRes) : address.addressRes != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (addressReg != null ? addressReg.hashCode() : 0);
        result = 31 * result + (addressRes != null ? addressRes.hashCode() : 0);
        return result;
    }
}
