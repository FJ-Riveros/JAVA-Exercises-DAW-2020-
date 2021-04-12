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
    ArrayList<String> claves = new ArrayList<>();
    for(Map.Entry clave: numMaximo.entrySet()){
      claves.add("" + clave.getKey());
    }
    
    for(int i=0; i<numCapturas; i++){
      do{
        random = (int)(Math.random()*5);
      }while(!cumpleReglas(numMaximo, piezasActuales, claves, random));
      piezasActuales.put(claves.get(random), piezasActuales.get(claves.get(random)) + 1);
    }
    //System.out.println(piezasActuales);
    System.out.println(muestraResultado(equivalencias, piezasActuales));
  }
  
  
  //This function checks if the rules are compromised or not.
  public static boolean cumpleReglas(HashMap<String, Integer> maximo, HashMap<String, Integer> actual, ArrayList<String> claves, int random){
    if(actual.get(claves.get(random)) + 1 > maximo.get(claves.get(random))) return false;
    return true;
  }
  
  public static String muestraResultado(HashMap<String, Integer> equivalencias, HashMap<String, Integer> actuales){
    int totales = 0;
    String result = "";
    result += "Alfil (" + (actuales.get("alfil") * equivalencias.get("alfil")) + " peones)\n";
    result += "Caballo (" + (actuales.get("caballo") * equivalencias.get("caballo")) + " peones)\n";
    result += "Peón (" + (actuales.get("peon") * equivalencias.get("peon")) + " peones)\n";
    result += "Torre (" + (actuales.get("torre") * equivalencias.get("torre")) + " peones)\n";
    result += "Dama (" + (actuales.get("dama") * equivalencias.get("dama")) + " peones)\n";
    for(Map.Entry pares: actuales.entrySet()){
      totales += equivalencias.get(pares.getKey()) * (int)pares.getValue();
    }
    result += "Puntos totales: " + totales + " peones.";
    return result;
  }
}
