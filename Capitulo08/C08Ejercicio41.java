public class C08Ejercicio41{
  public static void main(String [] args){
    System.out.print  ("Introduzca la altura de la pirámide: ");
    int h = Integer.parseInt(System.console().readLine());
    System.out.print  ("Introduzca el carácter de la pirámide: ");
    char caracter = System.console().readLine().charAt(0);
    for(int i=0; i<h; i++){
      System.out.print(printLinea(caracter, h-i));
      System.out.println();
    }
  }
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
