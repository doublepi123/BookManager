package com.lcy.book.tester;

import com.lcy.book.util.SQLHelper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLTester {

    public static void main(String[] args) {
        SQLHelper sqLHelper = new SQLHelper();
        sqLHelper.executeUpdate("CREATE TABLE IF NOT EXISTS STUDENTINFO(ID CHAR(10) PRIMARY KEY , NAME VARCHAR(10), AGE INT);");
        sqLHelper.executeUpdate("INSERT INTO STUDENTINFO VALUES(1811130204,'LCY',99)");
        ResultSet rs =  sqLHelper.executeQuery("SELECT COUNT(*) FROM STUDENTINFO");
        try{
            while (rs.next()){
                System.out.println(rs.getString(1));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
