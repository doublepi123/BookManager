package com.lcy.book.bookmanagement;

import com.lcy.book.model.OneRecord;
import com.lcy.book.util.SQLHelper;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public interface BookManagement {

    boolean addOneRecord();
    boolean addOneRecord(String name,int money);
    boolean deleteOneRecord(int id);
    ArrayList<OneRecord> findAllRecord();
    OneRecord findOneRecord(int id);
    OneRecord findOneRecord(String name);
}
