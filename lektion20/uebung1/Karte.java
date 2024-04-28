package de.thws.lektion20aa.uebung1;

import java.util.Arrays;
import java.util.List;

public class Karte implements Comparable<Karte>{

    Farbe farbe;
    Wert wert;
    
    public Karte(Farbe f, Wert w) {
        this.farbe = f;
        this.wert = w;
    }
    
    @Override
    public int compareTo(Karte other) {
        List<Wert> wertReihenfolge = Arrays.asList(Wert.BUBE, Wert.ASS, Wert.ZEHN, Wert.KOENIG, Wert.DAME, Wert.NEUN, Wert.ACHT, Wert.SIEBEN, Wert.SIEBEN, Wert.SECHS, Wert.FUENF, Wert.VIER, Wert.DREI, Wert.ZWEI);
        List<Farbe> farbeReihenfolge = Arrays.asList(Farbe.KREUZ, Farbe.PIK, Farbe.HERZ, Farbe.KARO);

        int wertIndex1 = wertReihenfolge.indexOf(this.wert);
        int wertIndex2 = wertReihenfolge.indexOf(other.wert);
        int farbeIndex1 = farbeReihenfolge.indexOf(this.farbe);
        int farbeIndex2 = farbeReihenfolge.indexOf(other.farbe);

        if (wertIndex1 != wertIndex2)
            return Integer.compare(wertIndex1, wertIndex2);
        else
            return Integer.compare(farbeIndex1, farbeIndex2);
    }
    
    @Override
    public String toString() {
        return farbe + " " + wert;
    }
}
