import static Matematicas.OperacionesEnteros.esCapicua;
import static Matematicas.OperacionesEnteros.esPrimo;

public class C08Ejercicio51{
  public static void main(String [] args){
    String[] primo = {"no es primo", "es primo"};
    String[] capicua = {"no es capicúa", "es capicúa"};
    int[] arr = new int[10];
    String primo = "";
    String capicua = "";
    for(int item: arr){
      item = (int)(Math.random()*(100+1-2))+2;
      System.out.print(item + " ");
    }
    for(int item: arr){
      capicua = esCapicua((long)item) ? "es capicúa" : "no es capicúa";
      primo = esPrimo((long)item) ? "es primo" : "no es primo";
      System.out.println("El " + item + primo + " y " + capicua);
    }
  }
}
