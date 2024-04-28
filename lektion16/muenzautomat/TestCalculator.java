package de.thws.lektion16aa.muenzautomat;

import de.thws.lektion16.muenzautomat.AdvancedChangeCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator {
    
    @Test
    public void testSimple() {
        SimpleChangeCalculator s = new SimpleChangeCalculator();
        int[] tmp = s.getChange(3,98);
        assertEquals(398,tmp[0]);
        assertEquals(0,tmp[7]);
    }

    @Test
    public void testAdvanced() {
        AdvancedChangeCalculator a = new AdvancedChangeCalculator();
        int[] tmp = a.getChange(3,98);
        assertEquals(1,tmp[0]);
        assertEquals(1,tmp[7]);
    }
}
