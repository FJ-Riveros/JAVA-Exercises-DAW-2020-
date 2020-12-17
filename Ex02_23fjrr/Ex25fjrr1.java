/*

@author: Francisco Javier Riveros Racero
Date: 16/12/2020
Turn: 2º

*/

public class Ex25fjrr1 {
  public static void main (String [] args){
    int[][] arr = new int[8][8];
    String input = "";
    int x = -1;
    int guion = -1;
    int y = -1;
    boolean check = false;
    boolean length = false;
    do{
      System.out.print("Introduzca la posición del caballo: ");
      input = System.console().readLine();
      if(input.length() == 3 ){
        x = input.charAt(0) - 'a';
        guion = input.charAt(1) - '-';
        y = input.charAt(2) - '1';
        if( (x >= 0 && x <= 7) && (guion == 0) && (y >= 0 && y <= 8)){
          check = true;
        }
      }else{
        System.out.print("Lo siento, el formato no es correcto.\n");
      }
    }while(!check);
    int difY = 0;
    int difX = 0;
    String result = "";
    char resultFilas,
    resultColumnas;
    System.out.print("El caballo puede moverse a las posiciones: \n");
    for(int i=7; i>=0; i--){
      for(int j=0; j<8; j++){
        difY = Math.abs(i - y);
        difX = Math.abs(j - x);
        if((difX == 2 && difY == 1) || (difX == 1 && difY == 2)){
          resultFilas = (char)(i + '1');
          resultColumnas = (char)(j + 'a');
          System.out.print(resultColumnas + "-" + resultFilas +  " ");
        }
      }
    }
  }
}
