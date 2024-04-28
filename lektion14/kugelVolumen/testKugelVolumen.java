package de.thws.lektion14aa.kugelVolumen;
import org.junit.jupiter.api.Test;
import static de.thws.lektion14aa.kugelVolumen.kugelVolumen.berechneKugelvolumen;
import static org.junit.jupiter.api.Assertions.*;

public class testKugelVolumen {
    @Test
    public void testNegativ(){
        try{
            berechneKugelvolumen(-1);
            fail("Exception erwartet!");
        }catch(RuntimeException e){
            String errorMesage = e.getMessage();
            assertEquals("Radius muss positiv sein!" , errorMesage);
        }
    }
    @Test
   public void testDouble(){
            assertEquals(4.18,berechneKugelvolumen(1.0),0.01);
    }
}
