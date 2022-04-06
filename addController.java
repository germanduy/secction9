package com.company;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;

public class addController {
    public TextField name;
    public TextField number;
    public PhoneNumber phoneNumber;
    public void add() {
        try {
            PhoneNumber p = new PhoneNumber(name.getText(), number.getText());
            Main.Phonelist.add(p);
            Parent root = FXMLLoader.load(getClass().getResource("PhoneList.fxml"));
            Main.rootStage.setScene(new Scene(root,800,600));
        } catch (Exception e) {

        }
    }
    public void setDate(PhoneNumber phoneNumber){
        this.phoneNumber = phoneNumber;
        name.setText(phoneNumber.getName());
        number.setText(phoneNumber.getPhone().toString());

    }
}
