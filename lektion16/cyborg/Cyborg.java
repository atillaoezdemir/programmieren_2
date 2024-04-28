package de.thws.lektion16.cyborg;
import java.util.Random;

public class Cyborg implements Reaktionsverhalten {
    
    private Reaktionsverhalten mensch;
    private Reaktionsverhalten roboter;

    public Cyborg(Reaktionsverhalten mensch, Reaktionsverhalten roboter) {
        this.mensch = mensch;
        this.roboter = roboter;
    }

    public Entscheidung entscheide(Gefahrensituation situation) {
        if (mensch.entscheide(situation).equals(roboter.entscheide(situation)))
            return mensch.entscheide(situation);
        
        else {
            Random random = new Random();
            
            if (random.nextInt(100) < 25)
                return Entscheidung.UNENTSCHIEDEN;
            
            else
                return random.nextBoolean() ? mensch.entscheide(situation) : roboter.entscheide(situation);
        }
    }
}
