package de.thws.klausursuebungen.ss2017.nummer1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IBAN {

    public static boolean ibanCheck(String iban) throws wrongIBANException {
        if (iban.charAt(0) == 'D' && iban.charAt(1) == 'E' && iban.length() == 22) {
        } else
            throw new wrongIBANException("Ungültige IBAN: " + iban);
        return true;
    }

    public static void ibanAusDateiLesen(String dateiname) throws wrongIBANException {
        try (BufferedReader reader = new BufferedReader(new FileReader(dateiname))) {
            String iban;
            while ((iban = reader.readLine()) != null) {
                try {
                    if (ibanCheck(iban)) {
                        System.out.println("Gültige IBAN: " + iban);
                    }
                } catch (wrongIBANException e) {
                    System.err.println(e.getMessage());
                }
            }
            System.out.println("Alle IBANs in der Datei sind gültig.");
        } catch (FileNotFoundException e) {
            System.err.println("Datei " + dateiname + " nicht gefunden");
        } catch (IOException e) {
            System.err.println("Fehler beim Lesevorgang von Datei: " + dateiname);
        } catch (NullPointerException e) {
            System.err.println("Datei " + dateiname + " existiert nicht");
        }
    }

    public void dateienTest(String[] dateinamen) {
        for (String dateiname : dateinamen) {
            try {
                ibanAusDateiLesen(dateiname);
            } catch (wrongIBANException e) {
                System.err.println("Datei " + dateiname + " enthält ungültige IBANs!");
            }
        }
    }
}