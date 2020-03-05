package Server;


import javafx.scene.control.*;
import javafx.event.ActionEvent;

/**
 * in this class i control a Server GUI
 * The action PressButton enable a parameter to established a port, the info from Text field is convert to int and then used to
 * created a server in this port
 */

public class ControllerA {
    public TextArea port;



    public void pressButton1(ActionEvent event){


        String port1 = port.getText();
        int port2 = Integer.parseInt(port1);
        Server server1 = new Server(port2);
        server1.start();





    }




}
