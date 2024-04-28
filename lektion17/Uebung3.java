package de.thws.lektion17aa;

import java.io.*;
import java.util.Scanner;

public class Uebung3 {

    public static void ungepuffert(String path) {
        try(InputStream fis = new FileInputStream(path);
            OutputStream fos = new FileOutputStream("ungepuffert.mp3")) {
            int b;
            do {
                b = fis.read();
                if(b != -1)
                    fos.write(b);
            } while (b != -1);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void gepuffert(String path){
        try(FileInputStream fis = new FileInputStream(path);
            BufferedInputStream bis = new BufferedInputStream(fis);
            FileOutputStream fos = new FileOutputStream("gepuffert.mp3");
            BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            int b;
            do {
                b = bis.read();
                if(b != -1)
                    bos.write(b);
            } while(b != -1);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void byteUngepuffert(String path) {
        try(FileInputStream fis = new FileInputStream(path);
            FileOutputStream fos = new FileOutputStream("byteUngepuffert.mp3");) {
            byte[] b = new byte[1024];
            int n;
            do{
                n = fis.read(b);
                if(n != -1)
                    fos.write(b, 0, n);
            } while(n != -1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the path: ");
        String path = scanner.nextLine();

        long startUngepuffert = System.currentTimeMillis();
        for (int i = 0; i < 10; i++)
            ungepuffert(path);
        
        long endUngepuffert = System.currentTimeMillis();
        long duration = endUngepuffert - startUngepuffert;

        long startGepuffert = System.currentTimeMillis();
        for (int i = 0; i < 10; i++)
            gepuffert(path);
        
        long endGepuffert = System.currentTimeMillis();
        long duration2 = endGepuffert - startGepuffert;

        long startByte = System.currentTimeMillis();
        for (int i = 0; i < 10; i++)
            byteUngepuffert(path);
        
        long endByte = System.currentTimeMillis();
        long duration3 = endByte - startByte;

        System.out.println(duration);  //106850
        System.out.println(duration2); //773
        System.out.println(duration3); //183

        // path = C:\\Users\\Ati\\IdeaProjects\\programmieren2\\Beach.mp3
        }
}
