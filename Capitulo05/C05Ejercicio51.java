public class C05Ejercicio51{
  public static void main (String [] args){
    System.out.print("Introduzca un número entero( mayor que cero): ");
    long num = Long.parseLong(System.console().readLine());
    long aux = num;
    long exp = 0;
    while( aux > 0 ){
      exp = (exp * 10) + (aux % 10);
      aux /= 10;
    }
    aux = 0;
    while( exp > 0 ){
      if( exp % 10 != 0 && exp % 10 != 8 ){
        aux = (aux * 10) + (exp % 10);
      }
      exp /= 10;
    }
    System.out.println(aux);
  }
}
