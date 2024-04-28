package de.thws.klausursuebungen.quadraticFunction;

public class QuadraticFunction {
    
    private final double a;
    private final double b;
    private final double c;

    public QuadraticFunction(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double[] roots() {
        double discriminant = Math.sqrt(b * b - 4 * a * c);
        double x1 = (-b + discriminant) / (2 * a);
        double x2 = (-b - discriminant) / (2 * a);

        return new double[]{x1, x2};
    }
}
