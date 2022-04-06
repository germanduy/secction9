package com.company;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.util.ArrayList;

public class PhoneNumber {
    public String name;
    public ArrayList<String> phone = new ArrayList<>();
    public Button remove,edit;
    public PhoneNumber(){

    }
    public PhoneNumber(String name, String number){
        this.name = name;
        this.phone.add(number);
        this.edit = new Button("Edit");
        this.edit.setOnAction(event -> {
            try{
                FXMLLoader loader = new FXMLLoader(getClass().getResource("addNumberPhone.fxml"));
                Parent root = loader.load();
                addController a = loader.getController();
                a.setDate(this);
                Main.rootStage.setScene(new Scene(root,800,600));
            }catch (Exception e){
                System.out.println(e);
            }
        });
        this.remove = new Button("Remove");
        this.remove.setOnAction(event -> {
            Main.Phonelist.remove(this);
        });
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(ArrayList<String> phone) {
        this.phone = phone;
    }

    public Button getRemove() {
        return remove;
    }

    public Button getEdit() {
        return edit;
    }

    public void setRemove(Button remove) {
        this.remove = remove;
    }

    public void setEdit(Button edit) {
        this.edit = edit;
    }
}
