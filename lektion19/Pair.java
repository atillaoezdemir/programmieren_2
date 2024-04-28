package de.thws.lektion19aa;

// Generic class
public class Pair<T> {
    
    private T left;
    private T right;

    public Pair(T l, T r) {
        left = l;
        right = r;
    }

    public T getLeft() {
        return left;
    }

    public T getRight() {
        return right;
    }

    public String toString() {
        return "(l=" + left.toString() + ", r=" + right.toString() + ")";
    }

    public static void main(String[] args) {
        Pair<String> stringPair = new Pair<>("sol", "sağ");
        System.out.println(stringPair);

        // Create a pair with integer as the type (String is expected, but we will get a compilation error)
        // In this example, an error was created intentionally.
        Pair<Integer> integerPair = new Pair<>(1, 2);
        System.out.println(integerPair);
        
        // The following line will throw an error because the expected type is String, but Integer is given.
        // String leftValue = integerPair.getLeft();
    }
}
