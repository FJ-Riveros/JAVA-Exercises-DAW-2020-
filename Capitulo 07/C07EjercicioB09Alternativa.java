public class C07EjercicioB09Alternativa{
  public static void main (String [] args){
    final int ROWS = 12;
    final int COLUMNS = 12;
    int[][] arr = new int[ROWS][COLUMNS];
    int[][] arrVolteado = new int[ROWS][COLUMNS];
    for(int i=0; i<ROWS; i++){
      for(int j=0; j<COLUMNS; j++){
        arr[i][j] = (int)(Math.random() * 101);
      }
    }
    
    for(int i=0; i<ROWS; i++){
      for(int j= 0; j<COLUMNS; j++){
        arrVolteado[j][11-i] = arr[i][j];
      }
    }
    
    for(int i=0; i<12; i++){
      for(int j=0; j<12; j++){
        System.out.printf("%5d",arr[i][j]);
      }
      System.out.println();
    }
    
      System.out.println();  
      System.out.println();
    
    for(int i=0; i<12; i++){
      for(int j=0; j<12; j++){
        System.out.printf("%5d",arrVolteado[i][j]);
      }
      System.out.println();
    }
  }
}
