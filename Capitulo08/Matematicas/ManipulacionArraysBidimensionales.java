package Matematicas;
public class ManipulacionArraysBidimensionales{
  /*  
   * Crea un Array bidimensional de las filas y columnas deseadas, además de 
   * rellenarla con números aleatorios dentro del mínimo y máximo valor introducido
   * por el usuario.
   * @param rows            Columnas que tendrá el Array bidi
   * @param columns         Filas que tendrá el Array bidi
   * @param minInterval     Valor máximo que contendrá el Array bidi
   * @param maxInterval     Valor mínimo que contendrá el Array bidi
   * @return                int[][] con el size y valores establecidos por el usuario
  */
  public static int[][] generaArrayBiInt(int rows, int columns, int minInterval, int maxInterval){
    int[][] arr = new int[rows][columns];
    for(int i=0; i<rows; i++){
      for(int j=0; j<columns; j++){
        arr[i][j] = (int)(Math.random() * (maxInterval + 1 - minInterval) + minInterval);
      }
    }
    return arr;
  }
  
  /*  
   * Devuelve la fila que se indica del Array bidi como parámetro
   * @param int[][]         Array bidimensional que introduce el usuario
   * @param rowDeseada      Fila que se desea obtener del Array bidi
   * @return                int[] con la fila deseada por el usuario 
  */
  public static int[] filaDeArrayBiInt(int[][] arr, int rowDeseada){
    int[] arrResult = new int[arr[0].length];
    for(int i=0; i<arr[0].length; i++){
      arrResult[i] = arr[rowDeseada][i];
    }
    return arrResult;
  }
  
  /*  
   * Devuelve la posición de el número indicado dentro de un array bidi
   * si el número no es encontrado se devuelve {-1,-1}
   * @param int[][]         Array bidimensional que introduce el usuario
   * @param numDeseado      Número introducido a buscar dentro del array bidi
   * @return                Array unidimensional con la posición del número, si no se encuentra {-1,-1} 
  */
  public static int[] coordenadasEnArrayBiInt(int[][] arr, int numeroDeseado){
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr[0].length; j++){
        if(arr[i][j] == numeroDeseado){
          int[] pos = {i,j};
            return pos;
          }  
        //return "{" + i + "," + j + "}";
      }
    }
    int[] pos = {-1, -1};
    return pos;
  }
  
  /*  
   * Devuelve true si el número introducido es mínimo en su fila y máximo
   * en su columna(punto de silla)
   * @param int[][]         Array bidimensional que introduce el usuario
   * @param       Número introducido a buscar dentro del array bidi
   * @return                String con la posición del número, si no se encuentra {-1,-1} 
  */
  public static boolean esPuntoDeSilla(int[][] arr, int filaNumero, int columnaNumero){
    
    return true;
  }
}
