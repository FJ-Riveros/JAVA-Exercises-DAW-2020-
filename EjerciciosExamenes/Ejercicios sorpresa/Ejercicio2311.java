public class Ejercicio2311 {
  public static void main( String [] args ) {
    int[] arr1 = new int[5];
    int[] arr2 = new int[8];
    int[] arrResultado = new int[13];
    
    for(int i = 0; i < 5; i++) {
      System.out.print( "Introduzca un número para el arr1 le quedan " + (5 - i) + " números por introducir:");
      arr1[i] = Integer.parseInt(System.console().readLine());
    }
    for(int i = 0; i < 8; i++) {
      System.out.print( "Introduzca un número para el arr2 le quedan " + (8 - i) + " números por introducir:");
      arr2[i] = Integer.parseInt(System.console().readLine());
    }
    int counter = 0;
    for(int i = 0; i < 5; i++){
      arrResultado[counter++] = arr1[i];
    }
    for( int i = 0; i < 8; i++) {
      arrResultado[counter++] = arr2[i];
    }
    System.out.print("\nLa concatenación es: \n");
    for( int n: arrResultado ){
      System.out.print(n + " ");
    }
  }
}
