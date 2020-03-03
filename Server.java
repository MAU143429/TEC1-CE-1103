package Server;
import java.net.*;
import java.io.*;




public class Server extends Thread
{
    private ServerSocket server;
    private Socket socket;
    private DataInputStream in;
    int port;

    public Server (int port2){
        port = port2;



    }
    @Override
    public void run() {
        try {
            System.out.println("hilo iniciado");
            server = new ServerSocket(port);
            System.out.println("Servidor Iniciado en:" + port);
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