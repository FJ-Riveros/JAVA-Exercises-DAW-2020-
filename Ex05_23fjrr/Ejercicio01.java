/**
 * @Author: FJ-Riveros
 */
public class Ejercicio01{
  public static void main(String[] args){
    String[] input = {"pera", "uva", "naranja", "mango", "cereza", "lichi", "coco"};
    String[] arrResult = trozoDeArrayString(input, 100, 200);
    for(String item: arrResult) System.out.print(item + " ");
  }
  
  public static String[] trozoDeArrayString(String[] a,int inicio, int fin){
    String[] result = new String[0];
    if(inicio>fin){
      int temp = 0;
      temp = inicio;
      inicio = fin;
      fin = temp;
    }
    if((inicio<0 && fin<0) || (inicio>=a.length && fin>=a.length) || a.length==0){
      return result;
    }
    if(inicio<0) inicio = 0;
    if(fin>=a.length) fin = a.length-1;
    int counter = 0;
    for(int i=inicio; i<=fin; i++){
      result = addItem(result, a[i]);
    }
    return result;
  }
  
  public static String[] addItem(String[] input, String newElement){
    String[] result = new String[input.length+1];
    for(int i=0; i<input.length; i++){
      result[i] = input[i];
    }
    result[result.length-1] = newElement;
    return result;
  }
}
