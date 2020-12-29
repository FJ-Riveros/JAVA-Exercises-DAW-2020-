import Matematicas.ConversorDeSistemas;
public class pruebaEnteros{
public static void main(String [] args){
    System.out.print("Introduzca un número :" );
    //String num = System.console().readLine();
    //System.out.print("Introduzca el digito a buscar :" );
    long num = Integer.parseInt(System.console().readLine());
    System.out.println("Los digitos que tiene son " + Matematicas.ConversorDeSistemas.conversorBinarioDecimal(num));
  }
}
