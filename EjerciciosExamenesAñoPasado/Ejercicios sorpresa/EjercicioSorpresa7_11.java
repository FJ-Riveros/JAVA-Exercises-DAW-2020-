public class EjercicioSorpresa7_11{
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
    int aux = 0;
    for(int j=0; j<arr.length;j++){
      aux = arr[j][arr[0].length-1];
      for(int i=arr[0].length-1; i>0; i--){
        arr[j][i] = arr[j][i-1];
      }
      arr[j][0] = aux;
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
