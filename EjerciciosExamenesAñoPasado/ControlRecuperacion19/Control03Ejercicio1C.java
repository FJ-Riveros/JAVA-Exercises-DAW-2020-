public class Control03Ejercicio1C {
  public static void main (String [] args){
    System.out.print("Introduzca el nº de filas: ");
    final int ROWS = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el nº de columnas: ");
    final int COLUMNS = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el nº de fila central (entre 0 y " + (ROWS - 1) + "): ");
    final int Y = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el nº de columna central (entre 0 y " + (COLUMNS - 1) + "): ");
    final int X = Integer.parseInt(System.console().readLine());
    int[][] arr = new int[ROWS][COLUMNS];
    int difY = 0;
    int difX = 0;
    int outputValue = 0;
    for(int i = 0; i < ROWS; i++){
      for(int j = 0; j < COLUMNS; j++){
        difY = Math.abs(i - Y);
        difX = Math.abs(j - X);
        outputValue = difY > difX ? difY : difX;
        if(outputValue > 9){
          outputValue %= 10;
        }
        arr[i][j] = outputValue;
      }
    }
    for(int i = 0; i < ROWS; i++){
      for(int j = 0; j < COLUMNS; j++){
        System.out.printf("%2d ",arr[i][j]);
      }
      System.out.println();
    }
  }
}
