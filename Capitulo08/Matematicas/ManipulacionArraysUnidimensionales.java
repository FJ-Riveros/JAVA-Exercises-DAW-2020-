package Matematicas;
import static Matematicas.OperacionesEnteros.ocurrencias;
import static Matematicas.OperacionesEnteros.esCapicua;
import static Matematicas.OperacionesEnteros.esPrimo;
//Ejercicios 20-28
public class ManipulacionArraysUnidimensionales {
  /*
   * Crea un Array del tamaño especificado, relleno con números aleatorios entre los intervalos
   * introducidos por el usuario(max & min).
   * @param size            tamaño del Array
   * @param minInterval     valor mínimo posible del Array
   * @param maxInterval     valor máximo posible del Array
   * @return                Array obtenido del tamaño indicado con números aleatorios dentro de los rangos.
  */
  public static int[] generaArrayInt (int size, int minInterval, int maxInterval){
    int [] arr = new int[size];
    for(int i=0; i<size; i++){
      arr[i] = (int)(Math.random() * (maxInterval + 1 - minInterval) + minInterval);
    }
    return arr;
  }
  
  
  /*
   * A partir de un Array unidimensional nos dice el valor mínimo que este contiene.
   * @param int[]arr        Array del que sacar el mínimo valor
   * @return                long número minimo que contiene el Array
  */
  public static long  minimoArrayInt (int[]arr){
    long min = Long.MAX_VALUE;
    for(int i=0; i<arr.length; i++){
      if(min > arr[i]){
        min = arr[i];
        } 
    }
    return min;
  }
  
  /*
   * A partir de un Array unidimensional nos dice el valor máximo que este contiene.
   * @param int[]arr        Array del que sacar el máximo valor
   * @return                long número máximo que contiene el Array
  */
  public static long  maximoArrayInt (int[]arr){
    long max = Long.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
      if(max < arr[i]){
        max = arr[i];
        } 
    }
    return max;
  }
  
  /*
   * A partir de un Array unidimensional la media de todos los valores que contiene.
   * @param int[]arr        Array del que la media
   * @return                long media de los valores que contiene el Array
  */
  public static long mediaArrayInt (int[]arr){
    long media = 0;
    for(int i=0; i<arr.length; i++){
      media += arr[i]; 
    }
    return media/(arr.length);
  }
  
  /*
   * Nos dice si un valor en concreto está dentro del Array que se pasa.
   * @param int[]arr        Array en el que buscar
   * @param numToSearch     Número que buscar en el Array
   * @return                boolean true si el número está en el Array, false al contrario
  */
  public static boolean estaEnArrayInt (int[]arr, int numToSearch){
    for(int iteration: arr){
      if(iteration == numToSearch){
        return true;
      }
    }
    return false;
  }
  
  /*
   * Nos dice si un valor en concreto está dentro del Array que se pasa utilizando
   * binary search.
   * @param int[]arr        Array en el que buscar
   * @param numToSearch     Número que buscar en el Array
   * @return                boolean true si el número está en el Array, false al contrario
  */
  public static boolean estaEnArrayIntBinarySearch (int[]arr, int numToSearch){
    int pointerLeft = 0;
    int pointerRight = arr.length - 1;
    int pointerMid = 0;
    while(pointerLeft <= pointerRight){
      pointerMid = pointerLeft + (pointerRight - pointerLeft) / 2;
      if(arr[pointerMid] == numToSearch) return true;
      if(arr[pointerMid] < numToSearch){
        pointerLeft = pointerMid + 1;
      } else{
        pointerRight = pointerMid - 1;
      }
    }
    return false;
  }
  
  /*
   * Busca un número dentro de un Array y nos dice su índice(si no se encuentra -1).
   * @param int[]arr        Array en el que buscar
   * @param numToSearch     Número que buscar en el Array
   * @return                int posición, si no se encuentra devuelve -1
  */
  public static int posicionEnArray (int[]arr, int numToSearch){
    for(int i=0; i<arr.length; i++){
      if(arr[i] == numToSearch){
        return i;
      }
    }
    return -1;
  }
  
  /*  
   * Le da la vuelta a la posición de los items del Array.
   * @param int[]arr        Array a dar la vuelta
   * @return                int[] volteado
  */
  public static int[] volteaArrayInt(int[]arr){
    int aux = 0;
    for(int i=0; i<arr.length/2; i++){
      aux = arr[i];
      arr[i] = arr[arr.length-1-i];
      arr[arr.length-1-i] = aux;
    }
    return arr;
  }
  
  /*  
   * Rota los números de un Array N posiciones a la derecha
   * @param int[]arr        Array rotar
   * @param rotacion        número de rotaciones a la derecha
   * @return                int[] con las rotaciones realizadas
  */
  public static int[] rotaDerechaArrayInt(int[]arr, int rotation){
    int aux = 0;
    for(int j=0; j<rotation; j++){
      aux = arr[arr.length-1];
      for(int i=arr.length-1; i>0; i--){
        arr[i] = arr[i - 1];
      }
      arr[0] = aux;
    }
    return arr;
  }
  
  /*  
   * Rota los números de un Array N posiciones a la izquierda
   * @param int[]arr        Array rotar
   * @param rotacion        número de rotaciones a la izquierda
   * @return                int[] con las rotaciones realizadas
  */
  public static int[] rotaIzquierdaArrayInt(int[]arr, int rotation){
    int aux = 0;
    for(int j=0; j<rotation; j++){
      aux = arr[0];
      for(int i=0; i<arr.length-1; i++){
        arr[i] = arr[i + 1];
      }
      arr[arr.length-1] = aux;
    }
    return arr;
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
    for(int item: arr){
      if(esPrimo(item)) aux[counter++] = item;
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
  
  /*
   * Esta función nos devuelve la concatenación de dos Arrays unidimensionales
   * de enteros.
   * 
   * @param arrA              Primer Array de números a concatenar
   * @param arrB              Segundo Array de números a concatenar
   * @return                  Array unidimensional con la concatenación de los dos.
  */ 
  public static int[] concatena(int[] arrA, int[] arrB){
    int result[] = new int[arrA.length + arrB.length];
    for(int i=0; i<arrA.length; i++){
      result[i] = arrA[i];
    }
    for(int i=0; i<arrB.length; i++){
      result[i+arrA.length] = arrB[i];
    }
    return result;
  }
  
  /*
   * Esta función nos devuelve un número del Array aleatoriamente.
   * 
   * @param a                 Array como input
   * @return                  Entero con el número seleccionado
  */
  public static int aleatorioDeArray(int[] a){
    return a[(int)(Math.random() * (a.length))];
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
    //Arreglar, no realiza la conversión
    int result = 0;
    for(int i=0; i<a.length; i++){
      result += ocurrencias(digito, a[i]);
    }
    return result;
  }
}
