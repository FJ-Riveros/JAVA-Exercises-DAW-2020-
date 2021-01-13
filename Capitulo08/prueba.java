import static Matematicas.OperacionesEnteros.digitos;
import static Matematicas.OperacionesEnteros.digitoN;
//import static Matematicas.OperacionesEnteros.ocurrencias;
import static Matematicas.ManipulacionArraysUnidimensionales.ocurrencias;
public class prueba{
  public static void main(String [] args){
    int num = 333;
    int digito = 2;
    //System.out.println(ocurrencias(digito, num));
    int[] arr = {244,2,4,5,8,1};
    System.out.print("El total de " + digito + " que hay en el array es: "
    + ocurrencias(digito, arr));
    
  }
}
