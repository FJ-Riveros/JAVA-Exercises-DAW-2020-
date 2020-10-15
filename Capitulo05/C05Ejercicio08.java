public class C05Ejercicio08 {
  public static void main (String [] args){
    int num = 0;
    int result = 0;
    System.out.print("Introduzca el número del que desea averigüar la tabla hasta n * 10: ");
    num = Integer.parseInt(System.console().readLine());
    System.out.println();
    for( int i = 0; i <= 10; i ++){
      result = num * i;
      System.out.printf(" %1d %1s %d %s %d \n", num,"*", i, "=", result);
    }
  }
}
