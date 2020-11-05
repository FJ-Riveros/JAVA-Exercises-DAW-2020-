/*

@author: Francisco Javier Riveros Racero
Date: 5/11/2020
Turn: 2º

*/

public class Ex25fjrr4 {
  public static void main (String [] args){
    System.out.print("Introduzca el número positivo a ser estirado: ");
    long num = Long.parseLong(System.console().readLine());
    long numDouble = num;
    if( num > 0 ){
      System.out.print("Introduzca el estiramiento: ");
      int est = Integer.parseInt(System.console().readLine());
      long aux = 0;
      String result = "";
      while( num > 0 ){
        aux = (aux * 10) + (num % 10);
        num /= 10;
      }
      while( aux > 0 ){
        for( int i = 0; i < est; i++){
          result += aux % 10;
        }
        aux /= 10;
      }
      System.out.println("El número " + numDouble + " estirado por " + est + " es:");
      System.out.println(result);
    }else{
      System.out.println("El número entero debe ser positivo");
    }
  }
}
