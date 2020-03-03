package Server;


import javafx.scene.control.*;
import javafx.event.ActionEvent;


public class ControllerA {
    public TextArea port;



    public void pressButton1(ActionEvent event){


        String port1 = port.getText();
        int port2 = Integer.parseInt(port1);
        Server server1 = new Server(port2);
        server1.start();





    }




}
