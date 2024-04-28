package de.thws.lektion15;

public class Abteilungsleiter extends Angestellter {

    Abteilungsleiter(String nachname, String Vorname, String Identifikator, String GeburtsDatum) {
        super(nachname, Vorname, Identifikator, GeburtsDatum);
        this.Gehaltsfaktor = 2.0;
        updateGehalt();
    }
    
    public final void befoerdert(Angestellter a){
        a.Gehaltsfaktor *= 1.1;
        a.updateGehalt();
    }
}
