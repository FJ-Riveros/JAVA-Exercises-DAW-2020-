/*

@author: Francisco Javier Riveros Racero
Date: 14/01/2020
Turn: 2º

*/

public class Ex25fjrr1 {
  public static void main (String [] args){
    System.out.print("Introduzca el tamaño de la matriz unidimensional: ");
    final int UNISIZE = Integer.parseInt(System.console().readLine());
    int[] arrUni = new int[UNISIZE];
    for(int i=0; i<arrUni.length; i++){
      System.out.print("Introduzca elemento " + (i+1) + "º: ");
      arrUni[i] = Integer.parseInt(System.console().readLine());
    }
    System.out.println();
    System.out.print("Introduzca el tamaño de la matriz bidimensional - filas: ");
    final int BIDROWS = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el tamaño de la matriz bidimensional - columnas: ");
    final int BIDCOLUMNS = Integer.parseInt(System.console().readLine());
    int[][] result = new int[BIDROWS][BIDCOLUMNS];
    System.out.print("\nLa matriz unidimensional de origen es: \n");
    for(int i=0; i<arrUni.length; i++){
      System.out.printf("%5d", arrUni[i]);
    }
    System.out.println();
    System.out.print("\nLa matriz bidimensional de destino queda así: \n");
    for(int i=0; i<BIDROWS; i++){
      for(int j=0; j<BIDCOLUMNS; j++){
        if(i*BIDCOLUMNS+j < arrUni.length){
          result[i][j] = arrUni[i*BIDCOLUMNS+j];
        }else{
          result[i][j] = -1;
        }
        System.out.printf("%5d", result[i][j]);
      }
      System.out.println();
    }
  }
}
