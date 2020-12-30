package Matematicas;
public class ManipulacionArraysUnidimensionales {
  public static int[] generaArrayInt (int size, int minInterval, int maxInterval){
    int [] arr = new int[size];
    for(int i=0; i<size; i++){
      arr[i] = (int)(Math.random() * (maxInterval + 1 - minInterval) + minInterval);
    }
    return arr;
  }
}
