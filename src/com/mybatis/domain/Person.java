package com.mybatis.domain;

public class Person {
    private int id;
    private User user;
    private int money;

    public Person(int id,User user, int money) {
        this.id=id;
        this.user = user;
        this.money = money;
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

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
