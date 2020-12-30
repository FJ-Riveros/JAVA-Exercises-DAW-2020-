import Matematicas.ConversorDeSistemas;
public class pruebaEnteros{
public static void main(String [] args){
    System.out.print("Introduzca un número :" );
    //String num = System.console().readLine();
    //System.out.print("Introduzca el digito a buscar :" );
    int num = Integer.parseInt(System.console().readLine());
    int exponente = Integer.parseInt(System.console().readLine());
    //System.out.println("Los digitos que tiene son " + Matematicas.OperacionesEnteros.potencia(num, exponente));
    int[] arr1 = Matematicas.ManipulacionArraysUnidimensionales.generaArrayInt(5, 10, 20);
    for(int i=0; i< arr1.length; i++){
      System.out.print(arr1[i] + " ");
    }
  }
}
