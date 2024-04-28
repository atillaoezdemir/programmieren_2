package de.thws.lektion15;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class AngestellterTest {
    
    @Test
    public void abteilungsleiterTest(){
        Abteilungsleiter abteilungsleiter = new Abteilungsleiter("Mustermann" , "Max" , "123", "11.11.2011");
        Abteilung abteilung = new Abteilung(abteilungsleiter);
        assertEquals(4000, abteilungsleiter.getGehalt());
        Angestellter a = new Angestellter("Oezdemir", "Atilla", "1327", "10.09.2000");
        abteilungsleiter.befoerdert(a);
        assertEquals(2200, a.getGehalt());
    }

    @Test
    public void angestellterTest(){
        Angestellter a = new Angestellter("Oezdemir", "Atilla", "1327", "10.09.2000");
        assertEquals(a.getGeburtsDatum(), "10.09.2000");
        assertEquals(2000, a.getGehalt());
    }

    @Test
    public void abteilungTest(){
        Abteilungsleiter abteilungsleiter = new Abteilungsleiter("Mustermann" , "Max" , "123", "11.11.2011");
        Abteilung a = new Abteilung(abteilungsleiter);
        List<Angestellter> angestellten = new ArrayList<Angestellter>();
        angestellten.add(abteilungsleiter);
        assertEquals(a.getAngestellte(),angestellten);

    }
}
