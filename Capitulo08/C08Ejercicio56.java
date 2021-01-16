import static Matematicas.ManipulacionArraysBidimensionales.generaArrayBiInt;
public class C08Ejercicio56{
  public static void main(String [] args){
    
    int[][] input = generaArrayBiInt(8,8,1,99);
    for(int i=0; i<input.length; i++){
      for(int j=0; j<input[0].length; j++){
        System.out.printf("%5d",input[i][j]);
      }
      System.out.println();
    }
    System.out.println();
    System.out.println();
    for(int item: corteza(input)) System.out.print(item + " ");
  }
  
  /*
   *  Extrae la capa exterior de un Array bidimensional y lo devuelve en un   
   *  único Array unidimensional.
   * 
   * @param n                 Array bidimensional a extraer la corteza
   * @return                  Array unidimensional que contiene la corteza del 
   *                          Array bidimensional.
  */
  public static int[] corteza(int[][] n){
    final int x = n[0].length;
    final int y = n.length;
    System.out.print(x + " " + y);
    System.out.println();
    int[] result = new int[((x*2) + (y*2))-3];
    int counter = 0;
    for(int i=0; i<x; i++){
      result[counter++] = n[0][i];
    }
    for(int i=1; i<y; i++){
      result[counter++] = n[i][x-1];
    }
    for(int i=1; i<x; i++){
      result[counter++] = n[y-1][x-i-1];
    }
    for(int i=1; i<y; i++){
      result[counter++] = n[y-i-1][0];
    }
    return result;
  }
}
