/*

@author: Francisco Javier Riveros Racero
Date: 14/01/2020
Turn: 2º

*/

public class Ex25fjrr2 {
  public static void main (String [] args){
    System.out.print("Indique el tamaño de la matriz bidimensional - filas: ");
    final int ROWS = Integer.parseInt(System.console().readLine());
    System.out.print("Indique el tamaño de la matriz bidimensional - columnas: ");
    final int COLUMNS = Integer.parseInt(System.console().readLine());
    int[][] arr = new int[ROWS][COLUMNS];
    System.out.print("Indique extremo inferior rango aleatorio para rellenar la matriz: ");
    final int MIN = Integer.parseInt(System.console().readLine());
    System.out.print("Indique extremo superior rango aleatorio para rellenar la matriz: ");
    final int MAX = Integer.parseInt(System.console().readLine());
    int extracciones = 0;
    do{
      System.out.print("Indique la cantidad de valores aleatorios que desea extraer: ");
      extracciones = Integer.parseInt(System.console().readLine());
      if(extracciones > ROWS*COLUMNS){
        System.out.print("Valor excesivo. ");
      }
    }while(extracciones > ROWS*COLUMNS);
    System.out.print("La matriz bidimensional tiene los siguientes valores: \n");
    int referenceValue = MIN-1;
    int counter = 0;
    for(int i=0; i<ROWS; i++){
      for(int j=0; j<COLUMNS; j++){
        arr[i][j] = (int)(Math.random() * (MAX+1-MIN) + MIN);
        System.out.printf("%5d", arr[i][j]);
      }
      System.out.println();
    }
    System.out.println();
    System.out.print("\nLos valores aleatoriamente obtenidos de la matriz son: \n");
    int xRandom = 0;
    int yRandom = 0;
    do{
      yRandom = (int)(Math.random() * ROWS);
      xRandom = (int)(Math.random() * COLUMNS);
      if(arr[yRandom][xRandom] != referenceValue){
        System.out.print(arr[yRandom][xRandom] + " ");
        arr[yRandom][xRandom] = referenceValue;
        counter++;
      }
    }while(counter < extracciones);
  }
}
