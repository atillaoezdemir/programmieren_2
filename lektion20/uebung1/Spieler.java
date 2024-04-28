package de.thws.lektion20aa.uebung1;

import java.util.ArrayList;

public class Spieler {

    ArrayList<Karte> hand;
    Hauptdeck hauptdeck;
    
    public Spieler(Hauptdeck hd) {
        this.hauptdeck = hd;
    }
    
    public Spieler(ArrayList<Karte> k) {
        hand.addAll(k);
    }
    
    public void kartZiehenVonHd() {
        hand.add(hauptdeck.karteZiehen());
    }
    
    public void mehrereKarteZiehenVonHd(int karte) {
        for (int i = 0; i < karte; i++)
            kartZiehenVonHd();
    }
    
    public Karte karteGebenVonHand() {
        return hand.remove(hand.size() - 1);
    }
}
