package de.thws.lektion15aa.zweite;

public class main {
    
    public static void main(String[] args){
        person[] personen = new person[100];
    
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 1)
                personen[i] = new student("Programmieren");
                
            else
                personen[i] = new professor("Programmieren");
        }
        
        for (person person : personen)
            person.gibTaetigkeitAus();
    }
}
