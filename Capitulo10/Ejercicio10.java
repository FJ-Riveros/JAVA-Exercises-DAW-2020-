import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author FJ-Riveros
 */
 
public class Ejercicio10{
  public static void main(String[] args){
    HashMap<String,String> diccionario = new HashMap<String,String>();
    diccionario.put("coche","car");
    diccionario.put("avión","airplane");
    diccionario.put("sol","sun");
    diccionario.put("luna","moon");
    diccionario.put("naranja","orange");
    System.out.println("El diccionario contiene las siguientes palabras: ");
    for(Map.Entry item: diccionario.entrySet()){
      System.out.println(item.getKey());
    }
    System.out.println("Introduzca la palabra en español que desea traducir: ");
    String input = System.console().readLine();
    if(diccionario.get(input) != null){
      System.out.print(input + ":" + diccionario.get(input));
    }else{
      System.out.println("Lo siento, no está la traducción registrada");
    }
  }
}
