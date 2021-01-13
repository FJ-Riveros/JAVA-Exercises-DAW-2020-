import static Matematicas.OperacionesEnteros.esPrimo;
public class EjercicioSorpresa13_01{
  public static void main(String [] args){
    boolean hayPrimos = false;
    System.out.print("Introduzca el número de filas que desea: ");
    final int ROWS = Integer.parseInt(System.console().readLine());
    int[][] arr = new int[ROWS][ROWS*2];
    System.out.print("Introduzca el máximo valor: ");
    final int MAX = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el mínimo valor: ");
    final int MIN = Integer.parseInt(System.console().readLine());
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr[0].length; j++){
        arr[i][j] = (int)(Math.random()*(MAX+1-MIN) + MIN);
      }
    }
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr[0].length; j++){
        System.out.printf("%4d", arr[i][j]);
      }
      System.out.println();
    }
    System.out.println("Los números primos son: ");
    for(int i=0; i<arr.length; i++){
      for(int j=i*2; j<(i*2)+2; j++){
        if(esPrimo(arr[i][j])){
          hayPrimos = true;
          System.out.print(arr[i][j] + " ");
        }
      }
    }
    if(!hayPrimos) System.out.print("No hay primos");
  }
}
