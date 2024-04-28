package de.thws.lektion20aa.uebung2;

public class main {
    
    public static void main(String[] args) {
        Karte k1 = new Karte(Farbe.PIK ,Wert.SIEBEN);
        Karte k2 = new Karte(Farbe.HERZ,Wert.SIEBEN);
    
        System.out.println(k1.compareTo(k2));
    }
}
