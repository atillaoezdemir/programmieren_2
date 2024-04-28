package de.thws.lektion17aa;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDoubler {
    
    FileOutputStream os1;
    FileOutputStream os2;
    
    public OutputStreamDoubler(FileOutputStream os1, FileOutputStream os2) {
        this.os1 = os1;
        this.os2 = os2;
    }

    public void close() throws IOException {
        IOException ex1 = null;
        IOException ex2 = null;

        try {
            os1.close();
        } catch (IOException e) {
            ex1 = e;
        }

        try {
            os2.close();
        } catch (IOException e) {
            ex2 = e;
        }

        String msg = "";
        
        if (ex1 != null)
            msg += "Error closing first Stream" + ex1.getMessage() + "\n";
        
        if (ex2 != null)
            msg += "Error closing second stream" + ex2.getMessage() + "\n";
        throw new IOException(msg);
    }

    public void write(int b) {
        try {
            os1.write(b);
        } catch (IOException e) {
            System.out.println("Exception while writing to OutputStream 1:");
            e.printStackTrace();
        }
        try {
            os2.write(b);
        } catch (IOException e) {
            System.out.println("Exception while writing to OutputStream 2:");
            e.printStackTrace();
        }
    }
    
    public static void main(String args[]) {
            FileOutputStream fos1 = null;
            FileOutputStream fos2 = null;
            OutputStreamDoubler doubler = null;

            try {
                fos1 = new FileOutputStream("file1.txt" , false);
                fos2 = new FileOutputStream("file2.txt", false);
                doubler = new OutputStreamDoubler(fos1, fos2);
                doubler.write(666);
            } catch (IOException e) {
                System.err.println("Error writing to file: " + e.getMessage());
            } finally {
                if (doubler != null) {
                    try {
                        doubler.close();
                    } catch (IOException e) {
                        System.err.println("Error closing OutputStreamDoubler: " + e.getMessage());
                    }
                }
    
                if (fos1 != null) {
                    try {
                        fos1.close();
                    } catch (IOException e) {
                        System.err.println("Error closing first FileOutputStream: " + e.getMessage());
                    }
                }
                
                if (fos2 != null) {
                    try {
                        fos2.close();
                    } catch (IOException e) {
                        System.err.println("Error closing second FileOutputStream: " + e.getMessage());
                    }
                }
            }
    }
}
