package com.lcy.book.ui;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class JavafxTester extends Application {
    public static void main(String[] args) {
        JavafxTester javafxTester = new JavafxTester();
    }
    double toffx,toffy;
    
    Text t = new Text(20,20,"Here");
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();
        pane.getChildren().add(t);
        Scene scene = new Scene(pane,200,100);
        t.setOnMousePressed(e->handleMousepressed(e));
        t.setOnMouseDragged(e->handleMouseDragged(e));
        stage.setScene(scene);
        stage.show();
        t.requestFocus();
    }


    protected  void handleMousepressed(javafx.scene.input.MouseEvent e){
        toffx = e.getSceneX();
        toffy = e.getSceneY();
    }
    protected void handleMouseDragged(javafx.scene.input.MouseEvent e){
        t.setX(e.getSceneX());
        t.setY(e.getSceneY());
    }
}
