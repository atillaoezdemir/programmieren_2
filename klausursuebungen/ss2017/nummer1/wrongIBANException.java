package de.thws.klausursuebungen.ss2017.nummer1;

public class wrongIBANException extends Exception {
    
    wrongIBANException() {
        super("FEHLER: Datei enthält ungültige IBAN!");
    }

    wrongIBANException(String msg) {
        super(msg);
    }
}
