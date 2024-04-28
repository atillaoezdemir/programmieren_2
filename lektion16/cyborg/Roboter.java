package de.thws.lektion16.cyborg;

public class Roboter implements Reaktionsverhalten {
    
    public Entscheidung entscheide(Gefahrensituation situation) {
        return switch (situation) {
            case GEFAHR_LINKS -> Entscheidung.RECHTS;
            case GEFAHR_RECHTS -> Entscheidung.LINKS;
            case GEFAHR_VORNE -> Entscheidung.BREMSEN;
            default -> null;
        };
    }
}
