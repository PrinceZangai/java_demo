package com.mybatis.domain;

public class Wife {
    private int id;
    private String name;
    private int hid;

    public Husband getHusband() {
        return husband;
    }

    public void setHusband(Husband husband) {
        this.husband = husband;
    }

    private Husband husband;

    public Wife() {
    }

    public Wife(int id, String name, int hid) {
        this.id = id;
        this.name = name;
        this.hid = hid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    @Override
    public String toString() {
        return "Wife{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hid=" + hid +
                ", husband=" + husband +
                '}';
    }
}
