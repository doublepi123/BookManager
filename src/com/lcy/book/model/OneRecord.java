package com.lcy.book.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OneRecord {
    SimpleDateFormat dateFormat;
    private int id;
    private String  name;
    private int money;
    private Date createdate;
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id +
                "\t" + name +
                "\t\t" + money+"\t"+dateFormat.format(createdate);
    }

    public void setId(int id) {
        this.id = id;
    }

    public OneRecord() {

    }

    public OneRecord(String name, int money) {
        dateFormat =  new SimpleDateFormat("yyyy-MM-dd");
        this.name = name;
        this.money = money;
    }

    public OneRecord(int id, String name, int money, Date date) {
        dateFormat =  new SimpleDateFormat("yyyy-MM-dd");
        this.id = id;
        this.name = name;
        this.money = money;
        this.createdate = date;
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
