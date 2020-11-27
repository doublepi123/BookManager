package com.lcy.book.bookmanagermentimpl;
import com.lcy.book.bookmanagement.BookManagement;
import com.lcy.book.model.OneRecord;
import com.lcy.book.util.SQLHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class BookManageMentimpl implements BookManagement {
    SimpleDateFormat dateFormat;
    String bookname = "Default";
    Date createdate = null;
    SQLHelper sqlHelper = null;
    public BookManageMentimpl(String s){
        bookname = s;
        dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        sqlHelper = new SQLHelper();
        sqlHelper.executeUpdate("CREATE TABLE IF NOT EXISTS "+bookname+"(ID INT PRIMARY KEY , NAME VARCHAR(10), MONEY INT, DATAO DATE);");
    }
    @Override
    public boolean addOneRecord() {
        return false;
    }

    @Override
    public boolean addOneRecord(String name, int money) {
        int n = 0;
        ResultSet rs =  sqlHelper.executeQuery("SELECT COUNT(*) FROM "+bookname+";");
        try {
            if(rs.next()){
                n = rs.getInt(1);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return false;
        }
        Date date = new Date();
        java.sql.Date sqldate = new java.sql.Date(date.getTime());
        String temp = "INSERT INTO "+bookname+" VALUES ("+n
                +","+"'"+name+"'"+","+money+","+"'"+dateFormat.format(date.getTime()) +"')";
        sqlHelper.executeUpdate(temp);
        return true;
    }

    @Override
    public boolean deleteOneRecord(int id) {
        return false;
    }
    @Override
    public ArrayList<OneRecord> findAllRecord() {
        ArrayList<OneRecord> ls = new ArrayList<OneRecord>();
        ResultSet rs =  sqlHelper.executeQuery("SELECT * FROM "+bookname);
        try {
            while(rs.next()){
                OneRecord oneRecord = new OneRecord(rs.getInt("ID"),rs.getString("NAME"),rs.getInt("MONEY"),dateFormat.parse(rs.getString("DATAO")));
                ls.add(oneRecord);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return ls;
        } catch (ParseException e) {
            e.printStackTrace();
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
