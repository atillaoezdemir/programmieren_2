package de.thws.klausursuebungen;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class RouletteZahlenIterator implements Iterator<Integer> {

    private static final int TERMINATION_COUNT = 3; // Terminierung, wenn 0 dreimal erscheint
    private int terminationCounter = 0;

    public static void main(String[] args) {
        // b) Verwendung von RouletteZahlen
        // RouletteZahlen rouletteZahlen = new RouletteZahlen();
        // for (Integer zahl : rouletteZahlen)
        //    System.out.println(zahl);

        // c) Verwendung von RouletteZahlenIterator mit for-Schleife
        RouletteZahlenIterator iterator = new RouletteZahlenIterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }

    @Override
    public boolean hasNext() {
        return terminationCounter < TERMINATION_COUNT;
    }

    @Override
    public Integer next() {
        if (!hasNext())
            throw new NoSuchElementException("No more elements");

        Random random = new Random();
        int randomNumber = random.nextInt(37); // Werte von 0 bis 36
        if (randomNumber == 0)
            terminationCounter++;
        
        return randomNumber;
    }


    @Override
    public void remove() {
        throw new UnsupportedOperationException("remove() is not supported!");
    }
}
