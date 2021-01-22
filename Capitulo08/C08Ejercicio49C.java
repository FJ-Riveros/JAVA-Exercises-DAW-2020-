import static Matematicas.OperacionesEnteros.digitoN;
import static Matematicas.OperacionesEnteros.digitos;
public class C08Ejercicio49C{
  public static void main(String [] args){
    System.out.print("Introduzca la cantidad de términos que desea: ");
    int input = Integer.parseInt(System.console().readLine());
    String[] result = new String[input];
    lookAndSay(input, result);
    for(int i=0; i<result.length; i++){
      if(i == result.length-1){
        System.out.print(result[i] + " ");
      }else{
        System.out.print(result[i] + ", ");
      }
    }
  }
  
  public static void lookAndSay(int terminos, String[] result){
    if(terminos>= 1){
      result[0] = "1";
    }
    for(int i=1; i<=result.length-1; i++){
      siguienteNumero(i, result);
    }
  }
  
  public static void siguienteNumero(int posicionArr, String[] arr){
    arr[posicionArr] = generaNuevoItem(arr[posicionArr-1]);
  }
  
  public static String generaNuevoItem(String anteriorItem){
    int counterVueltas = 0;
    String nuevoItem = "";
    char siguienteDigito = '0';
    char digitoActual = '0';
      while(anteriorItem.length() > 0){
        counterVueltas = 1;
        if(anteriorItem.length() == 1){
          nuevoItem += "" + 1 + anteriorItem.charAt(0);
          anteriorItem = "";
          return nuevoItem;
        }
        if(anteriorItem.charAt(0) - anteriorItem.charAt(1) == 0){
          boolean check = false;
          do{
            digitoActual = anteriorItem.charAt(0);
            siguienteDigito = anteriorItem.charAt(counterVueltas);
            if( digitoActual - siguienteDigito != 0 ){
              nuevoItem += "" + counterVueltas + digitoActual;
              anteriorItem = anteriorItem.substring(counterVueltas);
              check = true;
            }
            counterVueltas++;
          }while(digitoActual == siguienteDigito && counterVueltas<anteriorItem.length()-1);
          if(!check){
            nuevoItem += "" + counterVueltas + digitoActual;
            anteriorItem = anteriorItem.substring(counterVueltas);
          }
        }else{
          nuevoItem += "" + 1 + anteriorItem.charAt(0);
          anteriorItem = anteriorItem.substring(counterVueltas);
        }
      }
    return nuevoItem;
  }
}
