import static Matematicas.OperacionesEnteros.digitos;
import static Matematicas.OperacionesEnteros.digitoN;
public class C08Ejercicio39{
  public static void main(String [] args){
    int prueba = 1260;
    String result = convierteEnPalabras(prueba);
    System.out.print(result);
  }
  
  /*
   * Convierte el int input en una cadena de carácteres correspondiente a cada
   * número introducido.
   * @param n         Int que se introducide como input.
   * @return          String con el nombre de los números ordenados.
  */
  public static String convierteEnPalabras(int n){
    String result = "";
    int digitoN = digitos(n);
    String[] traductor = {"cero", "uno", "dos", "tres", "cuatro", "cinco",
                          "seis", "siete", "ocho", "nueve"};
    for(int i=0; i<digitoN; i++){
      result += traductor[digitoN((long)n, i)];
      if(i<digitoN-1) result+= ", ";
    }
    return result;
  }
}
