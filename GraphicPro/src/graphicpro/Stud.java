/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicpro;

import javafx.application.Preloader;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


/**
 * Simple Preloader Using the ProgressBar Control
 *
 * @author RyuK
 */
public class Stud extends Preloader  {
    Stage stage;
    Scene scene;
    Games games = new Games();
    
    public void start() throws Exception {
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
