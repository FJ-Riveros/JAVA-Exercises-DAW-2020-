import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author FJ-Riveros
 */
 
public class Ejercicio11{
  public static void main(String[] args){
    HashMap<String,String> diccionario = new HashMap<String,String>();
    diccionario.put("coche","car");
    diccionario.put("avión","airplane");
    diccionario.put("sol","sun");
    diccionario.put("luna","moon");
    diccionario.put("perro","dog");
    diccionario.put("gato","cat");
    diccionario.put("loro","parrot");
    diccionario.put("luz","light");
    diccionario.put("oscuro","dark");
    String[] keys = diccionario.keySet().toArray(new String[0]);
    
    ArrayList<Integer> nums = new ArrayList<Integer>();
    nums.add((int)(Math.random()*10));
    int random = 0;
    for(int i=0; i<4; i++){
      do{
        random = (int)(Math.random()*10);
      }while(nums.contains(random));
    }
    
    System.out.println("Traduzca las siguientes palabras: ");
    for(int i=0; i<nums.size(); i++){
      System.out.println(keys[nums.get(i)]);
    }
  }
}
