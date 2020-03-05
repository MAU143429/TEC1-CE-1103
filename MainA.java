package Server;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * this class start server connection and enable one option to select what server port do you prefer and server runs in this port
 * one more time apply inheritance  using extends method and i included parameters of GUI
 */
public class MainA extends Application  {

    @Override
    public void start (Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("connection.fxml"));
        primaryStage.setTitle("SERVER CONNECTION");
        primaryStage.setScene(new Scene(root, 411, 273));
        primaryStage.show();}





}







