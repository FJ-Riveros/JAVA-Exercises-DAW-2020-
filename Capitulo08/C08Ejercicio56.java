public class C08Ejercicio56{
  public static void main(String [] args){
    
    String[] result = sinRepetir(arr);
    for(String item: result) System.out.print(item + " ");
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
    int[] result = new int[(x*2) + (y*2)];
    final int x = n[0].length;
    final int y = n.length;
    int counter = 0;
    for(int i=0; i<x; i++){
      result[counter++] = n[0][i];
    }
    for(int i=0; i<y; i++){
      result[counter++] = n[i][y-1];
    }
    for(int i=0; i<x; i++){
      result[counter++] = n[y-1][x-i-1];
    }
    for(int i=0; i<y; i++){
      result[counter++] = n[y-i-1][0];
    }
  }
  return result;
}
