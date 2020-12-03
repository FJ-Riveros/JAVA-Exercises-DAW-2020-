public class C07EjercicioB12 {
  public static void main (String [] args){
    final int ROWS = 9;
    final int COLUMNS = 9; 
    int [][] arr = new int[ROWS][COLUMNS];
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    int sum = 0;  
    for(int i=0;i<ROWS;i++){
      for(int j=0;j<COLUMNS;j++){ 
        arr[i][j] = (int)(Math.random()* 401) + 500;
        System.out.printf("%4d",arr[i][j]);
      }
      System.out.println();
    }
    System.out.print("\n Los que están en la diagonal son:\n");
    int counter = 0;
    for(int i=ROWS-1;i>=0;i--){
      sum += arr[i][counter];
      System.out.print(arr[i][counter] + " ");
      if(max < arr[i][counter]){
        max = arr[i][counter];
      }else if(min > arr[i][counter]){
        min = arr[i][counter];
      }
      counter++;
    }
    
    System.out.println("\nEl máximo es: " + max);
    System.out.println("El mínimo es: " + min);
    System.out.println("La media es: " + sum/10);
  }
}
