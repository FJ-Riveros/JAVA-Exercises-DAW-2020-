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
    if(terminos>= 1){
      result[0] = "1";
    }
    for(int i=0; i<result.length-1; i++){
      //System.out.print(result[i] + " ");
      siguienteNumero(i, result);
    }
  }
  
  public static void siguienteNumero(int posicionArr, String[] arr){
    String obtenerNuevoItem = generaNuevoItem(arr[posicionArr]);
    //System.out.print(obtenerNuevoItem);
    arr[posicionArr+1] = obtenerNuevoItem;
  }
  
  public static String generaNuevoItem(String anteriorItem){
    int counterVueltas = 1;
    int counterDigitos = 1;
    String nuevoItem = "";
    char siguienteDigito = '0';
    char digitoActual = '0';
    int sizeAnteriorDigito = anteriorItem.length(); 
    if(sizeAnteriorDigito> 1){
      while(counterVueltas<sizeAnteriorDigito-1){
        //System.out.print("LEnght: " + anteriorItem.length());
        siguienteDigito = anteriorItem.charAt(counterVueltas+1);
        digitoActual = anteriorItem.charAt(counterVueltas);
      //Revisar caso extremo final
      //if(anteriorItem.charAt(counterVueltas) == anteriorItem.charAt(counterVueltas+1)){
        if(digitoActual - siguienteDigito == 0){
          counterDigitos++;
        }else{
          nuevoItem += "" + counterDigitos + anteriorItem.charAt(counterVueltas);
          System.out.print("Nuevo item: " + nuevoItem + " ");
          counterDigitos = 1;
        }
        counterVueltas++;
      }
    }else{
      nuevoItem = "11";
    }
    //System.out.print("Nuevo item: " + nuevoItem + " ");
    return nuevoItem;
  }
}
