import static Matematicas.OperacionesEnteros.digitos;
import static Matematicas.OperacionesEnteros.digitoN;

public class C08Ejercicio40{
  public static void main(String [] args){
    int[] prueba = {0, 17, 07, 906};
    int[] result = filtraCon7(prueba);
    for(int i=0; i<result.length; i++){
      System.out.print(result[i] + " ");
    }
  }
  
  
  /* Devuelve un Array con todos los números que contienen el 7 que se incluyen
   * en el Array Input.
   * @param x           Array input a filtrar
   * @return            Array con los items que contengan un 7
  */
  public static int[] filtraCon7(int x[]){
    int[] aux = new int[x.length];
    int currentNummer = 0;
    int totalDigits = 0;
    boolean check = false;
    int counter = 0;
    int counterArr = 0;
    int currentDigit = 0;
    for(int i=0; i<x.length; i++){
      currentNummer = x[i];
      totalDigits = digitos(currentNummer);
      check = false;
      counter = 0;
      do{
        currentDigit = digitoN(currentNummer,counter);
        if( currentDigit == 7) check = true;
        counter++;
      }while(counter<totalDigits && currentDigit != 7);
      if(check) aux[counterArr++] = currentNummer;
    }
    if(counterArr != 0){
      int[] result = new int[counterArr];
      for(int i=0; i<counterArr; i++){
        result[i] = aux[i];
      }
      return result;
    }
    int[] result = {-1};
    return result;
  }
}
