package de.thws.klausursuebungen.musikstuecksammlung;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class testSammlung {
    
    @Test
    public void testSammlung() {
        MusikStueckSammlung ms = new MusikStueckSammlung();
        MusikStueck m1 = new MusikStueck("Nazende Sevgilim", "Figen Genç", 4);
        MusikStueck m2 = new MusikStueck("Antidepresan Gülümsemesi", "Model", 4);
        MusikStueck m3 = new MusikStueck("El Gibi", "Sezen Aksu", 4);
    
        ms.musikStueckEinfügen(m1);
        ms.musikStueckEinfügen(m2);
        ms.musikStueckEinfügen(m3);
        
        MusikStueck[] erwartet = {m2, m3, m1};
        
        assertArrayEquals(erwartet, ms.getAlleMusikStueckeNachTitel());
        
        MusikStueck[] alle = ms.getAlleMusikStueckeNachTitel();
        
        for (MusikStueck eine : alle)
            System.out.printf("%-20s sings %-20s%n", eine.interpret, eine.titel);
    }
}
