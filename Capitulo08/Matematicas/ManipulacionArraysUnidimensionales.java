package Matematicas;
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
  
}