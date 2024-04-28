package de.thws.klausursuebungen.ss2020.nummer1;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Methode {
    
    public static Map<String, String> liesKonfigurationsdatei() throws IOException {
    
        Map<String, String> konfigurationMap = new HashMap<>();

        List<String> zeilen = liesKonfigurationsdateiIntern();

        for (String zeile : zeilen) {
            int gleichheitszeichenIndex = zeile.indexOf('=');
            String key = zeile.substring(0, gleichheitszeichenIndex);
            String value = zeile.substring(gleichheitszeichenIndex + 1);
            konfigurationMap.put(key, value);
        }
        
        return konfigurationMap;
    }

    private static List<String> liesKonfigurationsdateiIntern() throws IOException {
        // Hier wird angenommen, dass die Datei bereits zeilenweise eingelesen wird und in einer List<String> gespeichert ist.
        return null;
    }

    public static void main(String[] args) {
        
        String nimet = "abc=def";
        System.out.println(nimet.substring(0, nimet.indexOf('=')));
        System.out.println(nimet.substring(nimet.indexOf('=') + 1));
    }
}
