package de.thws.lektion21aa.binaerbaum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class test {
    
    private binaerbaum<Integer> tree;

    @BeforeEach
    public void pre() {
        tree = new binaerbaum<>();
    }

    @Test
    public void testBinaryTree() {
        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(2);
        tree.add(4);
        tree.add(6);
        tree.add(8);

        // Erwartete Ausgabe: 2 3 4 5 6 7 8
        tree.printTree();
    }
}
