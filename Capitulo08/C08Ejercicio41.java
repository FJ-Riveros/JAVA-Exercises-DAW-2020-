public class C08Ejercicio41{
  public static void main(String [] args){
    //Terminar
    System.out.print("Introduzca el carácter que desea para la pirámide");
    String caracter = Char.parseChar(System.console().readLine());
    System.out.print  ("Introduzca la altura de la pirámide");
    int h = Integer.parseInt(System.console().readLine());
    for(int i=0; i<h; i++){
      printLinea(caracter, h-i);
      System.out.println();
    }
  }
  /*
   * Esta función printea por consola en una línea el caracter deseado con las
   * repeteciones que se indiquen.
   * 
   * @param character         Carácter con el que queremos printear
   * @param repeticiones      Int con las veces que queremos que se repita
   *                          el carácter
   * @return                  Print por consola.
  */ 
  public static String printLinea(char caracter, int repeticiones){
    for(int i=0; i<repeticiones; i++){
      System.out.print(caracter);
    }
  }
}
