package de.thws.klausurAufgaben.ss2017.nummer2;

public final class Wort implements Comparable<Wort> {
    
    int laenge;
    private final String wort;
    private String wortTyp;
    private String sprache;

    public Wort(String wort) {
        this.wort = wort;
    }

    public int compareTo(Wort other) {
        // Vergleichskriterium: Alphabetische Reihenfolge der Wörter
        return wort.compareTo(other.wort);
    }
}
