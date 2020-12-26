import Matematicas.OperacionesEnteros;
public class C08Ejercicio15{
  public static void main (String [] args){
    System.out.print("Los números primos comprendidos entre 1-1000 son: \n");
    for(int i = 1; i <= 1000; i++){
      if(Matematicas.OperacionesEnteros.esPrimo(i)){
        System.out.print(i + " ");
      }
    }
  }
}
