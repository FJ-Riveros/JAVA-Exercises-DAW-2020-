/**
 * @Author: FJ-Riveros
 */
import java.util.ArrayList;
public class EjercicioRepasoBucles12 {
  public static void main (String [] args){
    ArrayList<String> words = new ArrayList<String>(); 
    String input;
    int count = 0;
    do{
      System.out.println("Introduzca una palabra( acaba con 'salir'): ");
      input = System.console().readLine();
      if( !input.equals("salir") ){
        words.add(input);
        count++;
      }
      if( count == 4 ){
        input = "salir";
      }
    }while( !input.equals("salir") );
    for( int i = words.size(); i > 0; i-- ){
      System.out.print(words.get(i - 1) + " ");
    }
  }
}
