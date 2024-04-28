package de.thws.klausursuebungen.mietwagen;

public class Motoroller extends Fahrzeug {
    
    public Motoroller() {
        super();
    }

    @Override
    public double berechneGeld(Fahrt f) {
        return f.km * 3.15;
    }
}
