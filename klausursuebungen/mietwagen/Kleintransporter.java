package de.thws.klausursuebungen.mietwagen;

public class Kleintransporter extends Fahrzeug {
    
    public Kleintransporter() {
        super();
    }

    @Override
    public double berechneGeld(Fahrt f) {
        if (f.min <= 60)
            return 0.3 * f.min;
            
        else
            return 25 * (f.min - 60) + 30 * f.km;
    }
}
