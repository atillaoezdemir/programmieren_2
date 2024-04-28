package de.thws.lektion22aa.uebung3;

import java.io.*;
import java.net.Socket;

public class client {

    public client() {
    }

    public static void main(String[] args) {
        client client = new client();
        client client2 = new client();
        client.connect();
        client2.connect();
    }

    public void connect() {
        try (Socket socket = new Socket("localhost", 8080);
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            
            writer.write("1, 2, 3, 4, 5, 6, 7, 8");
            writer.flush();

            String output;
            
            while ((output = reader.readLine()) != null)
                System.out.println(output);
            
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
