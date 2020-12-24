import Matematicas.OperacionesEnteros;
public class pruebaEnteros{
public static void main(String [] args){
    System.out.print("Introduzca un número :" );
    int num = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el digito a buscar :" );
    int digit = Integer.parseInt(System.console().readLine());
    System.out.println("Los digitos que tiene son " + Matematicas.OperacionesEnteros.posicionDeDigito(num,digit));
  }
}
