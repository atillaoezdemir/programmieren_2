package de.thws.lektion22aa.uebung1;

public class nterface implements Runnable {

    private String msg;
    
    public nterface(String msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        while(true) {
            System.out.println(msg);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new nterface("ying"));
        Thread t2 = new Thread(new nterface("yang"));

        t1.start();
        t2.start();
    }
}
