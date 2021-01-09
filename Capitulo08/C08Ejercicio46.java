import static Matematicas.creacionDeFiguras.printLinea;
import static Matematicas.creacionDeFiguras.printLineaEspaciosCentrales;
public class C08Ejercicio46 {
  public static void main(String [] args){
    System.out.print  ("Introduzca la altura de la pirámide: ");
    int h = Integer.parseInt(System.console().readLine());
    System.out.print  ("Introduzca el carácter de la pirámide: ");
    char caracter = System.console().readLine().charAt(0);
    int counter = (h*2)-3;
    for(int j=1; j<h; j++){
      System.out.print(printLineaEspaciosCentrales(caracter, j));
      System.out.print(printLinea(' ', counter));
      counter -= 2;
      System.out.println(printLineaEspaciosCentrales(caracter, j));
    }
    System.out.print(printLinea(caracter, h*2-1));
  }
}
