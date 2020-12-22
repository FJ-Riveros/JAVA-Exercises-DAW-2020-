import Matematicas.OperacionesEnteros;
public class pruebaEnteros{
public static void main(String [] args){
    System.out.print("Introduzca un número :" );
    int input = Integer.parseInt(System.console().readLine());
    System.out.println("El siguiente primo es el " + Matematicas.OperacionesEnteros.siguientePrimo(input));
  }
}
