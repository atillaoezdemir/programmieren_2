package de.thws.lektion23aa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparatorLambda {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
    
        strings.add("Bannannaaa");
        strings.add("Apple");
        strings.add("Orange");

        // Implementierung des Comparators mit Lambda-Ausdruck
        Comparator<String> stringLengthComparator = (s1, s2) -> Integer.compare(s1.length(), s2.length());

        // Sortieren der Liste mit dem Comparator
        Collections.sort(strings, stringLengthComparator);

        // Ausgabe der sortierten Liste
        System.out.println(strings);
    }
}
