import static Matematicas.OperacionesEnteros.digitos;
import static Matematicas.OperacionesEnteros.digitoN;
public class C08Ejercicio54{
  public static void main(String [] args){
    int num = 333;
    int digito = 3;
    //System.out.println(ocurrencias(digito, num));
    int[] arr = {244,2,4,5,8,1};
    System.out.print("El total de " + digito + " que hay en el array es: "
    + ocurrencias(digito, arr));
  }
  
  /*
   * Esta función devuelve el número de veces que aparece un dígito dentro de 
   * un número.
   * 
   * @param digito            Dígito a comprobar
   * @param n                 Número donde comprobar cuantas veces está el dígito
   * @return                  Número de veces que aparece digito en n.
  */
  public static int ocurrencias(int digito, int n){
    int counter = 0;
    for(int i=0; i<digitos(n); i++){
      if(digitoN((long)n, i) == digito) counter++;
    }
    return counter;
  }
  
  /*
   * Esta función devuelve el número de veces que aparece un dígito en una serie
   * de números contenidos en el Array.
   * 
   * @param digito            Dígito a comprobar
   * @param a                 Array unidimensional que se pasa como input
   * @return                  Número de veces que aparece el digito el Array
   *                          input en total
  */
  public static int ocurrencias(int digito, int[] a){
    int result = 0;
    for(int i=0; i<a.length; i++){
      result += ocurrencias(digito, a[i]);
    }
    return result;
  }
}
