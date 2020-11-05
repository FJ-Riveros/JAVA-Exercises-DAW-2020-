/*

@author: Francisco Javier Riveros Racero
Date: 5/11/2020
Turn: 2º

*/

public class Ex25fjrr1 {
  public static void main (String [] args){
    System.out.print("Introduzca el número de filas: ");
    int rows = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el número de columnas: ");
    int columns = Integer.parseInt(System.console().readLine());
    for( int i = 0; i < rows; i++){
      for( int j = 0; j < 8; j++){
        if( j % 2 == 0 ){
          System.out.print("██");  
        }else{
          System.out.print("  ");
        }
      }
    }
  }
}
