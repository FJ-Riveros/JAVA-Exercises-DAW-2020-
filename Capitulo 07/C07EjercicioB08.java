public class C07EjercicioB08 {
  public static void main (String [] args){
    final int ROWS = 8;
    final int COLUMNS = 8;
    int[][] arr = new int[ROWS][COLUMNS];
    String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h"};
    for(int i=0; i<ROWS; i++){
      for(int j=0; j<COLUMNS; j++){       
        if(i%2==0){
          if(j%2==0){
            System.out.print("██");
          }else{
            System.out.print("▒▒");
          }
        }else{
          if(j%2!=0){
            System.out.print("██");
          }else{
            System.out.print("▒▒");
          } 
        }
      }
      System.out.println();
    }
    System.out.print("Introduzca la fila donde quiere colocar el alfil(1-8): ");
    int y = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la columna donde quiere colocar el alfil(a-h): ");
    String xUser = System.console().readLine();
    y--;
    int x = 0;
    switch(xUser){
      case "a":
        x = 0;
      break;
      
      case "b":
        x = 1;
      break;
      
      case "c":
        x = 2;
      break;
      
      case "d":
        x = 3;
      break;
      
      case "e":
        x = 4;
      break;
      
      case "f":
        x = 5;
      break;
      
      case "g":
        x = 6;
      break;
      
      case "h":
        x = 7;
      break;
    }
    int counter = 0;
    for(int i=0; i<ROWS; i++){
      for(int j=0; j<COLUMNS; j++){
        if(Math.abs(i - y) == Math.abs(j - x) && !(i==y && j==x)){
          System.out.print("  ");
        }else if(i == y && j == x){
          System.out.print("++");
        }else if(i%2==0){
          if(j%2==0){
            System.out.print("██");
          }else{
            System.out.print("▒▒");
          }
        }else{
          if(j%2!=0){
            System.out.print("██");
          }else{
            System.out.print("▒▒");
          } 
        }
      }
      System.out.println();
    }
  }
}
