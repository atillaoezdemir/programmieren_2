package de.thws.klausursuebungen.ss2017.nummer1;

import org.junit.jupiter.api.Test;

import static de.thws.klausurAufgaben.SS2017.Nummer1.IBAN.ibanCheck;
import static org.junit.jupiter.api.Assertions.*;

public class IbanCheckTest {
    
    @Test
    public void testIbanCheckWithValidIban() {
        try {
            boolean result = ibanCheck("DE2130120400000BYI1522");
            assertTrue(result);
        } catch (wrongIBANException e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    public void testIbanCheckWithInvalidIban() {
        try {
            boolean result = ibanCheck("DE1234567890");
            fail("Expected exception not thrown.");
        } catch (wrongIBANException e) {
            assertEquals("DE2130120400000BYI15220", e.getMessage());
        }
    }
}
