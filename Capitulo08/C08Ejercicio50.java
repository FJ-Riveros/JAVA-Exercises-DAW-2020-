public class C08Ejercicio50{
  public static void main(String [] args){
    int[] arra = {1,4,3};
    int[] arrb = {5,2};
    
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
    
  }
}
