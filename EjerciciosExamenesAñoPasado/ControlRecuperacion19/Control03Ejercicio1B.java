public class Control03Ejercicio1B {
  public static void main (String [] args){
    int size = 0;
    do{
      System.out.print("Indique el tamaño de la matriz cuadrada: ");
      size = Integer.parseInt(System.console().readLine());  
      if(size % 2 == 0 || size < 0){
        System.out.print("Incorrecto. Debe ser un valor impar y positivo.\n");
      }
    }while(size % 2 == 0 || size < 0);
    int [][] arr = new int[size][size];
    int sizeCounter = (size/2) + 1;
    int limit = size;
    for(int i = 0; i < sizeCounter; i++){
      for(int j = 0; j < limit; j++){
        //arriba
        arr[i][j + i ] = sizeCounter - i;
        //derecha
        arr[j + i][size - 1 - i ] = sizeCounter - i;
        //abajo
        arr[size - i - 1][j + i] = sizeCounter - i;
        //izq
        arr[j + i][i] = sizeCounter - i;
      }
      limit -= 2;
    }
    
    for(int i = 0; i < size; i++){
      for(int j = 0; j < size; j++){
        System.out.printf("%3d ",arr[i][j]);
      }
      System.out.println();
    }
  }
}
