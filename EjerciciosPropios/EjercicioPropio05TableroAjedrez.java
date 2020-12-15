public class EjercicioPropio05TableroAjedrez{
  public static void main (String [] args){
    int[][] arr = new int[8][8];
    System.out.print("Introduzca la posición que desee: ");
    final String input = System.console().readLine();
    int row = (int)input.charAt(0) - 49 ;
    int column = (int)input.charAt(1) - 97;
    System.out.println(row);
    System.out.println(column);
    /*for(int i=0; i<ROWS; i++){
      for(int j=0; j<COLUMNS; j++){
        System.out.print(arr[i][j]);
      }
      System.out.println();
    }*/
  }
}
