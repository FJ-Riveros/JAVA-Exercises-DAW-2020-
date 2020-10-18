public class C05Ejercicio11 {
  public static void main (String [] args){
    int num = 0;
    System.out.print("Introduzca el número deseado, del cual se mostrará el cuadrado y el cubo del mismo: ");
    num = Integer.parseInt(System.console().readLine());
    for( int i = num + 1; i <= ( num + 5); i++){
      System.out.println( i + " " + (i * i) + " " + " " + (i * i * i));
    }
  }
}
