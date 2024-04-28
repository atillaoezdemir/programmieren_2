package de.thws.klausurAufgaben.ss2017.nummer2;

public final class Position implements Comparable<Position> {
    
    protected int zeilennummer;
    protected int spaltennummer;

    public Position(int zeilennummer, int spaltennummer) {
        this.zeilennummer = zeilennummer;
        this.spaltennummer = spaltennummer;
    }

    public int compareTo(Position other) {

        // Vergleichskriterien: erst nach Zeilennummer, dann nach Spaltennummer
        if (zeilennummer != other.zeilennummer)
            return Integer.compare(zeilennummer, other.zeilennummer);
        
        return Integer.compare(spaltennummer, other.spaltennummer);
    }
}
