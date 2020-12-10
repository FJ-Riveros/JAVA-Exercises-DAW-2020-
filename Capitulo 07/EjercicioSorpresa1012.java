public class EjercicioSorpresa1012{
  public static void main (String [] args){
    System.out.print("Introduzca el número de filas que desee: ");
    final int ROWS = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el número de columnas que desee: ");
    final int COLUMNS = Integer.parseInt(System.console().readLine());
    int[] arr = new int[ROWS*COLUMNS];
    for(int i=0; i<arr.length; i++){
      arr[i]= (int)(Math.random()*100) + 1;
    }
    System.out.println("Matriz unidimensional:\n");
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    System.out.println("\nMatriz bidimensional:\n");
    int counter = 0;
    for(int i=0; i<arr.length; i++){
      if(counter==COLUMNS){
        System.out.println();
        System.out.printf("%4d",arr[i]);
        counter=1;
      }else{
        System.out.printf("%4d",arr[i]);
        counter++;
      }
    }
    System.out.println();
    System.out.print("Introduzca la fila que desee: ");
    int inputFila= Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la columna que desee: ");
    int inputCol= Integer.parseInt(System.console().readLine());
    System.out.println();
    System.out.printf("%-4d",arr[inputFila*COLUMNS+inputCol]);
  }
}
