package de.thws.lektion15;

import java.util.Date;

public class Angestellter {

    private final String Nachname;
    private final String Vorname;
    private final String Identifikator;
    private final int Grundgehalt = 2000;
    protected double Gehaltsfaktor = 1;
    private final String GeburtsDatum;
    private double Gehalt = Grundgehalt * Gehaltsfaktor;

    Angestellter(String nachname, String Vorname, String Identifikator, String GeburtsDatum) {
        this.Nachname = nachname;
        this.Vorname = Vorname;
        this.Identifikator = Identifikator;
        this.GeburtsDatum = GeburtsDatum;
    }

    protected void updateGehalt() {
        Gehalt = Grundgehalt * Gehaltsfaktor;
    }

    public void setGehaltsfaktor(double gehaltsfaktor) {
        Gehaltsfaktor = gehaltsfaktor;
        updateGehalt();
    }

    public String getNachname() {
        return Nachname;
    }

    public String getVorname() {
        return Vorname;
    }

    public String getIdentifikator() {
        return Identifikator;
    }

    public int getGrundgehalt() {
        return Grundgehalt;
    }

    public double getGehaltsfaktor() {
        return Gehaltsfaktor;
    }

    public String getGeburtsDatum() {
        return GeburtsDatum;
    }

    public double getGehalt() {
        return Gehalt;
    }
}
