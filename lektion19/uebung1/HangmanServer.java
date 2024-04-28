package de.thws.lektion19aa.uebung1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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

            String[] words = {"hallo", "welt", "java", "programmieren", "computer"};
            String selectedWord = words[new Random().nextInt(words.length)];
            int wordLength = selectedWord.length();

            char[] guessedWord = new char[wordLength];
            
            for (int i = 0; i < wordLength; i++)
                guessedWord[i] = '_';

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(clientSocket.getOutputStream());
            ObjectInputStream objectInputStream = new ObjectInputStream(clientSocket.getInputStream());

            while (wrongGuesses < MAX_WRONG_GUESSES) {
                objectOutputStream.writeObject(new HangmanState(guessedWord, false, false));
                objectOutputStream.flush();

                HangmanGuess guess = (HangmanGuess) objectInputStream.readObject();

                if (Character.isLetter(guess.getLetter())) {
                    boolean correctGuess = false;
                    for (int i = 0; i < selectedWord.length(); i++) {
                        if (selectedWord.charAt(i) == guess.getLetter()) {
                            guessedWord[i] = guess.getLetter();
                            correctGuess = true;
                        }
                    }

                    if (!new String(guessedWord).contains("_")) {
                        objectOutputStream.writeObject(new HangmanState(guessedWord, true, true));
                        objectOutputStream.flush();
                        break;
                    }

                    if (!correctGuess) {
                        wrongGuesses++;
                        if (wrongGuesses == MAX_WRONG_GUESSES) {
                            objectOutputStream.writeObject(new HangmanState(selectedWord.toCharArray(), true, false));
                            objectOutputStream.flush();
                            break;
                        }
                    }
                    
                    objectOutputStream.writeObject(new HangmanState(guessedWord, false, correctGuess));
                    objectOutputStream.flush();
                    
                } else {
                    wrongGuesses++;
                    
                    if (wrongGuesses == MAX_WRONG_GUESSES) {
                        objectOutputStream.writeObject(new HangmanState(selectedWord.toCharArray(), true, false));
                        objectOutputStream.flush();
                        break;
                    }
                }
            }
            serverSocket.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
