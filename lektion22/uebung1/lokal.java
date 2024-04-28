package de.thws.lektion22aa.uebung1;

public class lokal {

    public static void main(String[] args) {
    
        class localClass extends Thread {
            String msg;
        
            public localClass(String msg) {
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
        }
        
        localClass yang = new localClass("Yang");
        localClass ying = new localClass("Ying");

        yang.start();
        ying.start();
    }
}
