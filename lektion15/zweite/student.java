package de.thws.lektion15aa.zweite;

public class student extends person {
    
    public student(String fach){
        super(fach);
    }
    
    public void gibTaetigkeitAus(){
        System.out.println("Der Student besucht das Fach " + this.fach);
    }
}
