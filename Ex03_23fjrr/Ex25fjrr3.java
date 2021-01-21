/*

@author: Francisco Javier Riveros Racero
Date: 14/01/2020
Turn: 2º

*/

public class Ex25fjrr3 {
  public static void main (String [] args){
    boolean exit = false;
    String input = "";
    String[] conversionTable = {"cero", "uno", "dos", "tres", "cuatro", "cinco",
                                "seis", "siete", "ocho", "nueve"};
    char exitInput = '0';
    do{
      System.out.print("Introduzca una frase (a ser posible, con dígitos numéricos en ella): ");
      input = System.console().readLine();
      System.out.println("\nFrase original: " + input);
      System.out.print("Frase alterada: ");
      for(int i=0; i<input.length(); i++){
        if(input.charAt(i) - '0' >= 0 && input.charAt(i) - '0' <= 9){
          System.out.print("[" + conversionTable[input.charAt(i) - '0'] + "]");
        }else{
          System.out.print(input.charAt(i));
        }
      }
      System.out.println();
      System.out.println();
      System.out.print("¿Desea salir? (s/n): ");
      exitInput = System.console().readLine().charAt(0);
      System.out.println();
      if(exitInput == 's') exit = true;
    }while(!exit);
  }
}
