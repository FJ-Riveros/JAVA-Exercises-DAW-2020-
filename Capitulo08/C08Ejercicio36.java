import static Matematicas.OperacionesEnteros.esPrimo;

public class C08Ejercicio36{
  public static void main( String [] args){
    int[] prueba = {4, 8, 8, 4, 8};
    int[] result = filtraPrimos(prueba);
    for(int item: result){
      System.out.print(item + " ");
    }
    
  }
  /*
   * Devuelve un Array nuevo con todos los primos del array original
   * @param arr       Array original del que obtener los primos
   * @return          Array con los primos del array original, si no hay ninguno
   *                  se devuelve un Array con el item -1.
  */
  public static int[] filtraPrimos(int[] arr){
    int counter = 0;
    int[] aux = new int[arr.length];
    for(int i=0; i<arr.length; i++){
      if(esPrimo(arr[i])) aux[counter++] = arr[i];
    }
    if(counter != 0){
      int[] result = new int[counter];
      for(int i=0; i<counter; i++){
        result[i] = aux[i];
      }
      return result;
    }else{
      int[] result = {-1};
      return result;
    }
  }
}
