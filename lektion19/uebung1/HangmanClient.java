package de.thws.lektion19aa.uebung1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class HangmanClient {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 12345);
            System.out.println("Connected to the server.");

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());

            Scanner scanner = new Scanner(System.in);

            while (true) {
                HangmanState currentState = (HangmanState) objectInputStream.readObject();
                System.out.println("Current status: " + new String(currentState.getGuessedWord()));

                if (currentState.isGameFinished()) {
                    if (currentState.isAnswerCorrect())
                        System.out.println("You win!");
                    
                    else
                        System.out.println("You lose");
                    
                    break;
                } else {
                    System.out.print("Enter a letter: ");
                    String letter = scanner.nextLine();
                    objectOutputStream.writeObject(new HangmanGuess(letter.charAt(0)));
                    objectOutputStream.flush();
                }
            }
            socket.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
