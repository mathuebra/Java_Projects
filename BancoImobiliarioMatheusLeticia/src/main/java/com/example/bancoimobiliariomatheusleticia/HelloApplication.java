package com.example.bancoimobiliariomatheusleticia;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 600);
        stage.setTitle("Banco Imobiliário!");
        stage.setScene(scene);
        stage.show();
        //stage.setFullScreen(true);
        stage.setResizable(false);
    }

    public static void main(String[] args) {
        launch();
    }
}