package Server;
import java.net.*;
import java.io.*;
import javafx.scene.control.*;



public class Server extends Thread
{
    public TextArea port;
    private ServerSocket server;
    private Socket socket;
    private DataInputStream in;



    @Override
    public void run() {
        try {
            String port1 = port.getText();
            int port2 = Integer.parseInt(port1);
            server = new ServerSocket(port2);
            System.out.println("Servidor Iniciado en:" + port2);
            System.out.println("Esperando cliente");
            socket = new Socket();
            socket = server.accept();
            System.out.println("Cliente conectado");

            in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            String line = " ";

            while (!line.equals("exit")) {
                try {
                    line = in.readUTF();
                    System.out.println(line);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            System.out.println("closing connection");
            socket.close();

            in.close();
            socket.close();
        } catch(Exception e) {
        }

    }
}