public class C07Ejercicio12 {
  public static void main (String [] args){
    //NO TERMINADO
    int[] original = new int[10];
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
    
    int auxInicial = original[inicial];
    for( int i = 0; i < 10; i++){
      System.out.print(original[i] + " ");
    }
    int aux = original [9];
    for( int i = 9; i > 0; i--){
      original[i] = original[i - 1];
    }
    original[0] = aux;
    System.out.println();
    for( int i = 0; i < 10; i++){
      System.out.print(original[i] + " ");
    }
  }
}
