public class C07EjercicioB02{
  public static void main (String [] args){
    final int ROWS = 4;
    final int COLUMNS = 5;
    int[][] arr = new int[ROWS][COLUMNS];
    int input = 0;
    int acc = 0;
    for(int i = 0; i < ROWS; i++){
      for(int j = 0; j < COLUMNS; j++){
        System.out.print("Introduzca el número que desea colocar en la posición " + i + "," + j + ": ");
        input = Integer.parseInt(System.console().readLine());
      }
    }
    
    for(int i = 0; i <= ROWS; i++){
      for(int j = 0; j <= COLUMNS; j++){
        if( i == COLUMNS ){
          System.out.print("fila " + acc);
        }else{
          System.out.print(arr[i][j] + " ");
        }
      }
    }
  }
}
