import Matematicas.OperacionesEnteros.esCapicua;

public class C08Ejercicio51{
  public static void main(String [] args){
    int[] arr = new int[10];
    for(int item: arr){
      item = (int)(Math.random()*(100+1-2))+2;
      System.out.print(item + " ");
    }
    for(int item: arr){
      System.out.println("El " + item + );
    }
  }
}
