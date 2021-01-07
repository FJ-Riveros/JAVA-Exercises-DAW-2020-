import static Matematicas.OperacionesEnteros.esCapicua;
public class C08Ejercicio38{
  public static void main(String [] args){
    int[] prueba = {33, 13, 313, 18, 8};
    int[] result = filtraCapicua(prueba);
    for(int item: result){
      System.out.print(item + " ");
    }
  }
  
  /*
   * Devuelve un Array nuevo con todos los números capicua que se encuentren en 
   * el array original .
   * @param arr       Array original del que obtener los números capicua
   * @return          Array con los capicua del array original, si no hay ninguno
   *                  se devuelve un Array con el item -1.
  */
  public static int[] filtraCapicua(int[] arr){
    int counter = 0;
    int[] aux = new int[arr.length];
    for(int item: arr){
      if(esCapicua(item)) aux[counter++] = item;
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
