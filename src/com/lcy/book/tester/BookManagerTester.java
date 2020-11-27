package com.lcy.book.tester;

import com.lcy.book.bookmanagermentimpl.BookManageMentimpl;
import com.lcy.book.model.OneRecord;

public class BookManagerTester {
    public static void main(String[] args) {
        BookManageMentimpl bk = new BookManageMentimpl("test");
        bk.addOneRecord("李明",10);
        for(OneRecord a : bk.findAllRecord()){
            System.out.println(a);
        }
    }
}
