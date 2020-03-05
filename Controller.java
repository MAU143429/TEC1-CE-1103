package sample;


import javafx.event.ActionEvent;
import javafx.scene.control.*;
/**
 * in this class i control a Client GUI
 * The action PressButton enable a parameter to send messages, the info from Text field is convert to variable and then send info with help of sockets
 *
 * i dont apply encapsulated variable because i need this parameter on another class
 */

public class Controller  {


        public TextArea chat;
        public TextArea sendbox;
        public TextArea port14;


        public void pressButton (ActionEvent event){
            String text = sendbox.getText();
            sendbox.clear();
            chat.appendText("USER 1:" + text + "\n");

        }





        }

