package de.thws.lektion21aa.builder;

public class yemek {
    
    double portionsgroesse;
    double anzahlPortionen;
    double eiweiss;
    double fett;

    private yemek(double portionsgroesse, double anzahlPortionen, double eiweiss, double fett) {
        this.portionsgroesse = portionsgroesse;
        this.anzahlPortionen = anzahlPortionen;
        this.eiweiss = eiweiss;
        this.fett = fett;
    }

    public static void main(String[] args) {
        yemek misss = new yemekBuilder(1.5, 2)
                .withEiweiss(50)
                .withFett(50)
                .build();

        System.out.println(misss.portionsgroesse);
    }

    public static class yemekBuilder {
        double portionsgroesse;
        double anzahlPortionen;
        double eiweiss;
        double fett;

        public yemekBuilder(double portionsgroesse, double anzahlPortionen) {
            this.portionsgroesse = portionsgroesse;
            this.anzahlPortionen = anzahlPortionen;
        }

        public yemekBuilder withEiweiss(double eiweiss) {
            this.eiweiss = eiweiss;
            return this;
        }

        public yemekBuilder withFett(double fett) {
            this.fett = fett;
            return this;
        }

        public yemek build() {
            return new yemek(portionsgroesse, anzahlPortionen, eiweiss, fett);
        }
    }
}
