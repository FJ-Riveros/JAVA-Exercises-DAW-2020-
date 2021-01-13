import static Matematicas.ManipulacionArraysBidimensionales.generaArrayBiInt;
public class C08Ejercicio53{
  public static void main(String [] args){
    int[][] arr = generaArrayBiInt(10, 10, 50, 100);
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr[0].length; j++){
        System.out.printf("%4d",arr[i][j]);
      }
      System.out.println();
    }
    System.out.print("Introduzca la posición que desee escoger: ");
    int pos = Integer.parseInt(System.console().readLine());
    System.out.print("El número seleccionado es el: " + nEsimo(arr, pos));
  }
  
  /*
   * Esta función nos devuelve un número del Array aleatoriamente.
   * 
   * @param a                 Array como input
   * @return                  Entero con el número seleccionado
  */
  public static int nEsimo(int[][] n, int posicion){
    if(posicion < (n[0].length + n.length)){
      return n[posicion/(n[0].length)][posicion%(n[0].length)];
    }else{
      return -1;
    }
  }
}
