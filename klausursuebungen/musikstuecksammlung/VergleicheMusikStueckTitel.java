package de.thws.klausursuebungen.musikstuecksammlung;

import java.util.Comparator;

public class VergleicheMusikStueckTitel implements Comparator<MusikStueck> {
    
    @Override
    public int compare(MusikStueck o1, MusikStueck o2) {
        return o1.titel.compareTo(o2.titel);
    }
}
