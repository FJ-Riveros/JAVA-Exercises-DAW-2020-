public class Random4 {
  public static void main (String [] args){
    int result;
    System.out.print("Introduzca el número del que desea averiguar las potencias: ");
    int num = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el número de filas que desea: ");
    int rounds = Integer.parseInt(System.console().readLine());
    System.out.println();
    for( int i = 1; i <= rounds ; i ++){
      result = num * i;
      for( int j = 0; j <= 
      System.out.printf(" %1d %1s %d %s %d \n", num,"*", i, "=", result);
    }
  }
}
