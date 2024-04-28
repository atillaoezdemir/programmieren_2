package de.thws.lektion20aa.uebung4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class test {
    private sms sms;
    String line;
    @BeforeEach
    public void prepare() {
        line = null;
        sms = new sms();
    }
    @Test
    public void testMultiMap() {
        assertEquals('2', sms.multiMap.get('A'));
        assertEquals(null, sms.multiMap.get('a'));
    }

    @Test
    public void testGetir() throws sms.IllegalTelephoneNumberException {
        assertEquals('2', sms.getir('b'));
        assertEquals('8', sms.getir('T'));
    }

    @Test
    public void testLeserundSchreiber() throws IOException {
        try (FileWriter writer = new FileWriter("characters.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            String characters = "abcdefghi";
            bufferedWriter.write(characters);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sms.leserUndSchreiber();
        try (FileReader reader = new FileReader("numbers.txt");
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            while ((line = bufferedReader.readLine()) != null) {
                assertEquals("222333444", line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testLeserundSchreiberFalsch() throws IOException {
        try (FileWriter writer = new FileWriter("characters.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            String characters = "12abc2abcc";
            bufferedWriter.write(characters);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sms.leserUndSchreiber();
        try (FileReader reader = new FileReader("numbers.txt");
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            while ((line = bufferedReader.readLine()) != null) {
                assertEquals("2222222", line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
