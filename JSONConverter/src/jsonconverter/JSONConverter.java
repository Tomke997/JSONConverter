/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonconverter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import jsonconverter.GUI.util.HostName;

/**
 *
 * @author Mape
 */
public class JSONConverter extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        HostName HN = new HostName();
        HN.takeUserInfo();
        Parent root = FXMLLoader.load(getClass().getResource("GUI/view/MainFXML.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
