public class Ejercicio03{
  public static void main(String [] args){
    int[] prueba = {1, 2, 3, 4, 5, 6};
    int[][] pruebaMatriz = {{1, 2, 3, 4},{5, 6, 7, 8}, {9, 10, 11, 12}},
    for(int item: prueba) System.out.print(item + " ");
    int[] result1 = RotarColumnaALaIzquierda(prueba);
    System.out.println();
    for(int item: result1) System.out.print(item + " ");
    System.out.println("Bidi");
    int[] result2 = RotarColumnaALaIzquierda(pruebaMatriz);
    for(int i=0; i<pruebaMatriz.length; i++){
      for(int j=0; j<pruebaMatriz[0].length; j++){
        System.out.print(pruebaMatriz[i][j]);
      }
      System.out.println();
    }
  }
  
  public static int[] RotarColumnaALaIzquierda(int [] vector){
    int[] result = vector;
    int aux = result[0];
    for(int i=0; i<result.length-1; i++){
      result[i] = result[i+1]; 
    }
    result[result.length-1] = aux; 
    return result;
  }
  
  public static int[][] RotarColumnaALaIzquierda(int [][] vector){
    int[] aux = vector[0].length;
    for(int i=0; i<vector.length; i++){
      for(int j=0; j<vector[0].length; j++){
        aux[j] = vector[i][j];
      }
      aux = auRotarColumnaALaIzquierda(aux);
      for(int y=0; y<vector[0].length; y++){
        vector[i][j] = aux[j];
      }
    }
    return vector;
  }
}
