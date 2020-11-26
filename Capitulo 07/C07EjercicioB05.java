public class C07EjercicioB05 {
  public static void main (String [] args){
    //MODIFICAR
    final int ROWS = 6;
    final int COLUMNS = 10;
    int[][] arr = new int[ROWS][COLUMNS];
    int max = -1;
    int min = 1002;
    String maxNum = "";
    String minNum = "";
    for(int i=0; i<ROWS; i++){
      for(int j=0; j<COLUMNS; j++){
        arr[i][j] = (int)(Math.random() * 1001);
        if(arr[i][j] > max){
          max = arr[i][j];
          maxNum = "El máximo está en la fila " + i + " columna " + j;
        }
        if(arr[i][j] < min){
          min = arr[i][j];
          minNum = "El mínimo está en la fila " + i + " columna " + j;
        }
      }
    }
    for(int i=0; i<ROWS; i++){
      for(int j=0; j<COLUMNS; j++){
        System.out.printf("%5d",arr[i][j]);
      }
      System.out.println();
    }
    System.out.println();
    System.out.println(maxNum);
    System.out.print(minNum);
  }
}
