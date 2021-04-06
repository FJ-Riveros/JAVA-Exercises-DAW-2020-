import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author FJ-Riveros
 */
 
public class Ejercicio04{
  public static void main(String[] args){
    ArrayList<String> input = new ArrayList<String>();
    for(int i=0; i<6; i++){
      System.out.print("Introduzca un String, le quedan " + (5-i) + " Strings por introducir: ");
      input.add(System.console().readLine());
    }
    Collections.sort(input);
    for(String item: input) System.out.println(item);
  }
}
