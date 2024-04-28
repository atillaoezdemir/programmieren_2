package de.thws.lektion20aa.uebung1;

import java.util.ArrayList;
import java.util.Collections;

public class Hauptdeck extends ArrayList<Karte> {

    public Hauptdeck() {
        super();
        erstelle();
    }
    
    public void erstelle() {
        for (Farbe farbe : Farbe.values())
            for (Wert wert : Wert.values())
                super.add(new Karte(farbe, wert));
    }
    
    public void mix() {
        Collections.shuffle(this);
    }
    
    public Karte karteZiehen() {
        return this.remove(this.size() - 1);
    }
}
