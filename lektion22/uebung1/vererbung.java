package de.thws.lektion22aa.uebung1;

public class vererbung extends Thread {

    private String msg;
    
    public vererbung(String msg) {
        this.msg = msg;
    }
    
    public void run() {
        while (true) {
            System.out.println(msg);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    
    public static void main(String[] args) {
        vererbung yangThread = new vererbung("Yang");
        vererbung yingThread = new vererbung("Ying");

        yangThread.start();
        yingThread.start();
    }
}
