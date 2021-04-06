import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author FJ-Riveros
 */
 
public class Ejercicio03{
  public static void main(String[] args){
    //Menor a mayor
    ArrayList<Integer> input = new ArrayList<Integer>();
    for(int i=0; i<6; i++){
      System.out.print("Introduzca un número, le quedan " + (6-i) + " números por introducir: ");
      input.add(Integer.parseInt(System.console().readLine()));
    }
    Collections.sort(input);
    //for(int item: input) System.out.println(item);
    System.out.println(input);
    //Mayor a menor
    Collections.sort(input, Collections.reverseOrder());
    System.out.println(input);
  }
}
