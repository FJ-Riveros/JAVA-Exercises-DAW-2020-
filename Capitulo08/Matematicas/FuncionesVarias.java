package Matematicas;

public class FuncionesVarias{
  /*  
   * Convierte el número introducido en el sistema Palotes.
   * @param x               Entero con el número a convertir
   * @return                String con el número ya convertido
  */
  public static String convierteEnPalotes(int x){
    String result = "";
    String aux = "";
    int numDigits = Matematicas.OperacionesEnteros.digitos((long)x);
    for(int i=0; i<numDigits; i++){
      aux = "";
      for(int j=0; j<Matematicas.OperacionesEnteros.digitoN((long)x, i); j++){
        aux += "|";
      }
      if(i == numDigits-1){
        result = result + aux;
      }else{
        result = result + aux + "-";
      }
    }
    return result;
  }
}
