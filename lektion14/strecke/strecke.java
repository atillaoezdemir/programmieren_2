package de.thws.lektion14aa.strecke;

public class strecke {
    
    int anfangspunkt;
    int endpunkt;
    
    public strecke(int erste, int zweite){
        if(erste > 0 && zweite >0){
            if(erste > zweite) {
                this.anfangspunkt = zweite;
                this.endpunkt = erste;
            }else {
                this.anfangspunkt = erste;
                this.endpunkt = zweite;
            }
        }else 
            throw new RuntimeException("Sowohl die erste als auch die zweite Zahl müssen größer als Null sein!");
    }
    
    public static boolean ueberschneiden(strecke a, strecke b){
        if (a.endpunkt > b.endpunkt)
            if(b.endpunkt>=a.anfangspunkt) return true;
        else
            if(a.endpunkt>=b.anfangspunkt) return true;
        
        return false;
    }
}
