package de.thws.klausursuebungen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Finder {
    
    public static void main(String[] args) {
        Finder finder = new Finder();
        BufferedReader br = finder.getSystemInAsBufferedReader();
        String searchString;
        String[] fileNames = {"/Users/macbookpro/IdeaProjects/programmiren2/src/main/java/de/thws/klausurAufgaben/SS2020/file.txt",
                "/Users/macbookpro/IdeaProjects/programmiren2/src/main/java/de/thws/klausurAufgaben/SS2020/file2.txt"};
        try {
            System.out.println("Bitte Suchstring eingeben:");
            searchString = br.readLine();
            finder.findStringInFiles(searchString, fileNames);
            br.close();
        } catch (IOException ex) {
            System.out.println("Einlesen fehlgeschlagen.");
        }
    }

    public BufferedReader getSystemInAsBufferedReader() {
        return new BufferedReader(new InputStreamReader(System.in));
    }

    public void findStringInFiles(String searchString, String[] filenames) {
        for (String filename : filenames) {
            try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                String line;
                int lineNumber = 1;

                while ((line = reader.readLine()) != null) {
                    if (line.contains(searchString))
                        System.out.println("Treffer in Datei: " + filename + ", Zeile: " + lineNumber);

                    lineNumber++;
                }
            } catch (IOException e) {
                System.out.println("Fehler beim Lesen der Datei: " + filename + ". Fehlermeldung: " + e.getMessage());
            }
        }
    }
}
