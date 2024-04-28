package de.thws.lektion15;

import java.util.ArrayList;
import java.util.List;

public class Abteilung {
    
    private Abteilungsleiter abteilungsleiter;
    private List<Angestellter> angestellten;
    
    public Abteilung(Abteilungsleiter abteilungsleiter) {
        this.abteilungsleiter = abteilungsleiter;
        this.angestellten = new ArrayList<>();
        angestellten.add(abteilungsleiter);
    }
    
    public void addAngestellter(Angestellter angestellter) {
        angestellten.add(angestellter);
    }
    
    public Abteilungsleiter getAbteilungsleiter() {
        return abteilungsleiter;
    }
    
    public List<Angestellter> getAngestellte() {
        return angestellten;
    }
}
