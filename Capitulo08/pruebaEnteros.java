import Matematicas.OperacionesEnteros;
public class pruebaEnteros{
public static void main(String [] args){
    System.out.print("Introduzca un número :" );
    int num = Integer.parseInt(System.console().readLine());
    System.out.println("Los digitos que tiene son " + Matematicas.OperacionesEnteros.esCapicua(num));
  }
}
