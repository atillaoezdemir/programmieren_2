package de.thws.lektion16.schach;

public class Brett {
  
  boolean[][] brett = new boolean[8][8];

  public Brett() {
  
  }
  
  public Brett kombiniere(Brett b) {
    for(int i = 0; i <= 8; i++){
      for(int j = 0; j <= 8; j++){
        if(b.brett[i][j] == true){
          brett[i][j] = true;
        }
      }
    }
    return this;
  }
  
  public void markiereFeld(int x, int y) {
    if(y >= 1 && y <= 8 && x >= 1 && x <= 8)
      brett[x-1][y-1] = true;
  }
  
  public boolean gibFeld(int x, int y) {
    return brett[x-1][y-1];
  }
}
