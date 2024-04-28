package de.thws.klausursuebungen.morse;

import java.util.HashMap;

public class Morse {

    public static String charToMorseCode(char c) {
        String morseCode = switch (c) {
            case 'A' -> ".-";
            case 'B' -> "−...";
            case 'C' -> "−.-.";
            case 'D' -> "-..";
            case 'E' -> ".";
            case 'F' -> "..-.";
            case 'G' -> "--.";
            case 'H' -> "....";
            case 'I' -> "..";
            case 'J' -> ".---";
            case 'K' -> "_._";
            case 'L' -> ".-..";
            case 'M' -> "--";
            case 'N' -> "-.";
            case 'O' -> "---";
            case 'P' -> ".--.";
            case 'Q' -> "--.-";
            case 'R' -> ".-.";
            case 'S' -> "...";
            case 'T' -> "-";
            case 'U' -> "..-";
            case 'V' -> "...-";
            case 'W' -> ".--";
            case 'X' -> "-..-";
            case 'Y' -> "-.--";
            case 'Z' -> "--..";
            default -> throw new RuntimeException("Unexpected value: " + c);
        };
        return morseCode;
    }

    public static HashMap<String, String> getMorsCodeMap() {
        HashMap<String, String> morseCodeMap = new HashMap<>();
        char[] validChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        
        for (char c : validChars)
            morseCodeMap.put(String.valueOf(c), charToMorseCode(c));
        
        return morseCodeMap;
    }

    public static String zeichenketteToMorse(String s) throws RuntimeException {
        String folge = "";
       
        for (char c : s.toCharArray()) {
            folge += String.valueOf(charToMorseCode(c));
            folge += " ";
        }
        
        return folge;
    }
}
