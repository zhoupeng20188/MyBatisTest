package com.example.mybatis.entity;

public class TUser {
    private Integer id;

    private String name;

    private Integer sex;

    private String address;

    private Integer phone;

    public TUser(Integer id, String name, Integer sex, String address, Integer phone) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.address = address;
        this.phone = phone;
    }

    public TUser() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }
}