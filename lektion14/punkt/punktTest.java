package de.thws.lektion14aa.punkt;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class punktTest {
    
    private static Punkt p;
    
    @BeforeEach
    public void prepareTest(){
        p = new Punkt(); // p objesini burada oluşturuyoruz
    }

    @Test
    public void negativeX(){
        try{
            p.verschiebePunkt(-1, 1);
            fail("RuntimeException erwartet!");
        }catch(RuntimeException e){
            assertEquals("Ungültige Zahlen!", e.getMessage());
        }
    }

    @Test
    public void grosserX(){
        try{
            p.verschiebePunkt(1921,1);
            fail("RuntimeException erwartet!");
        }catch(RuntimeException e){
            assertEquals("Ungültige Zahlen!", e.getMessage());
        }
    }
}
