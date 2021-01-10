import static Matematicas.creacionDeFiguras.printLinea;
public class C08Ejercicio47{
  public static void main(String [] args){
    int[] arr = {0,3,4};
    System.out.print(convierteArrayEnString(arr));
  }
  /*
   * Esta función nos devuelve un String con los números que contiene un Array
   * unidimensional.
   * 
   * @param arr               Array de números a convertir
   * @return                  String con los carácteres del Array numérico
  */ 
  public static String convierteArrayEnString(int[] arr){
    String result = "";
    for(int item: arr)result += item;
    return result;
  }
}
