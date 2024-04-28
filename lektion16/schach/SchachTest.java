package de.thws.lektion16.schach;

import static org.junit.jupiter.api.Assertions.*;
import de.thws.lektion14.Strecke;
import org.junit.jupiter.api.Test;

public class SchachTest {
    TurmImpl t = new TurmImpl(4, 4);
    LaeuferImpl l = new LaeuferImpl(4, 4);
    Dame d = new Dame(4, 4);

    @Test
    public void korrektenFelderTurm() {
        Brett testTurm = t.gibErlaubteFelder();
        assertTrue(testTurm.brett[3][3]);
        assertTrue(testTurm.brett[3][7]);
        assertTrue(testTurm.brett[7][3]);
    }

    @Test
    public void korrektenFelderLaeufer () {
        Brett testLaufer = l.gibErlaubteFelder();
        assertTrue(testLaufer.brett[3][3]);
        assertTrue(testLaufer.brett[7][7]);
        assertTrue(testLaufer.brett[6][0]);
        }
    
    @Test
    public void korrektenFelderDame () {
        Brett testDame = d.gibErlaubteFelder();
        assertTrue(testDame.brett[3][3]);
        assertTrue(testDame.brett[0][6]);
        assertTrue(testDame.brett[3][0]);
        }
    
    @Test
    public void falscheImplementierung() {
        try {
            Dame testDame = new Dame(0, 4);
            fail("Runtime Exception erwartet!");
        }catch (RuntimeException e){
            String errorMessage = e.getMessage();
            assertEquals("Es muss 1 <= x <= 8 sein!", errorMessage);
        }
        try {
            Dame testDamee = new Dame(4, 9);
            fail("Runtime Exception erwartet!");
        }catch (RuntimeException e){
            String errorMessage = e.getMessage();
            assertEquals("Es muss 1 <= y <= 8 sein!", errorMessage);
        }
    }
}
