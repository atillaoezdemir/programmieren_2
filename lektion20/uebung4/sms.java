package de.thws.lektion20aa.uebung4;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class sms {
    Map<Character, Character> multiMap;
    public sms() {
        multiMap = new HashMap<>();
        multiMap.put('A', '2');
        multiMap.put('B', '2');
        multiMap.put('C', '2');
        multiMap.put('D', '3');
        multiMap.put('E', '3');
        multiMap.put('F', '3');
        multiMap.put('G', '4');
        multiMap.put('H', '4');
        multiMap.put('I', '4');
        multiMap.put('J', '5');
        multiMap.put('K', '5');
        multiMap.put('L', '5');
        multiMap.put('M', '6');
        multiMap.put('N', '6');
        multiMap.put('O', '6');
        multiMap.put('P', '7');
        multiMap.put('Q', '7');
        multiMap.put('R', '7');
        multiMap.put('S', '7');
        multiMap.put('T', '8');
        multiMap.put('U', '8');
        multiMap.put('V', '8');
        multiMap.put('W', '9');
        multiMap.put('X', '9');
        multiMap.put('Y', '9');
        multiMap.put('Z', '9');
    }

    public char getir(char zeichen) throws IllegalTelephoneNumberException {
        if(multiMap.getOrDefault(Character.toUpperCase(zeichen), '1') != '1')
            return multiMap.get(Character.toUpperCase(zeichen));
        else throw new IllegalTelephoneNumberException("Ungültige Ziffere: ");
    }

    protected static class IllegalTelephoneNumberException extends Throwable {
        public IllegalTelephoneNumberException(String message) {
            super(message);
        }
    }

    public void leserUndSchreiber() throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("characters.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("numbers.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                int i = 0;
                while (i < line.length()) {
                    try {
                        char ziffer = getir(line.charAt(i));
                        bufferedWriter.write((byte) ziffer);
                    } catch (IllegalTelephoneNumberException e) {
                        System.out.println("Ungültige Ziffer: " + line.charAt(i));
                    } finally {
                        i++;
                    }
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        sms sms = new sms();
        String line;
        try (FileWriter writer = new FileWriter("characters.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            String characters = "123aãbcdef123ghi";
            bufferedWriter.write(characters);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sms.leserUndSchreiber();
        try (FileReader reader = new FileReader("numbers.txt");
             BufferedReader bufferedReader = new BufferedReader(reader)){
            while ((line = bufferedReader.readLine()) != null) {
                assertEquals("222333444", line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

