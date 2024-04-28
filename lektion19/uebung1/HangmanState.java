package de.thws.lektion19aa.uebung1;

import java.io.Serializable;

public class HangmanState implements Serializable {

    private char[] guessedWord;
    private boolean gameFinished;
    private boolean answer;

    public HangmanState(char[] guessedWord, boolean gameFinished, boolean answer) {
        this.guessedWord = guessedWord;
        this.gameFinished = gameFinished;
        this.answer = answer;
    }

    public char[] getGuessedWord() {
        return guessedWord;
    }

    public boolean isGameFinished() {
        return gameFinished;
    }

    public boolean isAnswerCorrect() {
        return answer;
    }
}
