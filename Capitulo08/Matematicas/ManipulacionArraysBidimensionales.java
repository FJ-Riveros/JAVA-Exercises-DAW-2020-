package Matematicas;
public class ManipulacionArraysBidimensionales{
  public static int[][] generaArrayBiInt(int rows, int columns, int minInterval, int maxInterval){
    int[][] arr = new int[rows][columns];
    for(int i=0; i<rows; i++){
      for(int j=0; j<columns; j++){
        arr[i][j] = (int)(Math.random() * (maxInterval + 1 - minInterval) + minInterval);
      }
    }
    return arr;
  }
}
