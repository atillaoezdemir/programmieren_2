package de.thws.klausursuebungen.ss2020.nummer4;

import java.io.Serializable;
import java.util.List;

public class Spieldaten implements Serializable {
    int geld;
    List<String> spielerIDs;

    private Spieldaten(int geld, List<String> spielerIDs) {
        this.geld = geld;
        this.spielerIDs = spielerIDs;
    }

    public static void main(String[] args) {
        Spieldaten.SpieldatenBuilder builder = new Spieldaten.SpieldatenBuilder();
        Spieldaten daten = builder.geld(1000)
                .add("abc")
                .add("xyz")
                .build();
    }

    public static class SpieldatenBuilder {
        int geld;
        List<String> spielerIDs;

        public SpieldatenBuilder geld(int geld) {
            this.geld = geld;
            return this;
        }

        public SpieldatenBuilder add(String spielerID) {
            this.spielerIDs.add(spielerID);
            return this;
        }

        public Spieldaten build() {
            return new Spieldaten(geld, spielerIDs);
        }
    }
}
