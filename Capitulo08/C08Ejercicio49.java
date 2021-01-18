import static Matematicas.OperacionesEnteros.digitoN;
import static Matematicas.OperacionesEnteros.digitos;
public class C08Ejercicio49{
  public static void main(String [] args){
    int[] result = lookAndSay(5);
    for(int item: result){
      System.out.print(item + " ");
    }
  }
  /*
   * Devuelve un Array, cada item es como se lee la concatenación de los números
   *que se pasan como parámetros.(Look and say)
   * 
   * @param arrA              Primer Array de números a concatenar
   * @param arrB              Segundo Array de números a concatenar
   * @return                  Array unidimensional con la concatenación de los dos.
  */ 
  public static int[] lookAndSay(int terminos){
    int digitosTotales = 0;
    int item = 0;
    int[] arr = new int[terminos];
    arr[0] = 1;
    int selector = 0;
    int counter = 0;
    int counterArr = 1;
    int digitoAnterior = 1;
    
    for(int i=0; i<terminos; i++){
      item = arr[i];
      digitosTotales = digitos(arr[item]);
      //System.out.println(i + " : " + digitosTotales);
      counter = 1;
      if(i==0 && terminos >=1){
        arr[1] = 11;
        System.out.print("Hola");
      }else{
        for(int j=1; j<digitosTotales; j++){
          digitoAnterior = digitoN((long)item, j-1);
          selector = digitoN((long)item, j);
          System.out.print("DigitoAnt: " + digitoAnterior + " Selector: " + selector);
          System.out.println();
          if(selector == digitoAnterior && (j != digitosTotales-1)){
            counter++;
          }else{
            arr[counterArr++] = (counter*10)+digitoAnterior;
            //System.out.print("Yo ocurro en la i: " + i);
            counter = 1;
          }
        }
      }
    }
    //System.out.print("Item: " + item + " ");
    return arr;
  }
}
