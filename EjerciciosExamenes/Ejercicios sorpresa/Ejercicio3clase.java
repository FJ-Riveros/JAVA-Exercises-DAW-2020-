public class Random3 {
  public static void main (String [] args){
    int result;
    System.out.print("Introduzca el número del que desea averiguar la tabla: ");
    int num = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el número de filas que desea: ");
    int rounds = Integer.parseInt(System.console().readLine());
    System.out.println();
    for( int i = 1; i <= rounds ; i ++){
      result = num * i;
      System.out.printf(" %1d %1s %d %s %d \n", num,"*", i, "=", result);
    }
  }
}
