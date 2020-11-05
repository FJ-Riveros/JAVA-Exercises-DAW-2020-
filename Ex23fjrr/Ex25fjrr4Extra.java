/*

@author: Francisco Javier Riveros Racero
Date: 5/11/2020
Turn: 2º

*/

public class Ex25fjrr4Extra {
  public static void main (String [] args){
    long num = 0;
    int est = 0;
    do{
      System.out.print("Introduzca el número positivo a ser estirado: ");
      num = Long.parseLong(System.console().readLine());  
      if( num == 0 ){
        System.out.print("El número cero no vale. ");
      }
    }while( num == 0 );
    if( num < 0 ){
      System.out.println("Ha introducido un valor negativo. Se considerará como positivo");
      num *= -1;
    }
    do{
      System.out.print("Introduzca el estiramiento: ");
      est = Integer.parseInt(System.console().readLine());  
      if( est <= 0){
        System.out.print("No acepto estiramientos negativos ni nulos. ");
      }
    }while(est <= 0);
    long numDouble = num;
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
    
  }
}
