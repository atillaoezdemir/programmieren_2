package de.thws.klausurAufgaben.ss2017.nummer2;

import de.thws.lektion15.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    
    public static void main(String[] args) {
        
        class Raum {
            
            final Collection<Student> studenten = new ArrayList<>();

            public void listeStudentenImRaum() {
                Iterator<Student> iterator = studenten.iterator();
                while (iterator.hasNext()) {
                    Student student = iterator.next();
                    System.out.println(student);
                }
            }
        }
    }
}
