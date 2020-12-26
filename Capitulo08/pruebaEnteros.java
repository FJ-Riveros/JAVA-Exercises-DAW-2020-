import Matematicas.OperacionesEnteros;
public class pruebaEnteros{
public static void main(String [] args){
    System.out.print("Introduzca un número :" );
    int num = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el digito a buscar :" );
    int empieza = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el digito a buscar :" );
    int termina = Integer.parseInt(System.console().readLine());
    System.out.println("Los digitos que tiene son " + Matematicas.OperacionesEnteros.trozoDeNumero(num, empieza, termina));
  }
}
