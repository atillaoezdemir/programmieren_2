package de.thws.lektion18aa.uebung2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class HangmanClient {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 12345);
            System.out.println("Connected to the server.");

            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            Scanner scanner = new Scanner(System.in);
            byte[] buffer = new byte[1024];

            while (true) {
                String currentStatus = new String(buffer, 0, inputStream.read(buffer));
                System.out.println("Current status: " + currentStatus);

                System.out.print("Enter a letter: ");
                String letter = scanner.nextLine();
                outputStream.write(letter.getBytes());
                outputStream.flush();

                String response = new String(buffer, 0, inputStream.read(buffer));
                System.out.println("Server response: " + response);

                if (response.equals("WIN") || response.equals("LOSE"))
                    break;
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
