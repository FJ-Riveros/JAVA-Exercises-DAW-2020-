public class C05Ejercicio34 {
  public static void main (String [] args){
    System.out.print("Introduzca el primer número: ");
    int num1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el segundo número: ");
    int num2 = Integer.parseInt(System.console().readLine());
    int num1Reverse = 0;
    int num2Reverse = 0;
    long totalPares = 0;
    long paresFinal = 0;
    while( num2 > 0 ){
      num2Reverse = num2 % 10;
      if( num2Reverse % 2 == 0 ){
        totalPares = (totalPares * 10 ) + num2Reverse;
      }
      num2 /= 10;
      num1Reverse = num1 % 10;
      if( num1Reverse % 2 == 0 ){
        totalPares = (totalPares * 10 ) + num1Reverse;
      }
      num1 /= 10;
    }
    while( totalPares > 0 ){
      paresFinal = (paresFinal * 10) + (totalPares % 10);
      totalPares /= 10; 
    }
    System.out.println("El número par formado por los números introducidos es: " + paresFinal);
  }
}
