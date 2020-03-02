package sample;


import java.io.*;
import java.net.*;


    public class Client2 {
        private Socket s;
        private DataInputStream in;
        private DataOutputStream out;

        public Client2(String address, int port){
            try{
                s = new Socket(address, port);
                System.out.println("connected");

                in = new DataInputStream(System.in);
                out = new DataOutputStream(s.getOutputStream());
            }catch(Exception e){
                System.out.println(e.getMessage());
            }

            String line ="";
            while(!line.equals("exit")){
                try{

                    line = in.readLine();
                    out.writeUTF(line);

                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }

        }

        public static void main(String[] args) {
            Client2 client = new Client2("127.0.0.1",4433);

        }


    }


