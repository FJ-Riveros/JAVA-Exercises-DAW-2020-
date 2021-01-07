import static Matematicas.OperacionesEnteros.esCapicua;
public class C08Ejercicio39{
  public static void main(String [] args){
    int[] prueba = {33, 13, 313, 18, 8};
    int[] result = filtraCapicua(prueba);
    for(int item: result){
      System.out.print(item + " ");
    }
  }
  
  /*
   * Convierte el int input en una cadena de carácteres correspondiente a cada
   * número introducido.
   * @param n         Int que se introducide como input.
   * @return          String con el nombre de los números ordenados.
  */
  public static String convierteEnPalabras(int n){
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
