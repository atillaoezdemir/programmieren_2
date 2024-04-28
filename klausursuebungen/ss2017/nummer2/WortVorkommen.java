package de.thws.klausurAufgaben.ss2017.nummer2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WortVorkommen {
    
    private final Map<Wort, List<Position>> wortPositionen;

    public WortVorkommen() {
        wortPositionen = new HashMap<>();
    }

    public void einfuegen(Wort wort, Position position) {
        List<Position> positionen = wortPositionen.get(wort);
        
        if (positionen == null)
            positionen = new ArrayList<>();
        
        positionen.add(position);
        wortPositionen.put(wort, positionen);
    }

    public List<Position> holeAlle(Wort wort) {
        List<Position> positionen = wortPositionen.get(wort);
        
        if (positionen.size() == 0)
            return new ArrayList<>();
        
        return positionen;
    }

    public Position holeLetztePosition(Wort wort) {
        List<Position> positionen = wortPositionen.get(wort);
        
        if (positionen.size() != 0)
            return positionen.get(positionen.size() - 1);
    
        return null;
    }

    public int anzahlVorkommen(Wort wort) {
        return wortPositionen.get(wort).size();
    }
}
