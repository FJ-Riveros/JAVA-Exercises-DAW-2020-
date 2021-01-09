import static Matematicas.creacionDeFiguras.printLinea;
import static Matematicas.creacionDeFiguras.printLineaEspaciosCentrales;
public class C08Ejercicio44{
  public static void main(String [] args){
    System.out.print  ("Introduzca la altura de la pirámide: ");
    int h = Integer.parseInt(System.console().readLine());
    System.out.print  ("Introduzca el carácter de la pirámide: ");
    char caracter = System.console().readLine().charAt(0);
    System.out.println(printLinea(caracter, h));
    for(int j=1; j<h; j++){
      System.out.print(printLinea(' ', j));
      System.out.println(printLineaEspaciosCentrales(caracter, (h-j)));
    }
  }
}
