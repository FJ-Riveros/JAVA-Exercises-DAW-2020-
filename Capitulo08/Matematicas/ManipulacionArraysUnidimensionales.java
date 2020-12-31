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
  
  
}
