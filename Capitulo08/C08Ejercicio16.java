import Matematicas.OperacionesEnteros;
public class C08Ejercicio16{
  public static void main (String [] args){
    System.out.print("Los números capicúa comprendidos entre 1-99999 son: \n");
    for(int i = 1; i <= 99999; i++){
      if(Matematicas.OperacionesEnteros.esCapicua(i)){
        System.out.print(i + " ");
      }
    }
  }
}
