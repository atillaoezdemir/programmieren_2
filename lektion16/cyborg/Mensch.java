package de.thws.lektion16.cyborg;

public class Mensch implements Reaktionsverhalten {
    
    public Entscheidung entscheide(Gefahrensituation situation) {
        return switch (situation) {
            case GEFAHR_LINKS -> Entscheidung.RECHTS;
            case GEFAHR_RECHTS -> Entscheidung.LINKS;
            case GEFAHR_VORNE -> Entscheidung.BREMSEN;
            default -> Entscheidung.UNENTSCHIEDEN;
        };
    }
    
    public class Main {
    
        public static void main(String[] args) {
            int day = 3;

            switch (day) {
                case 1: System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid day!");
                    break;
            }
        }
    }
}
