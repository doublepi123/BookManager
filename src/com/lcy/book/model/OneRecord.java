package com.lcy.book.model;

public class OneRecord {
    private int id;
    private String  name;
    private int money;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OneRecord() {

    }

    public OneRecord(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public OneRecord(int id, String name, int money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }
}
