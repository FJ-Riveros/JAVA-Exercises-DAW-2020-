import static Matematicas.OperacionesEnteros.digitoN;
import static Matematicas.OperacionesEnteros.digitos;
public class C08Ejercicio49B{
  public static void main(String [] args){
    System.out.print("Introduzca la cantidad de términos que desea: ");
    int input = Integer.parseInt(System.console().readLine());
    String[] result = new String[input];
    lookAndSay(input, result);
    for(String item: result){
      System.out.print(item + " ");
    }
  }
  /*
   * Devuelve un Array, cada item es como se lee la concatenación de los números
   *que se pasan como parámetros.(Look and say)
   * 
   * @param terminos             Cantidad de terminos a ejecutar
   * @return                     Términos(n) lookAndSay
  */ 
  public static void lookAndSay(int terminos, String[] result){
    //String[] result = new String[terminos];
    int counter = 1;
    if(terminos>= 1){
      result[0] = "1";
    }
    
    for(int i=0; i<result.length-2; i++){
      System.out.print(result[i] + " ");
      siguienteNumero(i, result);
    }
  }
  
  public static void siguienteNumero(int posicionArr, String[] arr){
    int siguientePosicion = posicionArr+1;
    String obtenerNuevoItem = generaNuevoItem(arr[posicionArr]);
    arr[siguientePosicion] = obtenerNuevoItem;
    
    //arr[siguientePosicion] = arr[posicionArr];
  }
  
  public static String generaNuevoItem(String anteriorItem){
    int counterVueltas = 1;
    int counterDigitos = 1;
    String nuevoItem = "";
    while(counterVueltas<anteriorItem.length()){
      //Revisar caso extremo final
      if(anteriorItem.charAt(counterVueltas) == anteriorItem.charAt(counterVueltas+1)){
        counterDigitos++;
      }else{
        nuevoItem =+ counterDigitos + "" + anteriorItem.charAt(counterVueltas);
        counterDigitos = 1;
      }
      counterVueltas++;
    }
    return nuevoItem;
    /*for(int i=1; i<anteriorItem.length(); i++){
      if(anteriorItem.charAt(i) == 
    }*/
  }
}
  /*public static String cortaString(String input, int hastaPosicionX){
    
  }
  
  public static String concatenaStrings(String inputA, String inputB){
    return inputA*= inputB;
  }*/
  
  

