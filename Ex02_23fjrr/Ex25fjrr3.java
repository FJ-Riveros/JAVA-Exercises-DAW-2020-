/*

@author: Francisco Javier Riveros Racero
Date: 16/12/2020
Turn: 2º

*/

public class Ex25fjrr3 {
  public static void main (String [] args){
    System.out.print("Indique el nº de filas de la matriz(1-10): ");
    final int ROWS = Integer.parseInt(System.console().readLine());
    System.out.print("Indique el nº de columnas de la matriz(1-15): ");
    final int COLUMNS = Integer.parseInt(System.console().readLine());
    System.out.print("Indique el valor mínimo del rango aleatorio (1-999): ");
    final int rangoMin = Integer.parseInt(System.console().readLine());
    System.out.print("Indique el valor máximo del rango aleatorio (1-999): ");
    final int rangoMax = Integer.parseInt(System.console().readLine());
    if((ROWS >= 1 && ROWS <= 10) && (COLUMNS >= 1 && COLUMNS <= 15)
        && (rangoMax >= 1 && rangoMax <= 999) && (rangoMax >= 1 && rangoMax <= 999)){
      int [][] arr = new int[ROWS][COLUMNS];
      for(int i=0; i<ROWS; i++){
        for(int j=0; j<COLUMNS; j++){
          arr[i][j] = (int)(Math.random()*(rangoMax-rangoMin+1))+rangoMin;
        }
      }
      System.out.println();
      for(int i=0; i<ROWS; i++){
        for(int j=0; j<COLUMNS; j++){
          System.out.printf("%4d", arr[i][j]);
        }
        System.out.println();
      }
      System.out.println();
      System.out.print("A continuación, se señalan los picos (^) y los valles (v):\n");
      int minValue,maxValue;
      for(int i=0; i<ROWS; i++){
        for(int j=0; j<COLUMNS; j++){
          minValue = Integer.MAX_VALUE;
          maxValue = Integer.MIN_VALUE;
          for(int k=i-1; k<=i+1; k++){
            for(int l=j-1; l<=j+1; l++){
              if((k>=0 && k<ROWS) && (l>=0 && l<COLUMNS)){
                if(arr[k][l] > maxValue){
                  maxValue = arr[k][l];
                }else if(arr[k][l] < minValue){
                  minValue = arr[k][l];
                }
              }
            } 
          }
          if(arr[i][j] == minValue){
            System.out.print(" v |");
          }else if(arr[i][j] == maxValue){
            System.out.print(" ^ |");
          }else{
            System.out.print("   |");
          }
        }
        System.out.println(); 
      }
    }
  }
}
