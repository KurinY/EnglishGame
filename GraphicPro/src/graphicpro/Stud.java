/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicpro;

import javafx.application.Preloader;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


/**
 * Simple Preloader Using the ProgressBar Control
 *
 * @author RyuK
 */
public class Stud extends Preloader  {
    Stage stage;
    Scene scene;
    Label[][] lettere = new Label[10][10];
    Games games = new Games();
    
    public void start() throws Exception {
        stage = new Stage();
        GridPane grid = new GridPane();
        scene = new Scene(grid,50,590);
        
         
        for(int k=0;k<10;k++){
            for(int l=0;l<10;l++){
                lettere[k][l] = new Label("S");       //inizializzo della matrice di 
                grid.add(lettere[k][l], k, l);        //label ogni label.
                lettere[k][l].setStyle("-fx-border-color: white;"
                        + "-fx-border-width: 2;-fx-border-style: solid;");
                lettere[k][l].setText("S1");
                lettere[k][l].setPadding(new Insets(17,20,17,20));
            }
        }
        
        
        stage.setScene(scene);
        scene.getStylesheets().add(Stud.class.getResource("Login.css").toExternalForm());
        stage.show();
    }
    
    public void anagramma(){
                stage = new Stage();
        GridPane grid = new GridPane();
        scene = new Scene(grid,500,300);
        
        Button butCheck = new Button("Check");
        
        TextField txtfAna = new TextField();
        Label lblAna = new Label();
        Label vite= new Label();
        
        lblAna.setText("CIAOOOO");
        vite.setText("III");               //Ogni volta che si perde uan vita 
                                           //si modifica il txt della label
                                           //esempio: ("II"), ("I").
            
        grid.add(txtfAna, 1, 2);
        grid.add(lblAna, 1, 1);
        grid.add(butCheck, 1, 3);
        grid.add(vite, 2, 3);
        
                                       //Evento del Check: vite etc..
        butCheck.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                
            }
        });
        
        stage.setScene(scene);
        scene.getStylesheets().add(Stud.class.getResource("Admin.css").toExternalForm());
        stage.show();
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {

    }
    
}
