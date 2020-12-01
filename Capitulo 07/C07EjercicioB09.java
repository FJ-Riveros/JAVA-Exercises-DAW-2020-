public class C07EjercicioB09{
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
    
    for(int x=0; x<6; x++){
      //Top
      int aux = arr[0][11];
      for(int j=11; j >= 1; j--){
        arr[0][j] = arr[0][j-1];
      }
      
      //Right
      for(int j=11; j>=1; j--){
        
      }
      
     
     
     
     
      
    }
  }
}
