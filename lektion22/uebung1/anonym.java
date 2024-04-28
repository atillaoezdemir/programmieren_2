package de.thws.lektion22aa.uebung1;

public class anonym {

    public static void main(String[] args) {
        Thread yang = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    System.out.println("Yang");
                    try{
                        Thread.sleep(500);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread ying = new Thread(new Runnable() {
            public void run() {
                System.out.println("Ying");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        yang.start();
        ying.start();
    }
}
