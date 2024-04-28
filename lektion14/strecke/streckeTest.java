package de.thws.lektion14aa.strecke;

import com.sun.source.tree.AssertTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static de.thws.lektion14aa.strecke.strecke.ueberschneiden;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class streckeTest {
    
    @Test
    public void punkten(){
        strecke s = new strecke(3,1);
        assertEquals(s.anfangspunkt,1);
        assertEquals(s.endpunkt,3);
    }

    @Test
    public void testUeberschnedungen(){
        strecke erste = new strecke(1,5);
        strecke zweite = new strecke(5,19);
        assertTrue(ueberschneiden(erste, zweite));
    }

    @Test
    public void testUeberschnedungenZwei(){
        strecke erste = new strecke(7,10);
        strecke zweite = new strecke(5,19);
        assertTrue(ueberschneiden(erste, zweite));
    }

    @Test
    public void testUeberschnedungenDrei(){
        strecke erste = new strecke(1,9);
        strecke zweite = new strecke(5,19);
        assertTrue(ueberschneiden(erste, zweite));
    }
}
