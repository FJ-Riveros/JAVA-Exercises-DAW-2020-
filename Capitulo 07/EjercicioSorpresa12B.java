public class EjercicioSorpresa12B {
  public static void main (String [] args){
    System.out.print("Introduzca la cantidad de filas que desea para el Array: ");
    final int ROWS = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la cantidad de columnas que desea para el Array: ");
    final int COLUMNS = Integer.parseInt(System.console().readLine());
    int[][] arr = new int[ROWS][COLUMNS];
    System.out.print("Introduzca el valor máximo que usted quiera: ");
    int max = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el mínimo que usted quiera: ");
    int min = Integer.parseInt(System.console().readLine());
    int random = 0;
    for(int i=0; i<ROWS; i++){
      for(int j=0; j<COLUMNS; j++){
        if((i + j) % 2 != 0){
          arr[i][j] = (int)(((Math.random() * (max + 1 - min)) + min)/2)*2;
        }else{
          do{
            random = (int)(Math.random() * (max + 1 - min)) + min;
          }while(random%2 == 0);
          arr[i][j] = random;
        } 
      }
    }
    System.out.println();
    for(int i=0; i<ROWS; i++){
      for(int j=0; j<COLUMNS; j++){
        System.out.printf("%4d", arr[i][j]);
      }
      System.out.println();
    }
  }
}
