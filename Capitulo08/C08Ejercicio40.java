import static Matematicas.OperacionesEnteros.digitos;
import static Matematicas.OperacionesEnteros.digitoN;

public class C08Ejercicio40{
  public static void main(String [] args){
    int[] prueba = {3, 32, 47, 907};
    int[] result = filtraCon7(prueba);
    for(int item: result){
      System.out.print(item + " ");
    }
  }
  
  
  /* Devuelve un Array con todos los números que contienen el 7 que se incluyen
   * en el Array Input.
   * @param x           Array input a filtrar
   * @return            Array con los items que contengan un 7
  */
  
  //Terminar
  public static int[] filtraCon7(int x[]){
    int[] aux = new int[x.length];
    int currentNummer = 0;
    int currentDigits = 0;
    boolean check = false;
    int counter = 0;
    int counterArr = 0;
    for(int i=0; i<x.length; i++){
      currentNummer = x[i];
      currentDigits = digitos(currentNummer);
      check = false;
      counter = 0;
      do{
        if(digitoN(currentNummer,i) == 7) check = true;
        counter++;
      }while(counter<currentDigits && digitoN(currentNummer,i)!= 7);
      if(check) aux[counterArr++] = currentNummer;
    }
    return aux;
  }
}
