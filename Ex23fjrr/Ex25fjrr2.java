/*

@author: Francisco Javier Riveros Racero
Date: 5/11/2020
Turn: 2º

*/

public class Ex25fjrr2 {
  public static void main (String [] args){
    System.out.print("Introduzca un número largo positivo: ");
    long num = Long.parseLong(System.console().readLine());
    long aux = num;
    long pares = 0;
    long impares = 0;
    int countBefore = 0;
    int countAfter = 0;
    while( aux > 0 ){
      if ( (aux % 10) % 2 != 0 ){
        impares = (impares * 10) + (aux % 10);
      }else{
        pares = (pares * 10) + (aux % 10);
        countBefore++;
      }
      aux /= 10;
    }
    aux = pares;
    pares = 0;
    System.out.println(aux);
    while( aux > 0 ){
      pares = (pares * 10) + (aux % 10);
      countAfter++;
      aux /= 10;
    }
    while(countBefore != countAfter){
      pares *= 10;
      countAfter++;
    }
    System.out.println("Las cifras pares del número " + num + " son: " + pares);
    System.out.println("Las cifras impares del número " + num + " son: " + impares);
  }
}
