/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicpro;


import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Preloader;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Simple Preloader Using the ProgressBar Control
 *
 * @author RyuK
 */
public class Admin extends Preloader {
    Scene scenee;
    Stage stage, SettingStage;
    RadioButton radAnagramma, radParoleCrociate;
    ToggleGroup group;
    Button go;
    
    public void start() throws Exception {
        stage = new Stage();
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));
        stage.setTitle("Admin");
        stage.setFullScreen(false);
        scenee = new Scene(grid, 400, 300);
        stage.setResizable(false);
        
        group = new ToggleGroup();
        radAnagramma = new RadioButton();
        radParoleCrociate = new RadioButton();
        radAnagramma.setToggleGroup(group);
        radAnagramma.setText("Anagramma");
        radParoleCrociate.setToggleGroup(group);
        radParoleCrociate.setText("Parole Crociate");

        Button Settings = new Button("Settings");
        go = new Button("Start");
        
        grid.add(go,1, 3);
        
        Settings.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                settings();
            }
        });
        
        
        
        grid.add(Settings, 2, 2);
        grid.add(radAnagramma, 0, 1);
        grid.add(radParoleCrociate, 0 , 2);
        
        stage.initOwner(stage.getOwner());
        stage.setScene(scenee);
        scenee.getStylesheets().add(Admin.class.getResource("Login.css").toExternalForm());
        stage.show();
    }

    
    private void settings(){
        SettingStage = new Stage();
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));
        Scene scene = new Scene(grid, 400,300);
        
        Label Titolo = new Label("Inserire le parole deparate da una virgola.");
        TextArea Parola = new TextArea();
        
        Button Inserisci = new Button("Inserisci");
        grid.add(Parola, 1,1);
        grid.add(Inserisci,1,2);
        grid.add(Titolo, 1,0);
        
        if(radAnagramma.isSelected() == true){
            
        }
        
        SettingStage.setTitle("Settings");
        SettingStage.setScene(scene);
        scenee.getStylesheets().add(Admin.class.getResource("Login.css").toExternalForm());
        SettingStage.show();
    }
            
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
