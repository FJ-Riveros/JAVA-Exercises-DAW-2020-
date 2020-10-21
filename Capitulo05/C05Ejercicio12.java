public class C05Ejercicio12 {
  public static void main (String [] args){
    int a = 0;
    int result = 0;
    int temp = 0;
    System.out.println("Introduzca el número de terminos Fibonacci que desea ver: ");
    int num = Integer.parseInt(System.console().readLine());
    for( int i = 0; i <= num; i++ ){
      if( i == 0 ){
        result = 0;
      }else if ( i == 1 ){
        result = 1;
      }else{
        temp = result;
        result += a;
        a = temp;
      }
      System.out.print(result + " ");
    }
  }
}
