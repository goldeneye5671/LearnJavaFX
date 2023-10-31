package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        int scene = 1;

        FXMLLoader HelloViewLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        FXMLLoader CssStylingLoader = new FXMLLoader(getClass().getResource("css-styling.fxml"));

        // Parent parentNode = FXMLLoader.load(getClass().getResource("fxmlfile.fxml"))

        Scene HelloScene = new Scene(HelloViewLoader.load(), Color.GRAY);
        Scene CssScene = new Scene(CssStylingLoader.load(), Color.GRAY);

        System.out.println(getClass().getResource("HelloApplication.css"));
        CssScene.getStylesheets().add(getClass().getResource("HelloApplication.css").toExternalForm());

        switch(scene) {
            case 0: {
                stage.setScene(HelloScene);
                break;
            }
            case 1: {
                stage.setScene(CssScene);
                break;
            }
            default: {
                break;
            }
        }

        stage.setTitle("Testing...");

        Text text = new Text("Hello world!!");
        text.setX(210);
        text.setY(210);
        text.setFont(Font.font("Calibri", 50));
        text.setFill(Color.BLUE);

//        root.getChildren().add(text);

        Image icon = new Image("SNOW.png");
        stage.getIcons().add(icon);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}