import static Matematicas.OperacionesEnteros.digitoN;
import static Matematicas.OperacionesEnteros.digitos;
public class C08Ejercicio49{
  public static void main(String [] args){
    
    
  }
  /*
   * Devuelve un Array, cada item es como se lee la concatenación de los números
   *que se pasan como parámetros.(Look and say)
   * 
   * @param arrA              Primer Array de números a concatenar
   * @param arrB              Segundo Array de números a concatenar
   * @return                  Array unidimensional con la concatenación de los dos.
  */ 
  public static int[] lookAndSay(int terminos){
    int digitosTotales = 0;
    int item = 0;
    int numeroIntroducir = 0;
    int[] arr = new int[terminos];
    arr[0] = 1;
    
    for(int i=1; i<terminos; i++){
      digitosTotales = digitos(arr[i-1]);
      numeroIntroducir = 0;
      item = arr[i-1];
      int selector = 0;
      int counter = 0;
      
      for(int j=0; j<digitosTotales; j++){
        selector = digitoN((long)item, j);
        if(
      }
       
    }
    
  }
}
