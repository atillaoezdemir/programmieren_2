package de.thws.klausursuebungen.mietwagen;

public class Fahrrad extends Fahrzeug {
    
    public Fahrrad() {
        super();
    }

    @Override
    public double berechneGeld(Fahrt f) {
        return f.min * 12.5;
    }
}
