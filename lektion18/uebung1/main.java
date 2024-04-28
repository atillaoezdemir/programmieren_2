package de.thws.lektion18aa.uebung1;
import java.io.*;

public class main {

    static void splitStudiengaenge(String path) throws IOException, matrikelNummerException{
        try (BufferedReader br = new BufferedReader(new FileReader(path));
             BufferedWriter inf = new BufferedWriter(new FileWriter("inf.txt"));
             BufferedWriter ec = new BufferedWriter(new FileWriter("ec.txt") );
             BufferedWriter winf = new BufferedWriter(new FileWriter("winf.txt"))) {
    
            do {
                String line = br.readLine();
                if (line == null || line.isEmpty()) 
                    break;
                
                try {
                    int matrikelNummer = Integer.parseInt(line);
                
                    if (matrikelNummer >= 5000000 && Integer.parseInt(line) <= 5099999) {
                        winf.write(line);
                        winf.newLine();
                    } else if (matrikelNummer >= 5100000 && Integer.parseInt(line) <= 5199999) {
                        inf.write(line);
                        inf.newLine();
                    } else if (matrikelNummer >= 6100000 && Integer.parseInt(line) <= 6199999) {
                        ec.write(line);
                        ec.newLine();
                    } else
                        throw new matrikelNummerException("Ungültige Matrikelnummer: " + line);
                } catch (NumberFormatException e) {
                    System.err.println("NumberFormatException: " + e.getMessage());
                }
            } while (true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    public static void main(String[] args) {
        try {
            splitStudiengaenge("C:\\Users\\Ati\\IdeaProjects\\programmieren2\\nums.txt");
        } catch (IOException | matrikelNummerException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
