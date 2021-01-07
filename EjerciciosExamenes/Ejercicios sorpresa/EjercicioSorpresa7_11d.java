public class EjercicioSorpresa7_11d{
  public static void main(String [] args){
    System.out.print("Introduzca las filas del Array: ");
    final int ROWS = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca las columnas del Array: ");
    final int COLUMNS = Integer.parseInt(System.console().readLine());
    int[][] arr = new int[ROWS][COLUMNS];
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr[0].length; j++){
        arr[i][j] = (int)(Math.random()*10+10);
      }
    }
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr[0].length; j++){
        System.out.printf("%-4d",arr[i][j] );
      }
      System.out.println();
    }
    int[] aux = new int[arr.length];
    for(int i=0; i<arr.length; i++){
        aux[i] = arr[i][arr[0].length-1];
      }
    for(int i=arr[0].length-1; i>0; i--){
      for(int j=0; j<arr.length; j++){
        arr[j][i] = arr[j][i-1];
      } 
    }
    for(int i=0; i<arr.length; i++){
      arr[i][0] = aux[i];
    }
    System.out.println();
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr[0].length; j++){
        System.out.printf("%-4d",arr[i][j] );
      }
      System.out.println();
    }
  }
}
