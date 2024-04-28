package de.thws.lektion20aa.uebung2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Karte implements Comparable<Karte> {
    
    Farbe farbe;
    Wert wert;
    
    public Karte(Farbe farbe, Wert wert) {
        this.farbe = farbe;
        this.wert = wert;
    }
    
    public int compareTo(Karte other) {
        List<Karte> reihenfolgeBube = Arrays.asList(new Karte(Farbe.KREUZ, Wert.BUBE), new Karte(Farbe.PIK, Wert.BUBE), new Karte(Farbe.HERZ, Wert.BUBE), new Karte(Farbe.KARO, Wert.BUBE));
        List<Farbe> reihenfolgeFarbe = Arrays.asList(Farbe.KREUZ, Farbe.PIK, Farbe.HERZ, Farbe.KARO);
        List<Wert> reihenfolgeWert = Arrays.asList(Wert.ASS, Wert.ZEHN, Wert.KOENIG, Wert.DAME, Wert.NEUN, Wert.ACHT, Wert.SIEBEN);

        int karteIndex1 = reihenfolgeBube.indexOf(this);
        int karteIndex2 = reihenfolgeBube.indexOf(other);
        int farbeIndex1 = reihenfolgeFarbe.indexOf(this.farbe);
        int farbeIndex2 = reihenfolgeFarbe.indexOf(other.farbe);
        int wertIndex1 = reihenfolgeWert.indexOf(this.wert);
        int wertIndex2 = reihenfolgeWert.indexOf(other.wert);

        if (karteIndex1 != karteIndex2) 
            return Integer.compare(karteIndex1, karteIndex2);
        else if (farbeIndex1 != farbeIndex2)
            return Integer.compare(farbeIndex1, farbeIndex2);
        else
            return Integer.compare(wertIndex1, wertIndex2);
    }
}
