package de.thws.klausursuebungen.ss2020.nummer1;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class TestLies {

    @Test
    void testLiesKonfigurationsdatei() {
        try {
            Map<String, String> konfigurationMap = Methode.liesKonfigurationsdatei();
            assertEquals("smtp", konfigurationMap.get("mail.transport.protocol"));
            assertEquals("K[O8a}5#", konfigurationMap.get("password"));
        } catch (IOException e) {
            fail("IOException beim Lesen der Konfigurationsdatei!");
        }
    }
}
