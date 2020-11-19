public class C07Ejercicio12 {
  public static void main (String [] args){
    int[] original = new int[10];
    int[] result = new int[10];
    int inicial = 0;
    int fin = 0;
    for(int i = 0; i < 10; i++){
      System.out.print("Introduzca un número, le quedan " + (10 - i) + " números por introducir: ");
      original[i] = Integer.parseInt(System.console().readLine());
    }
    do{
      System.out.print("Introduzca la posición inicial(entre 0-9): ");
      inicial = Integer.parseInt(System.console().readLine());
    }while( inicial < 0 || inicial > 9 );
    do{
      System.out.print("Introduzca la posición final(ha de ser mayor que la inicial( " + inicial + " y entre 0-9): ");
      fin = Integer.parseInt(System.console().readLine());
    }while ( fin <= inicial || fin < 0 || fin > 9 );
    for( int i = 0; i < 10; i++){
      result[i] = original[i];
    }
    int aux = original [9];
    result[fin] = original[inicial];
    for( int i = fin + 1; i < 10; i++){
      result[i] = original[i - 1];
    }
    result[0] = aux;
    for( int i = inicial; i > 0; i--){
      result[i] = original[i - 1];
    }
    System.out.println();
    for( int i = 0; i < 10; i++){
      System.out.print(original[i] + " ");
    }
    System.out.println();
    System.out.println();
    for( int i = 0; i < 10; i++){
      System.out.print(result[i] + " ");
    }
  }
}
