import static Matematicas.creacionDeFiguras.printLinea;
public class C08Ejercicio42{
  public static void main(String [] args){
    System.out.print  ("Introduzca la altura de la pirámide: ");
    int h = Integer.parseInt(System.console().readLine());
    System.out.print  ("Introduzca el carácter de la pirámide: ");
    char caracter = System.console().readLine().charAt(0);
    System.out.print(printLinea(caracter, h));
    System.out.println();
    for(int i=1; i<h; i++){
      System.out.print(printLineaEspaciosCentrales(caracter, h-i));
      System.out.println();
    }
  }
  /*
   * Esta función nos devuelve un String con el caracter deseado sólo en la 
   * primera posición y en la última, las centrales son espacios.
   * 
   * @param character         Carácter con el que queremos que se repita
   * @param repeticiones      Int con el tamaño horizontal que queramos
   * @return                  String con los carácteres repetidos y los centra
   *                          les vacios.
  */ 
  public static String printLineaEspaciosCentrales(char caracter, int repeticiones){
    String result = "";
    for(int i=0; i<repeticiones; i++){
      if(i==0 || i==repeticiones-1){
        result += caracter;
      }else{
        result += " ";
      }
    }
    return result;
  }
}
