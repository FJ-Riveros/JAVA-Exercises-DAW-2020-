/**
 * @Author: FJ-Riveros
 */
public class PruebaTrapecio {
  public static void main (String [] args){
    System.out.println("Introduzca el primer valor");
    int val1 = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca el segundo valor");
    int val2 = Integer.parseInt(System.console().readLine());
    if( val1 < val2) {
      for( int i = val1; i <= val2; i++){
        for(int j = 1; j <= i; j++){
          System.out.print("*");
        }
          System.out.println();
      }
    }else{
      for( int i = val1; i >= val2; i--){
        for(int j = 1; j <= i; j++){
          System.out.print("*");
        }
          System.out.println();
      }
    }
  }
}
