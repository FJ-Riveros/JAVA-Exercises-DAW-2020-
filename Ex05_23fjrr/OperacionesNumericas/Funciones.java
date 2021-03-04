/**
 * @Author: FJ-Riveros
 */
package OperacionesNumericas;
public class Funciones{
  public static int[] extraePares(int[] a){
    int[] result = new int[0];
    for(int i=0; i<a.length; i++){
      if(checkIfPar(a[i])) result = addItem(result, a[i]);
    }
    return result;
  }
  
  public static int[] extraeImpares(int[] a){
    int[] comparation = extraePares(a);
    int[] result = new int[0];
    boolean check = true;
    for(int i=0; i<a.length; i++){
      check = true;
      for(int j=0; j<comparation.length; j++){
        if(a[i] == comparation[j]) check = false;
      }
      if(check) result = addItem(result,a[i]);
    }
    return result;
  }
  
  public static int[] colocaParesEImpares(int[] a){
    int[] pares = extraePares(a);
    int[] impares = extraeImpares(a);
    int[] result = new int[pares.length + impares.length];
    int i;
    for(i = 0; i<pares.length; i++) result[i] = pares[i];
    for(int j=0; j<impares.length; j++) result[i++] = impares[j];
    return result;
  }
  
  public static boolean checkIfPar(int input){
    if(input%2==0){
      return true;
    }else{
      return false;
    }
  }
  
  public static int[] addItem(int[] input, int newElement){
    int[] result = new int[input.length+1];
    for(int i=0; i<input.length; i++){
      result[i] = input[i];
    }
    result[result.length-1] = newElement;
    return result;
  }
}
