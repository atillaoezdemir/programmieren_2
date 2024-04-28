package de.thws.lektion21aa.binaerbaum;

public class binaerbaum<T> {
    
    private node<T> root;

    public static void main(String[] args) {
        binaerbaum<Character> isimAgaci = new binaerbaum<>();
        isimAgaci.add('A');
        isimAgaci.add('Z');
        isimAgaci.add('F');
        isimAgaci.add('S');
        isimAgaci.add('B');
        isimAgaci.printTree();
    }

    public void add(T data) {
        root = addRecursive(root, data);
    }

    private node<T> addRecursive(node<T> current, T data) {
        if (current == null)
            return new node<>(data);
    
        if (data.hashCode() < current.data.hashCode())
            current.left = addRecursive(current.left, data);
        else if (data.hashCode() > current.data.hashCode())
            current.right = addRecursive(current.right, data);
        
        return current;
    }

    public void printTree() {
        printTreeRecursive(root);
    }

    private void printTreeRecursive(node<T> current) {
        if (current != null) {
            printTreeRecursive(current.left);
            System.out.println(current.data);
            printTreeRecursive(current.right);
        }
    }

    private static class node<T> {
        
        private final T data;
        private node<T> left;
        private node<T> right;

        public node(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}
