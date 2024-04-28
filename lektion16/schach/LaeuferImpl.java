package de.thws.lektion16.schach;

import static java.lang.Math.abs;

public class LaeuferImpl extends AbstractFigur implements Laeufer {
  
  public LaeuferImpl(int x, int y) {
    super(x, y);
  }

  public Brett gibErlaubteFelder() {
    Brett brett = new Brett();
    for(int i = 1; i <= 8; i++){
      for(int j = 1; j <= 8; j++){
        if(abs(x-i) == abs(y-j))
          brett.markiereFeld(i,j);
      }
    }
    return brett;
  }

  public static void main(String[] args) {
    LaeuferImpl l = new LaeuferImpl(4,5);
    Brett brett = l.gibErlaubteFelder();
    
    for (int j = 1; j <= 8; j++) {
      for (int i = 1; i <= 8; i++) {
        if (brett.gibFeld(i, j)) 
          System.out.print("x");
        
        else 
          System.out.print("o");
      }
      System.out.println();
    }
  }
}
