package de.thws.lektion17;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Uebung2 {

        @Test
        public void testWriteWithNullArray() {
            try {
                OutputStream outputStream = new ByteArrayOutputStream();
                outputStream.write(null, 0, 1);
                fail("Expected NullPointerException not thrown");
            } catch (IOException e) {
                fail("Unexpected IOException thrown");
            } catch (NullPointerException e) {
                // expected
            }
        }
        
        @Test
        public void testWriteWithNegativeOffset() {
            try {
                OutputStream outputStream = new ByteArrayOutputStream();
                outputStream.write(new byte[10], -1, 5);
                fail("Expected IndexOutOfBoundsException not thrown");
            } catch (IOException e) {
                fail("Unexpected IOException thrown");
            } catch (IndexOutOfBoundsException e) {
                // expected
            }
        }
        
        @Test
        public void testWriteWithInvalidLength() {
            try {
                OutputStream outputStream = new ByteArrayOutputStream();
                outputStream.write(new byte[10], 5, 10);
                fail("Expected IndexOutOfBoundsException not thrown");
            } catch (IOException e) {
                fail("Unexpected IOException thrown");
            } catch (IndexOutOfBoundsException e) {
                // expected
            }
        }
}
