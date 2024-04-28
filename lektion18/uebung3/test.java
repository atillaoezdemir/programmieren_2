package de.thws.lektion18aa.uebung3;

import java.io.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class test {
    
    ToUpperCaseWriter writer;
    ByteArrayOutputStream baos;

    @BeforeEach
    public void prepareTest() {
        baos = new ByteArrayOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(baos);
        writer = new ToUpperCaseWriter(osw);
    }

    public void testChar (String expected, char c) {
        try {
            writer.write(c);
            writer.flush();
            writer.close();
            assertEquals(expected, baos.toString());
        } catch (IOException e) {
            fail("IOException" + e.getMessage());
        }
    }

    @Test
    public void testAllAlphabeticChar() {
        for (char c = 'a'; c <= 'z'; c++) {
            prepareTest();
            testChar(String.valueOf(Character.toUpperCase(c)), c);
            cleanUp();
        }
    }

    @Test
    public void testAllNonalphabeticChar() {
        for (int i = 0; i < 128; i++) {
            char c = (char) i;
            if (!Character.isLetter(c)) {
                prepareTest();
                testChar(String.valueOf(c) , c);
                cleanUp();
            }
        }
    }

    @AfterEach
    public void cleanUp() {
        try {
            writer.close();
        } catch (IOException e) {
            fail("IOEXception" + e.getMessage());
        }
    }
}
