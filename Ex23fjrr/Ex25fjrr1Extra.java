/*

@author: Francisco Javier Riveros Racero
Date: 5/11/2020
Turn: 2º

*/

public class Ex25fjrr1Extra {
  public static void main (String [] args){
    int rows = 0;
    int columns = 0;
    do{
      System.out.print("Introduzca el número de filas: ");
       rows = Integer.parseInt(System.console().readLine());  
      if(rows <= 0 || rows > 20){
        System.out.print("Valor fuera de rango. ");
      }
    }while( rows <= 0 || rows > 20 );
    
    do{
      System.out.print("Introduzca el número de columnas: ");
      columns = Integer.parseInt(System.console().readLine());  
      if(columns <= 0 || columns > 20){
        System.out.print("Valor fuera de rango. ");
      }
    }while( columns <= 0 || columns > 20 );
    System.out.println();
    
    for( int i = 0; i < rows; i++){
      for( int j = 0; j < columns; j++){
        if( i % 2 == 0){
          if( j % 2 == 0 ){
          System.out.print("██");  
          }else{
            System.out.print("  ");
          }
        }else{
          if( j % 2 != 0 ){
            System.out.print("██");  
          }else{
            System.out.print("  ");
          }
        }
      }
      System.out.println();
    }
  }
}
