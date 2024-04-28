package de.thws.lektion14aa.person;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class personTest {
    public static person p;

    @Test
    public void kleinVornameTest(){
        try {
            person.adresse adresse = new person.adresse("Landsteiner", "31", 97074, "Würzburg");
            p = new person("atilla", "Oezdemir", adresse);
            fail("RuntimeException erwartet!");
        }catch (RuntimeException e){
            assertEquals("Vorname und Nachname muss mit einem Großbuchstaben beginnen!", e.getMessage());
        }
    }

    @Test
    public void kleinStrasseTest(){
        try{
            person.adresse adresse = new person.adresse("landsteiner", "31", 97074, "Würzburg");
            p = new person("Atilla", "Oezdemir", adresse);
            fail("RuntimeException erwartet!");
        }catch(RuntimeException e){
            assertEquals("Strasse und Ort muss mit einem Großbuchstaben, Hausnummer muss mit einer Ziffer beginnen!", e.getMessage());
        }
    }

    @Test
    public void falschHausnummer(){
        try{
            person.adresse adresse = new person.adresse("landsteiner", "a31", 97074, "Würzburg");
            p = new person("Atilla", "Oezdemir", adresse);
            fail("RuntimeException erwartet!");
        }catch(RuntimeException e){
            assertEquals("Strasse und Ort muss mit einem Großbuchstaben, Hausnummer muss mit einer Ziffer beginnen!", e.getMessage());
        }
    }
}
