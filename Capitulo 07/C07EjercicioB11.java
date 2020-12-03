public class C07EjercicioB11 {
  public static void main (String [] args){
    final int ROWS = 10;
    final int COLUMNS = 10;
    int [][] arr = new int[ROWS][COLUMNS];
    int min = 301;
    int max = 199;
    int sum = 0;
    for(int i=0;i<ROWS;i++){
      for(int j=0;j<COLUMNS;j++){ 
        arr[i][j] = (int)(Math.random()* 101) + 200;
        System.out.printf("%4d",arr[i][j]);
      }
      System.out.println();
    }
    System.out.print("\n Los que están en la diagonal son:\n");
    for(int i=0;i<ROWS;i++){
      for(int j=0;j<COLUMNS;j++){
        if( i == j){
          sum += arr[i][j];
          System.out.print(arr[i][j] + " ");
          if(max < arr[i][j]){
            max = arr[i][j];
          }else if(min > arr[i][j]){
            min = arr[i][j];
          }
        }
      }
    }
    
    System.out.println("\nEl máximo es: " + max);
    System.out.println("El mínimo es: " + min);
    System.out.println("La media es: " + sum/10);
  }
}
