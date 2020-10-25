/**
 * @Author: FJ-Riveros
 */
import java.util.ArrayList;
public class EjercicioRepasoBucles11 {
  public static void main (String [] args){
    ArrayList<String> words = new ArrayList<String>(); 
    String input;
    do{
      System.out.println("Introduzca una palabra( acaba con 'salir'): ");
      input = System.console().readLine();
      if( !input.equals("salir") ){
        words.add(input);
      }
    }while( !input.equals("salir") );
    for( int i = words.size(); i > 0; i-- ){
      System.out.print(words.get(i - 1) + " ");
    }
  }
}
