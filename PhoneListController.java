package com.company;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swt.FXCanvas;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class PhoneListController implements Initializable {
    public TableView<PhoneNumber> tbview;
    public TableColumn<PhoneNumber ,String> cname;
    public TableColumn<PhoneNumber, ArrayList<String>> cphone;
    public TableColumn<PhoneNumber, Button> cedit;
    public TableColumn<PhoneNumber,Button> cremove;
    public TextField txtSearch;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cname.setCellValueFactory(new PropertyValueFactory<PhoneNumber,String>("name"));
        cphone.setCellValueFactory(new PropertyValueFactory<PhoneNumber, ArrayList<String>>("phone"));
        cedit.setCellValueFactory(new PropertyValueFactory<PhoneNumber,Button>("edit"));
        cremove.setCellValueFactory(new PropertyValueFactory<PhoneNumber,Button>("remove"));
        tbview.setItems(Main.Phonelist);
    }

    public void formScreen() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("addNumberPhone.fxml"));
        Main.rootStage.setScene(new Scene(root,600,400));
    }
    public void search(){
        String s = txtSearch.getText();
        List<PhoneNumber> kq =Main.Phonelist.stream().filter(phoneNumber->phoneNumber.getName().contains(s)).collect(Collectors.toList());
        ObservableList result = FXCollections.observableArrayList();
        result.addAll(kq);
        tbview.setItems(result);

    }
}
