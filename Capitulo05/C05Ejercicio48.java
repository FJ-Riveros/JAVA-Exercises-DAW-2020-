public class C05Ejercicio48 {
  public static void main (String [] args){
    System.out.print("Introduzca un número entero: ");
    long num = Long.parseLong(System.console().readLine());
    long aux;
    int counter = 0;
    int digit = 0;
    boolean check = false;
    String result = "";
    String neg = "";
    
    for( int i = 0; i < 10; i++){
      check = false;
      aux = num;
      while( aux > 0 ){
        if( i == aux % 10 ){
          check = true;
        }
        aux /= 10;
      }
      if( check ){
        result = result + " " + i;
      }
    }
    
    for( int i = 0; i < 10; i++){
      aux = num;
      check = false;
      while( aux > 0 ){
        if( i == aux % 10){
          check =  true;
        }
        aux /= 10;
      }
      if( !check ){
        neg = neg + " " + i;
      }
    }
    System.out.println("Los dígitos que aparecen en el número son: " + result);
    System.out.println("Y los que no aparecen son: " + neg);
  }
}
