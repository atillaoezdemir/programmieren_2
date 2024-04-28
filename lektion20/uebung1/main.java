package de.thws.lektion20aa.uebung1;

public class main {
    
    public static void main(String[] args) {
    
        Hauptdeck hauptdeck = new Hauptdeck();
        
        Spieler ati = new Spieler(hauptdeck);
        
        Spieler osman = new Spieler(hauptdeck);
        Spieler kemal = new Spieler(hauptdeck);
        Spieler oyku = new Spieler(hauptdeck);
        
        hauptdeck.mix();
        
        ati.mehrereKarteZiehenVonHd(13);
        osman.mehrereKarteZiehenVonHd(13);
        kemal.mehrereKarteZiehenVonHd(13);
        oyku.mehrereKarteZiehenVonHd(13);
        
        for (int i = 0; i < 13; i++)
            System.out.println(kemal.hand.get(i));
        
        for (int i = 0; i < 13; i++)
            System.out.println(oyku.hand.get(i));
        
        for (int i = 0; i < 13; i++)
            System.out.println(ati.hand.get(i));
        
        for (int i = 0; i < 13; i++)
            System.out.println(osman.hand.get(i));
    }
}
