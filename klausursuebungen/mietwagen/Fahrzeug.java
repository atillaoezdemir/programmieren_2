package de.thws.klausursuebungen.mietwagen;

import java.util.HashMap;
import java.util.List;

public abstract class Fahrzeug {
    
    static List<Fahrzeug> fahrzeuge;
    static HashMap<Fahrzeug, Fahrt> fahrtenbuch;

    public Fahrzeug() {
        fahrzeuge.add(this);
    }

    public abstract double berechneGeld(Fahrt f);

    public void fahrtenBuchEintragen(Fahrt f) {
        fahrtenbuch.put(this, f);
    }
}
