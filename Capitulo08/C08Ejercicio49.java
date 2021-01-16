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
    int numeroIntroducir = 0;
    int[] arr = new int[terminos];
    arr[0] = 1;
    int selector = 0;
    int counter = 0;
    int counterArr = 1;
    boolean check = false;
    int digitoAnterior = 1;
    
    for(int i=1; i<terminos; i++){
      item = arr[i-1];
      System.out.print("I: "+ i+ " ");
      for(int prueba: arr){
        System.out.print(prueba + " ");
      }
      System.out.println();
      //System.out.print("Item " + i + ": " + arr[i-1]);
      digitosTotales = digitos(arr[item]);
      //System.out.println(i + " : " + digitosTotales);
      counter = 1;
      digitoAnterior = digitoN((long)item, 0);
      //System.out.println(digitoAnterior + " prueba: " + i);
      
      for(int j=0; j<digitosTotales; j++){
        //check = false;
        /*if(j==0){
         digitoAnterior = digitoN((long)item, 0); 
        }*/
        selector = digitoN((long)item, j);
        //System.out.print(item);
        //System.out.print("Vuelta " + j + ": " + selector + "  ");
        //System.out.print(digitoAnterior);
        //System.out.println();
        if( selector == digitoAnterior && (j != digitosTotales-1)){
          counter++;
        }else{
          arr[counterArr++] = (counter*10)+digitoAnterior;
          //System.out.print("Añado a array en la i: " + ((counter*10)+digitoAnterior) + " ");
          counter = 1;
        }
        digitoAnterior = selector;
      }
    }
    return arr;
  }
}
