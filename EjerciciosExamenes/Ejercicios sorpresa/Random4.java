public class Random4 {
  public static void main (String [] args){
    int result = 1;
    System.out.print("Introduzca el número del que desea averiguar las potencias: ");
    int num = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el número de potencias que desea ver: ");
    int rounds = Integer.parseInt(System.console().readLine());
    System.out.println();
    for( int i = 1; i <= rounds; i ++){
      result = num * result;
      System.out.printf(" %1d %1s %d %s %d \n", num,"^", i, "=", result);
    }
  }
}
