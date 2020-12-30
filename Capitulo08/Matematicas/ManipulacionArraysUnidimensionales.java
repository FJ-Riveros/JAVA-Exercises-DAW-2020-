package Matematicas;
public class ManipulacionArraysUnidimensionales {
  public static int[] generaArrayInt (int size, int minInterval, int maxInterval){
    int [] arr = new int[size];
    for(int i=0; i<size; i++){
      arr[i] = (int)(Math.random() * (maxInterval + 1 - minInterval) + minInterval);
    }
    return arr;
  }
  
  public static long  minimoArrayInt (int[]arr){
    long min = Long.MAX_VALUE;
    for(int i=0; i<arr.length; i++){
      if(min > arr[i]){
        min = arr[i];
        } 
    }
    return min;
  }
}
