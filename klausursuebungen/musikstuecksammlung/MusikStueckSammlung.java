package de.thws.klausursuebungen.musikstuecksammlung;

import java.util.HashMap;
import java.util.List;

public class MusikStueckSammlung {

    private final HashMap<String, MusikStueck> sammlung = new HashMap<>();

    public void musikStueckEinfügen(MusikStueck neu) {
        if (sammlung.containsKey(neu.titel))
            throw new IllegalArgumentException("Diese Titel ist schonn in der Sammlung!");
    
        sammlung.put(neu.titel, neu);
    }

    public MusikStueck[] getAlleMusikStueckeNachTitel() {
        List<MusikStueck> sorted = sammlung.values()
                .stream()
                .sorted(new VergleicheMusikStueckTitel())
                .toList();
        return sorted.toArray(new MusikStueck[0]);
    }
}
