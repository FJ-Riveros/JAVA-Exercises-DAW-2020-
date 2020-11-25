public class C07EjercicioB01 {
  public static void main (String [] args) {
    final int ROWS = 3;
    final int COLUMNS = 6;
    int[][] arr = new int[ROWS][COLUMNS];
    arr[0][1] = 30;
    arr[0][2] = 2;
    arr[0][5] = 5;
    arr[1][0] = 75;
    arr[1][4] = 0;
    arr[2][2] = -2;
    arr[2][3] = 9;
    arr[2][5] = 11;    
    System.out.print("Array num");
    for(int i = 0; i < COLUMNS; i++){
      System.out.printf("%11s" , "Columna " + i);
    }
    System.out.println();
    for(int i=0; i < ROWS; i++){
      System.out.printf("%6s" , "Fila " + i);
      for(int j=0; j < COLUMNS; j++){
        System.out.printf("%11d",arr[i][j]);
      }
      System.out.println();
    }
    
  }
}
