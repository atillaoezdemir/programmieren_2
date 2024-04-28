package de.thws.klausursuebungen.mietwagen;

import static de.thws.klausurAufgaben.Mietwagen.Fahrzeug.fahrtenbuch;
import static de.thws.klausurAufgaben.Mietwagen.Fahrzeug.fahrzeuge;

public class Umsatzberechner {
    
    public double gesamtUmsatz() {
        double wert = 0;

        for (int i = 0; i < fahrzeuge.size(); i++)
            wert += fahrzeuge.get(i).berechneGeld(fahrtenbuch.get(fahrzeuge.get(i)));
        
        return wert;
    }

    public double elektroUmsatz() {
        double wert = 0;

        for (int i = 0; i < fahrzeuge.size(); i++) {
            if (fahrzeuge.get(i) instanceof ElektroFahrzeug)
                wert += fahrzeuge.get(i).berechneGeld(fahrtenbuch.get(fahrzeuge.get(i)));
        }
        
        return wert;
    }
}
