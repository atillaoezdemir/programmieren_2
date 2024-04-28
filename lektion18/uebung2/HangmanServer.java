package de.thws.lektion18aa.uebung2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class HangmanServer {
    
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Server is running. Waiting for connections...");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Connection established with a client.");

            final int MAX_WRONG_GUESSES = 5;
            int wrongGuesses = 0;

            String[] Words = {"hallo", "welt", "java", "programmieren", "computer"};
            String selectedWord = Words[new Random().nextInt(Words.length)];
            int wordLength = selectedWord.length();

            char[] guessedWord = new char[wordLength];
            for (int i = 0; i < wordLength; i++)
                guessedWord[i] = '_';

            byte[] buffer = new byte[1024];

            while (wrongGuesses < MAX_WRONG_GUESSES) {
                InputStream inputStream = clientSocket.getInputStream();
                OutputStream outputStream = clientSocket.getOutputStream();
                String currentStatus = new String(guessedWord);
                outputStream.write(currentStatus.getBytes());
                outputStream.flush();

                int bytesRead = inputStream.read(buffer);
                String letter = new String(buffer, 0, bytesRead);

                if (Character.isLetter(letter.charAt(0)) && letter.length() == 1) {
                    for (int i = 0; i < selectedWord.length(); i++) {
                        if (selectedWord.charAt(i) == letter.charAt(0))
                            guessedWord[i] = letter.charAt(0);
                    }
                    
                    if (new String(guessedWord).equals(selectedWord)) {
                        outputStream.write("WIN".getBytes());
                        outputStream.flush();
                        break;
                    }
                    
                } else {
                    wrongGuesses++;
                    
                    if (wrongGuesses == MAX_WRONG_GUESSES) {
                        outputStream.write("LOSE".getBytes());
                        outputStream.flush();
                        break;
                    }
                }
                
                outputStream.write("OK".getBytes());
                outputStream.flush();
            }
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
