import java.util.ArrayList;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author FJ-Riveros
 */
 
public class Ejercicio23{
  public static void main(String[] args){
    HashMap<String, Integer> equivalencias = new HashMap<>();
    equivalencias.put("dama", 9);
    equivalencias.put("torre", 5);
    equivalencias.put("alfil", 3);
    equivalencias.put("caballo", 2);
    equivalencias.put("peon", 1);
    int numCapturas = (int)(Math.random()*16);
    HashMap<String, Integer> numMaximo = new HashMap<>();
    equivalencias.put("dama", 1);
    equivalencias.put("torre", 2);
    equivalencias.put("alfil", 2);
    equivalencias.put("caballo", 2);
    equivalencias.put("peon", 8);
    
    HashMap<String, Integer> piezasActuales = new HashMap<>();
    equivalencias.put("dama", 0);
    equivalencias.put("torre", 0);
    equivalencias.put("alfil", 0);
    equivalencias.put("caballo", 0);
    equivalencias.put("peon", 0);
    Set<String> prueba = piezasActuales.keySet();
    boolean check = false;
    int random = 0;
    //Buscar forma de seleccionar la clave de la entrada seleccionada con el random
    //para comprobar antes de aumentar si se pasa del límite o no.
    /*for(int i=0; i<numCapturas; i++){
      do{
        random = (int)(Math.random()*6);
      }while(!cumpleReglas(numMaximo, piezasActuales));
    }*/
  }
  public static boolean cumpleReglas(HashMap<String, Integer> tope, HashMap<String, Integer> actual){
    for(Map.Entry item: tope.entrySet()){
      if(actual.get(item.getKey()) < tope.get(item.getKey())) return false;
    }
    return true;
  }
}
