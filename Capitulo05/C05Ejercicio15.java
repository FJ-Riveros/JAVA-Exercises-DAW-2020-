public class C05Ejercicio15 {
  public static void main (String [] args){
    int result = 0;
    System.out.print("Introduzca el número del que desea averiguar las potencias: ");
    int num = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el número de potencias que desea ver: ");
    int rounds = Integer.parseInt(System.console().readLine());
    System.out.println();
    for( int i = 1; i <= rounds; i ++){
      if( i == 1 ){
        result = num;
      }else{
        result = num * result;
      }
      System.out.printf(" %1d %2s %2d %s %d \n", num,"^", i, "=", result);
    }
  }
}
