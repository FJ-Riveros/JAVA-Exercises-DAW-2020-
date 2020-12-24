import Matematicas.OperacionesEnteros;
public class pruebaEnteros{
public static void main(String [] args){
    System.out.print("Introduzca un número :" );
    int base = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca un exponente :" );
    int exp = Integer.parseInt(System.console().readLine());
    System.out.println("La potencia es " + Matematicas.OperacionesEnteros.potencia(base, exp));
  }
}
