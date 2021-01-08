package Matematicas;

public class creacionDeFiguras{
  /*
   * Esta función nos devuelve un String con el caracter deseado con las
   * repeteciones que se indiquen.
   * 
   * @param character         Carácter con el que queremos que se repita
   * @param repeticiones      Int con las veces que queremos que se repita
   *                          el carácter
   * @return                  String con los carácteres repetidos.
  */ 
  public static String printLinea(char caracter, int repeticiones){
    String result = "";
    for(int i=0; i<repeticiones; i++){
      result += caracter;
    }
    return result;
  }
}
