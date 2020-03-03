package Server;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainA extends Application  {

    @Override
    public void start (Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("connection.fxml"));
        primaryStage.setTitle("SERVER CONNECTION");
        primaryStage.setScene(new Scene(root, 411, 273));
        primaryStage.show();}





}







