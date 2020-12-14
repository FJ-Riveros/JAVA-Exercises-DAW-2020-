public class EjercicioPropio03Circulo{
  public static void main (String [] args){
    System.out.print("Introduzca el número de filas que desea: ");
    final int ROWS = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el número de columnas que desea: ");
    final int COLUMNS = Integer.parseInt(System.console().readLine());
    String[][] arr = new String[ROWS][COLUMNS];
    for(int i=0; i<ROWS; i++){
      for(int j=0; j<COLUMNS; j++){
        if((i + j) % 2 == 0){
          arr[i][j] = "██";
        }else{
          arr[i][j] = "░░";
        }
      }
    }
    for(int i=0; i<ROWS; i++){
      for(int j=0; j<COLUMNS; j++){
        System.out.print(arr[i][j]);
      }
      System.out.println();
    }
    System.out.print("Selecciona la fila donde quieres posicionarte: ");
    int y = Integer.parseInt(System.console().readLine());
    System.out.print("Selecciona la columna donde quieres posicionarte: ");
    int x = Integer.parseInt(System.console().readLine());
    arr[y][x] = "@@";
    for(int i=0; i<ROWS; i++){
      for(int j=0; j<COLUMNS; j++){
        System.out.print(arr[i][j]);
      }
      System.out.println();
    }
    System.out.print("Presione ENTER para señalar las casillas posibles: ");
    System.console().readLine();
    for(int i=0; i<ROWS; i++){
      for(int j=0; j<COLUMNS; j++){
        if((Math.abs(x - j) == 2 && Math.abs(y - i) <= 1) || (Math.abs(x - j) == 1 && Math.abs(y - i) == 2)){
          arr[i][j] = "**";
        }
      }
    }
    for(int i=0; i<ROWS; i++){
      for(int j=0; j<COLUMNS; j++){
        System.out.print(arr[i][j]);
      }
      System.out.println();
    }
  }
}
