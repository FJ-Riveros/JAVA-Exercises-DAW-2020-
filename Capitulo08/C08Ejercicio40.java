import static Matematicas.OperacionesEnteros.digitos;
import static Matematicas.OperacionesEnteros.digitoN;

public class C08Ejercicio40{
  public static void main(String [] args){
    
  }
  
  
  /* Devuelve un Array con todos los números que contienen el 7 que se incluyen
   * en el Array Input.
   * @param x           Array input a filtrar
   * @return            Array con los items que contengan un 7
  */
  public static int[] filtraCon7(int x[]){
    int[] aux = new int[x.length];
    int currentNummer = 0;
    int currentDigits = 0;
    boolean check = false;
    int counter = 0;
    int counterArr = 0;
    for(int i=0; i<arr.length; i++){
      currentNummer = x[i];
      currentDigits = digitos(currentNummer);
      check = false;
      counter = 0;
      do{
        if(digitoN(currentNummer) == 7) check = true;
        counter++;
      }while(counter<currentDigits && digitoN(currentNummer)!= 7);
      if(check) aux[counterArr++] = currentNummer;
    }
    return aux;
  }
}
