public class Random2 {
  public static void main (String [] args){
    int num1 = 0;
    int num2 = 0;
    for( int i = 0; i < 10; i++){
      System.out.print("Introduzca el primer número de la suma: ");
      num1 = Integer.parseInt(System.console().readLine());
      System.out.print("Introduzca el primer segundo de la suma: ");
      num2 = Integer.parseInt(System.console().readLine());
      System.out.println("El resultado es: " + ( num1 + num2 ));
    }
  }
}
