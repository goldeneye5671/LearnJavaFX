package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    private Circle myCircle;
    private double x;
    private double y;

    public void up (ActionEvent e) {
        myCircle.setCenterY(y -= 1);
        System.out.println("Up clicked");
    }

    public void down (ActionEvent e) {
        myCircle.setCenterY(y += 1);
        System.out.println("Down clicked");
    }

    public void left (ActionEvent e) {
        myCircle.setCenterX(x -= 1);
        System.out.println("Left clicked");
    }

    public void right (ActionEvent e) {
        myCircle.setCenterX(x += 1);
        System.out.println("Right clicked");
    }
}