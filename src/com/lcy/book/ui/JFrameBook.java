package com.lcy.book.ui;

import javax.swing.*;
import java.awt.*;

public class JFrameBook extends JFrame {
    public JFrameBook(){
            setTitle("班费管理系统");
            setSize(400,200);
            setDefaultCloseOperation(JFrameBook.EXIT_ON_CLOSE);
            JLabel jl = new JLabel("新窗口");
            Container c = getContentPane();
            //c.add(jl);
            setVisible(true);
    }

    public static void main(String[] args) {
        new JFrameBook();
    }
}
