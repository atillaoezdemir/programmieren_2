package de.thws.lektion15aa.zweite;

public class professor extends person{
    
    public professor(String fach){
        super(fach);
    }
    
    public void gibTaetigkeitAus(){
        System.out.println("Der Professor unterrichtet " + this.fach);
    }
}
