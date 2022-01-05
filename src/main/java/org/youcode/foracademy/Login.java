package org.youcode.foracademy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

import java.io.IOException;
//import JDBC101.serviceImpl.AdminServiceImpl;


public class Login {
    @FXML
    private Scene scene;
    @FXML
    private Stage stage;
    @FXML
    private Parent root;
    @FXML
    public TextField userName;
    @FXML
    public TextField userPassword;
    @FXML
    public Label wrongLogin;
    @FXML
    public Label Palert;


    @FXML
    protected void userLogin(ActionEvent event) throws IOException {
        checkLogin();
    }
    private void checkLogin() throws IOException {
        Main m = new Main();
        if(userName.getText().toString().equals("user1") && userPassword.getText().toString().equals("password")){
            wrongLogin.setText("Bien venu!");
            m.changeScene("afterLogin.fxml");
        } else if (userName.getText().isEmpty() && userPassword.getText().isEmpty()) {
            wrongLogin.setText("Please enter your data !");
        } else {
            wrongLogin.setText("Wrong username or password !");
        }
        /*
        switch (new AdminServiceImpl().Login(email.getText(),password.getText())){
            case 0:
                Ealert.setText("Nous n'avons pas cet email dans nos données !");
                Ealert.setTextFill(Paint.valueOf("#f0932b"));
                email.setStyle("-fx-border-color: #eb4d4b");
                break;
            case 1:
                root = FXMLLoader.load(Main.class.getResource("hello-view.fxml"));
                stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(root, 616, 410);
                stage.setTitle("ForAcademy - Hello");
                stage.setScene(scene);
                stage.show();
                break;
            case 2:
                Palert.setText("Le mot de passe n'est pas correct, essayez-en un autre !");
                Palert.setTextFill(Paint.valueOf("#eb4d4b"));
                password.setStyle("-fx-border-color: #eb4d4b");
                break;
        }

         */
    }
}