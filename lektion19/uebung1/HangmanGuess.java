package de.thws.lektion19aa.uebung1;
import java.io.Serializable;

public class HangmanGuess implements Serializable {
    
    private char letter;

    public HangmanGuess(char letter) {
        this.letter = letter;
    }

    public char getLetter() {
        return letter;
    }
}
