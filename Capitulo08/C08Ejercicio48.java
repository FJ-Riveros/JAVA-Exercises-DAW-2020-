public class C08Ejercicio48{
  public static void main(String [] args){
    int[] arrA = {1,2,3,4,5};
    int[] arrB = {6,7,8,9};
    int[] result = concatena(arrA,arrB);
    for(int item: result) System.out.print(item);
    
  }
  /*
   * Esta función nos devuelve la concatenación de dos Arrays unidimensionales
   * de enteros.
   * 
   * @param arrA              Primer Array de números a concatenar
   * @param arrB              Segundo Array de números a concatenar
   * @return                  Array unidimensional con la concatenación de los dos.
  */ 
  public static int[] concatena(int[] arrA, int[] arrB){
    int result[] = new int[arrA.length + arrB.length];
    int i=0;
    for(i=0; i<arrA.length; i++){
      result[i] = arrA[i];
    }
    for(int j=i; j<arrA.length+arrB.length; j++){
      result[j] = arrB[j-arrA.length];
    }
    return result;
  }
}
