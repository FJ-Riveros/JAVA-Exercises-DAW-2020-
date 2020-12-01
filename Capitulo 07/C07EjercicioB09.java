public class C07EjercicioB09{
  public static void main (String [] args){
    final int ROWS = 12;
    final int COLUMNS = 12;
    int[][] arr = new int[ROWS][COLUMNS];
    int[][] arrVolteado = new int[ROWS][COLUMNS];
    int random = 0;
    for(int i=0; i<ROWS; i++){
      for(int j=0; j<COLUMNS; j++){
        random = (int)(Math.random() * 101);
        arr[i][j] = random;
        arrVolteado[i][j] = random;
      }
    }
    
    for(int x=0; x<6; x++){
      //Top
      int aux1= arr[x][11 - x];
      for(int j=11 - x; j > x; j--){
        arrVolteado[x][j] = arrVolteado[x][j-1];
      }
    
      
      //Right
      int aux2 = arr[11-x][11-x];
      for(int j=11-x; j > x; j--){
        arrVolteado[j][11-x] = arrVolteado[j-1][11-x];
      }
      arrVolteado[x+1][11-x] = aux1;
      
      //Down
      int aux3 = arr[11-x][0+x];
      for(int j=x; j < (11-x)-1; j++){
        arrVolteado[11-x][j] = arrVolteado[11-x][j+1];
      }
      arrVolteado[11-x][11-x-1]= aux2;
      
      
      //Left
      for(int j= x; j<11-x-1; j++){
        arrVolteado[j][x] = arrVolteado[j-1][x];
      }
      arrVolteado[11-x-1][x] = aux3;
    }
    
      for(int i=0; i<12; i++){
        for(int j=0; j<12; j++){
          System.out.printf("%5d", arr[i][j]);
        }
        System.out.println();
      }
      
      System.out.println();
      System.out.println();
      
      for(int i=0; i<12; i++){
        for(int j=0; j<12; j++){
          System.out.printf("%5d", arrVolteado[i][j]);
        }
        System.out.println();
      }
  }
}
