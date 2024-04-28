package de.thws.lektion22aa.uebung2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class primzahlThread implements Runnable {
    List<Integer> list;
    HashMap<Integer, Boolean> ergebnis;

    public primzahlThread(List<Integer> list) {
        this.list = list;
    }
    
    public boolean isPrimzahl(int zahl) {
        if (zahl < 2)
            return false;
    
        for (int i = 2; i <= Math.sqrt(zahl); i++) {
            if (zahl % i == 0)
                return false;
        }
        return true;
    }
    
    public void run() {
        ergebnis = new HashMap<>();
    
        for (int zahl: list) {
            ergebnis.put(zahl,isPrimzahl(zahl));
        }
    }
    
    public static void main(String[] args) {
        List<Integer> ersteList = Arrays.asList(1, 2, 3, 4);
        List<Integer> zweiteList = Arrays.asList(5, 6, 7, 8);
        List<Integer> dritteList = Arrays.asList(9, 10, 11, 12);

        primzahlThread ersteP = new primzahlThread(ersteList);
        Thread erste = new Thread(ersteP);
        primzahlThread zweiteP = new primzahlThread(zweiteList);
        Thread zweite = new Thread(zweiteP);
        primzahlThread dritteP = new primzahlThread(dritteList);
        Thread dritte = new Thread(dritteP);

        erste.start();
        zweite.start();
        dritte.start();

        try {
            erste.join();
            zweite.join();
            dritte.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        HashMap<Integer, Boolean> gesamte = new HashMap<>();
        
        gesamte.putAll(ersteP.ergebnis);
        gesamte.putAll(zweiteP.ergebnis);
        gesamte.putAll(dritteP.ergebnis);
        
        for (Integer zahl : gesamte.keySet())
            System.out.println(zahl + " -> " + gesamte.get(zahl));
    }
}
