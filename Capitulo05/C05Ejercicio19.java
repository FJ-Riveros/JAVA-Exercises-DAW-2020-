public class C05Ejercicio19 {
  public static void main (String [] args){
    System.out.println("Introduzca la altura que desea para la piramide");
    int h = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca el símbolo del que estará compuesta la pirámide");
    String symbol = System.console().readLine();
    for( int i = 1; i <= h; i++){
      for(int j = 0; j < (h - i); j++){
        System.out.print(" ");
      }
      for(int k = 1; k <= ((i * 2) - 1); k++){
        System.out.print(symbol);
      }
      System.out.println();
    }
  }
}
