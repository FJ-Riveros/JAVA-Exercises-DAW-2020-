public class C04Ejercicio13{
  public static void main(String [] args){
    int a;
    int b;
    int c;
    int temp;
    System.out.println("Este programa ordena 3 enteros");
    System.out.println("Introduzca el primer entero");
    a = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca el segundo entero");
    b = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca el tercer entero");
    c = Integer.parseInt(System.console().readLine());
    if( a > b ){
      temp = a;
      a = b;
      b = temp;
    }
    if( b > c ){
      temp = b;
      b = c;
      c = temp;
    }
    if( a > b ){
      temp = a;
      a = b;
      b = temp;
    }
    System.out.println("El orden de menor a mayor sería " + a + " " + b + " " + c);
  }
}
