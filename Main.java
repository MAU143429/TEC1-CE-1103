package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * This class start a interface for client and established the parameters of the window , included size and name.
 * In this class i apply inheritance  with extends method
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("CHAT");
        primaryStage.setScene(new Scene(root, 500, 320));
        primaryStage.show();




        }


    }







