package com.company;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    public static ObservableList<PhoneNumber> Phonelist = FXCollections.observableArrayList();
    public static Stage rootStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        rootStage  = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("PhoneList.fxml"));
        primaryStage.setTitle("");
        primaryStage.setScene(new Scene(root, 800,400));
        primaryStage.show();
    }

    public static void main(String[] args) {
	// write your code here
        launch(args);
    }
}
