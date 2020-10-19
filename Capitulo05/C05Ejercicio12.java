public class C05Ejercicio12 {
  public static void main (String [] args){
    int num = 0;
    int a = 0;
    int b = 1;
    int result = 0;
    int temp = 0;
    System.out.println("Introduzca el número de terminos Fibonacci que desea ver: ");
    num = Integer.parseInt(System.console().readLine());
    for( int i = 0; i <= num; i++ ){
      if( i == 0 ){
        System.out.println("0");
      }else if( i == 1 ){
        System.out.println("0 1");
      }else{
      result = a + b;
      temp = b;
      System.out.print( result );
      a = result;
      }
    }
  }
}
