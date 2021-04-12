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
    numMaximo.put("dama", 1);
    numMaximo.put("torre", 2);
    numMaximo.put("alfil", 2);
    numMaximo.put("caballo", 2);
    numMaximo.put("peon", 8);
    
    HashMap<String, Integer> piezasActuales = new HashMap<>();
    piezasActuales.put("dama", 0);
    piezasActuales.put("torre", 0);
    piezasActuales.put("alfil", 0);
    piezasActuales.put("caballo", 0);
    piezasActuales.put("peon", 0);
    boolean check = false;
    int random = 0;
    //Buscar forma de seleccionar la clave de la entrada seleccionada con el random
    //para comprobar antes de aumentar si se pasa del límite o no.
    /*for(int i=0; i<numCapturas; i++){
      do{
        random = (int)(Math.random()*6);
        
      }while(!cumpleReglas(numMaximo, piezasActuales));
    }
    * */
    ArrayList<String> claves = new ArrayList<>();
    for(Map.Entry clave: numMaximo.entrySet()){
      claves.add("" + clave.getKey());
    }
    
    //SEguir aqui
    for(int i=0; i<numCapturas; i++){
      do{
        random = (int)(Math.random()*5);
      }while(!cumpleReglas(numMaximo, piezasActuales, claves, random));
      piezasActuales.put(claves.get(random), piezasActuales.get(claves.get(random)) + 1);
    }
    
    System.out.println(piezasActuales);
  }
  
  public static boolean cumpleReglas(HashMap<String, Integer> maximo, HashMap<String, Integer> actual, ArrayList<String> claves, int random){
    if(actual.get(claves.get(random)) + 1 > maximo.get(claves.get(random))) return false;
    return true;
  }
}
