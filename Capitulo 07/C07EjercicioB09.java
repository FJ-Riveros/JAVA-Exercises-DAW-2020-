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
    }
      
      //Right
      int aux2 = arr[x][11-x]
      for(int j=11; j>=1; j--){
        arrVolteado[j][11-x] = arrVolteado[j][(11-x)-1];
      }
      arrVolteado[x][11-x] = aux2;
      
    
    
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
