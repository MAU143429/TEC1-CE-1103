package sample;

import Server.Server;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class Controller {
    public TextArea chat;
    public TextArea sendbox;
    public TextArea port14;



    public void pressButton(ActionEvent event){
        String text = sendbox.getText();
        sendbox.clear();
        chat.appendText("USER 1:" + text+ "\n");

    }


    public void pressButton3(ActionEvent event){
        String port = port14.getText();
        int port5 = Integer.parseInt(port);
        Client2 client1 = new Client2(port5);
        client1.start();



    }
    }