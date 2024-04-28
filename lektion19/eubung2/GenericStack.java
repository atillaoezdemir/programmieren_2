package de.thws.lektion19aa.eubung2;

import java.util.ArrayList;

public class GenericStack<E> extends ArrayList<E> {
    public void push(E genericStack) {
        add(genericStack);
    }

    public E pop() {
        if (size() > 0) 
            return remove(size() - 1);
        else 
            throw new RuntimeException("Stack is empty!");
    }
    
    public static void main(String[] args) {
        GenericStack<Character> c = new GenericStack<>();
        c.push('a');
        c.push('d');
        c.push('a');
        c.push('n');
        c.push('a');

        System.out.println(c.pop());
        System.out.println(c.pop());
        System.out.println(c.pop());
    }
}
