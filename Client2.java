package sample;


import java.io.*;
import java.net.*;


    public class Client2 extends Thread {


        int port;
        public Client2(int port5) {
            port = port5;
        }

        private Socket socket1;
        private DataInputStream in;
        private DataOutputStream out;

        @Override
        public void run() {
            try {
                socket1 = new Socket("127.0.0.1", port);
                System.out.println("connected");

                in = new DataInputStream(System.in);
                out = new DataOutputStream(socket1.getOutputStream());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            String line = "";
            while (!line.equals("exit")) {
                try {

                    line = in.readLine();
                    out.writeUTF(line);

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

        }
    }









