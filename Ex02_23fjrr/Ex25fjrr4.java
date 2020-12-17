/*

@author: Francisco Javier Riveros Racero
Date: 16/12/2020
Turn: 2º

*/

public class Ex25fjrr4 {
  public static void main (String [] args){
    int input = 0;
    do{
    System.out.print("Introduzca la longitud total del puente (un número mayor que 6): ");
    input = Integer.parseInt(System.console().readLine());
    if(input < 7){
      System.out.print("El dato introducido es incorrecto.\n");
    }
    }while(input < 7);
    int base = input - 4;
    int random = 0;
    System.out.print("  ");
    for(int i = 0; i < base; i++){
      random = (int)(Math.random()*3);
      switch(random){
        case 0:
          System.out.print("&");
        break;
        
        case 1:
          System.out.print(" ");
        break;
        
        case 2:
          System.out.print(" ");
        break;
      }
    }
    System.out.println();
    System.out.print("  ");
    for(int i = 0; i < base; i++){
      System.out.print("*");
    }
    System.out.println();
    System.out.print(" *");
    for(int i = 0; i < base; i++){
      System.out.print(" ");
    }
    System.out.print("*");
    System.out.println();
    System.out.print("*");
    for(int i = 0; i < base + 2; i++){
      System.out.print(" ");
    }
    System.out.print("*");
  }
}
