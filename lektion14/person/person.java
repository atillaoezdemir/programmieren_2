package de.thws.lektion14aa.person;

public class person {
    String vorname;
    String nachname;
    adresse adresse;
    public static class adresse {
        String strasse;
        String hausnummer;
        int postleitzahl;
        String ort;

        public adresse(String strasse, String hausnummer, int postleitzahl, String ort) {
            if (('A' <= strasse.charAt(0) && strasse.charAt(0) <= 'Z') && ('A' <= ort.charAt(0) && ort.charAt(0) <= 'Z') && ('0' <= hausnummer.charAt(0) && hausnummer.charAt(0) <= '9')) {
                this.strasse = strasse;
                this.hausnummer = hausnummer;
                this.postleitzahl = postleitzahl;
                this.ort = ort;
            } else throw new RuntimeException("Strasse und Ort muss mit einem Großbuchstaben, Hausnummer muss mit einer Ziffer beginnen!");
        }
    }
    person(String vorname, String nachname, adresse adresse){
        if(('A'<=vorname.charAt(0) && vorname.charAt(0)<='Z') && ('A'<=nachname.charAt(0) && nachname.charAt(0)<='Z')){
            this.vorname = vorname;
            this.nachname = nachname;
            this.adresse = adresse;
        }
        else throw new RuntimeException("Vorname und Nachname muss mit einem Großbuchstaben beginnen!");
    }
}
