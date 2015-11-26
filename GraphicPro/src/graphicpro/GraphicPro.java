/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicpro;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author RyuK
 */
public class GraphicPro extends Application {
    ToggleGroup group;
    RadioButton radAdmin, radStud;
    PasswordField pass;
    Label Missing;
    
    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("Login");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));
        Scene scene = new Scene(grid, 300, 275);
        group = new ToggleGroup();
        
        Label scenetitle = new Label("LOGIN");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);
        
        Label lblName = new Label("Name");
        Label lblPw = new Label("Password");
        Label lblIp = new Label("Ip");
        
        grid.add(lblName, 2, 2);
        grid.add(lblPw, 2, 3);
        grid.add(lblIp, 2, 4);
        
        TextField user = new TextField();
        grid.add(user, 1, 2);
        
        TextField Ip = new TextField();
        Ip.setText("127.0.0.1");
        grid.add(Ip, 1, 4);
        
        pass = new PasswordField();
        grid.add(pass, 1, 3);
        
        radStud = new RadioButton();
        radStud.setText("Studente");
        radAdmin = new RadioButton();
        radAdmin.setText("Admin");
        
        radStud.setToggleGroup(group);
        radStud.setSelected(true);
        radAdmin.setToggleGroup(group);
        
        Button butStart = new Button("LogIN");
        grid.add(butStart, 1, 5);
        
        grid.add(radStud, 1, 1);
        grid.add(radAdmin, 2, 1);
        
        if(!radAdmin.isSelected() == true){
                                    pass.setEditable(false);
                                }else
                                    
                                    pass.setEditable(true);
        group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            
            @Override
            public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
                pass.setText("");
                                if(!radAdmin.isSelected() == true){
                                    pass.setEditable(false);
                                }else
                                    
                                    pass.setEditable(true);
            }
        });
        Missing = new Label("Errore");
        grid.add(Missing, 2, 6);
        Missing.setVisible(false);
        
        butStart.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                if(radStud.isSelected() == true){
                    if(Ip.getText().equals("") || user.getText().equals("")){
                        Missing.setText("Errore");
                        Missing.setVisible(true);
                    }else{
                        //ci sbatto la graFica dello studente
                        Missing.setText("Logged");
                        Missing.setVisible(true);
                    }
                    
                }else{
                        if(Ip.getText().equals("") || user.getText().equals("") || pass.getText().equals("")){
                            Missing.setText("Errore");
                            Missing.setVisible(true);
                        }else{
                            //Ci sbatto la graFica dell ' admin
                                Missing.setText("Logged");
                                Missing.setVisible(true);
                        }
                    }
            }
        });
        
        
        primaryStage.setScene(scene);
        scene.getStylesheets().add(GraphicPro.class.getResource("Login.css").toExternalForm());
        primaryStage.show();
    }
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
