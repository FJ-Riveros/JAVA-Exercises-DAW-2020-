/**
 * @Author: FJ-Riveros
 */

public class PiramideHuecaRellena {
  public static void main( String [] args){
    System.out.println("Introduzca la altura que desea");
    int h = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca el símbolo que desea para la pirámide");
    String symbol = System.console().readLine();
    for( int i = 1; i <= h; i++){
      for( int j = 1; j <= ( h - i); j++){
        System.out.print(" ");
      }
      for( int k = 1; k <= ((i * 2) - 1); k++){
        if( k == 1 || k == (i * 2) - 1 || i == h){
            System.out.print(symbol);
        }else{
          if( i == 2 || i == h - 1 ){
            if( k == 
          }else{
            System.out.print(" ");
          }
        }
      }
      System.out.println();
    }
  }
}
