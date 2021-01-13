import static Matematicas.OperacionesEnteros.esCapicua;
import static Matematicas.OperacionesEnteros.esPrimo;

public class C08Ejercicio51{
  public static void main(String [] args){
    int[] arr = new int[10];
    String textPrimo = "";
    String textCapicua = "";
    for(int i=0; i<arr.length; i++){
      arr[i] = (int)(Math.random()*(100+1-2))+2;
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    for(int prueba: arr){
      textCapicua = esCapicua((long)prueba) ? "es capicúa" : "no es capicúa";
      textPrimo = esPrimo(prueba) ? " es primo" : " no es primo";
      System.out.println("El " + prueba + textPrimo + " y " + textCapicua);
    }
  }
}
