/**
 * @Author: FJ-Riveros
 */
public class C05Ejercicio22 {
  public static void main (String [] args){
    for( int i = 2; i <= 100; i++){
      for( int j = 2; j < i; j++){
        if( i % j != 0 && i != j){
          System.out.println(i);
          j = i;
        }
      } 
    }
  }
}
