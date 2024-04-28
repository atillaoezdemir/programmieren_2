package de.thws.lektion16aa.stack;

import java.util.ArrayList;

public class stackAttribut {
    
    ArrayList<Object> o;
    
    public stackAttribut(ArrayList o){
        this.o = o;
    }
    
    public void push(Object o){
        this.o.add(o);
    }

    public Object pop(){
        return this.o.remove(o.size() - 1);
    }
}
