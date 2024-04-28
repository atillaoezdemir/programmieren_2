package de.thws.lektion22aa.uebung4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class WordComparatorAnonym {
    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<>(new Comparator<>() {
                public int compare(String word1, String word2){
                    int lengthComparison = Integer.compare(word1.length(), word2.length());
                    return (lengthComparison != 0) ? lengthComparison : word1.compareTo(word2);
                }
        });

        String[] alleWoerter = {"Barriere", "Buch", "Bibel", "Beige", "Bienenschwarm", "Bein", "Beil", "Christ", "Christian", "Carmen"};
        t.addAll(Arrays.asList(alleWoerter));

        for (String wort : t)
            System.out.println(wort);
    }
}
