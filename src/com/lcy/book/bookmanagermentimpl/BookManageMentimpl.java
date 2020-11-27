package com.lcy.book.bookmanagermentimpl;

import com.lcy.book.bookmanagement.BookManagement;
import com.lcy.book.model.OneRecord;
import com.lcy.book.util.SQLHelper;

import javax.xml.crypto.Data;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookManageMentimpl implements BookManagement {
    String bookname = "Default";
    Data createdate = null;
    SQLHelper sqlhelper = null;
    public BookManageMentimpl(String s){
        bookname = s;
        SQLHelper sqlHelper = new SQLHelper();
        sqlHelper.executeUpdate("CREATE TABLE IF NOT EXISTS "+bookname+"(ID INT PRIMARY KEY , NAME VARCHAR(10), MONEY INT);");
    }

    public  BookManageMentimpl(){
        SQLHelper sqlHelper = new SQLHelper();
        sqlHelper.executeUpdate("CREATE TABLE IF NOT EXISTS "+bookname+"(ID INT PRIMARY KEY , NAME VARCHAR(10), MONEY INT);");
    }
    @Override
    public boolean addOneRecord() {
        return false;
    }

    @Override
    public boolean addOneRecord(String name, int money) {
        int n = 0;
        try {
            ResultSet rs =  sqlhelper.executeQuery("SELECT COUNT(*) FROM "+bookname);
            if(rs.next()){
                n = rs.getInt(1);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        sqlhelper.executeUpdate("INSERT INTO "+bookname+"VALUES ("+n+","+"'"+name+"'"+","+money+")");
        return false;
    }

    @Override
    public boolean deleteOneRecord(int id) {
        return false;
    }

    @Override
    public ArrayList<OneRecord> findAllRecord() {
        ArrayList<OneRecord> ls = new ArrayList<OneRecord>();
        ResultSet rs =  sqlhelper.executeQuery("SELECT * FROM"+bookname);
        try {
            while(rs.next()){
                OneRecord oneRecord = new OneRecord(rs.getInt("ID"),rs.getString("NAME"),rs.getInt("MONEY"));
                ls.add(oneRecord);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return ls;
    }
    
    @Override
    public OneRecord findOneRecord(int id) {
        return null;
    }

    @Override
    public OneRecord findOneRecord(String name) {
        return null;
    }
}
