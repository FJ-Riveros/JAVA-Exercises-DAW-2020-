public class C07EjercicioB02{
  public static void main (String [] args){
    //Terminar filas
    final int ROWS = 4;
    final int COLUMNS = 5;
    int[][] arr = new int[ROWS][COLUMNS];
    int acc = 0;
    for(int i = 0; i < ROWS; i++){
      for(int j = 0; j < COLUMNS; j++){
        System.out.print("Introduzca el número que desea colocar en la posición " + i + "," + j + ": ");
        arr[i][j] = Integer.parseInt(System.console().readLine());
      }
    }
    
    for(int i = 0; i < ROWS; i++){
      for(int j = 0; j <= COLUMNS; j++){
        if( j == COLUMNS ){
          System.out.print("fila " + acc++);
        }else{
          System.out.print(arr[i][j] + " ");
        }
      }
      System.out.println(); 
    }
    acc = 0;
    for( int j = 0; j < COLUMNS; j++){
      for(int i=0; i<ROWS; i++){
        acc+= arr[i][j];
      }
      System.out.print(acc + " ");
      acc = 0;
    }
  }
}
