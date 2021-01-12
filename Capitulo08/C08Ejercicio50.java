public class C08Ejercicio50{
  public static void main(String [] args){
    int[] arra = {0,5,3,8};
    int[] arrb = {1};
    
    for(int item: mezcla(arra, arrb)) System.out.print(item + " ");
    
  }
  /*
   * Devuelve un Array, cada item es como se lee la concatenación de los números
   *que se pasan como parámetros.(Look and say)
   * 
   * @param a              Primer Array de números a concatenar
   * @param b              Segundo Array de números a concatenar
   * @return               Array unidimensional con la concatenación de los dos
   *                       alternamente.
  */ 
  public static int[] mezcla(int[] a, int[] b){
    int[] result = new int[a.length + b.length];
    int counterA = 0;
    int counterB = 0;
    int counterResult = 0;
    do{
      if(counterA < a.length){
        result[counterResult++] = a[counterA];
        counterA++;
      }
      if(counterB < b.length){
        result[counterResult++] = b[counterB];
        counterB++;
      }
    }while(counterResult < a.length + b.length);
    return result;
  }
}
