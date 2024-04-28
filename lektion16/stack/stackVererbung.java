package de.thws.lektion16aa.stack;

import java.util.ArrayList;

public class stackVererbung extends ArrayList<Object> {

    public void push(Object a){
        add(a);
    }
    
    public Object pop(){
        if (size() > 0)
            return remove(size() - 1);
        
        else
            throw new RuntimeException("Stack is empty!");
    }
}
