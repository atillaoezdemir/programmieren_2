package de.thws.lektion14aa.kugelVolumen;

public class kugelVolumen {
        public static double berechneKugelvolumen(double radius) throws RuntimeException
        {
            if (radius < 0) {
                throw new RuntimeException("Radius muss positiv sein!");
            }
            return  Math.PI * radius * radius * radius * 4.0 / 3.0 ;
        }
    public static void main(String[] args){
    System.out.println((4.0 / 3.0) * Math.PI);
    }
}


