import static Matematicas.OperacionesEnteros.digitoN;
import static Matematicas.OperacionesEnteros.digitos;
public class C08Ejercicio49B{
  public static void main(String [] args){
    int[] result = lookAndSay(5);
    for(int item: result){
      System.out.print(item + " ");
    }
  }
  /*
   * Devuelve un Array, cada item es como se lee la concatenación de los números
   *que se pasan como parámetros.(Look and say)
   * 
   * @param terminos             Cantidad de terminos a ejecutar
   * @return                     Términos(n) lookAndSay
  */ 
  public static int[] lookAndSay(int terminos){
    int[] result = new int[terminos];
    int counter = 1;
    if(terminos>= 1){
      result[0];
    }else{
      return [];
    }
    
    for(int i=0; i<arr.length-2; i++){
      siguienteNumero(i, result);
    }
    return result;
  }
  
  public static void siguienteNumero(int posicionArr, int[] arr){
    
     
  }
  
  
}
