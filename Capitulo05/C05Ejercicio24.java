/**
 * @Author: FJ-Riveros
 */
public class C05Ejercicio24 {
  public static void main (String [] args){
    System.out.println("Introduzca la altura");
    int h = Integer.parseInt(System.console().readLine());
    int k;
    for( int i = 1; i <= h; i++){
      for( int j = 0; j <= h - i; j++){
        System.out.print(" ");
      }
      for(  k = 1; k <= i; k++){
        System.out.print(i);
      }
      for( int g = k - 1; g >= 1; g--){
        System.out.print(g);
      }
      System.out.println();
    }
  }
}
