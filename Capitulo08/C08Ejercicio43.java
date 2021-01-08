import static Matematicas.creacionDeFiguras.printLinea;
public class C08Ejercicio43{
  public static void main(String [] args){
    System.out.print  ("Introduzca la altura de la pirámide: ");
    int h = Integer.parseInt(System.console().readLine());
    System.out.print  ("Introduzca el carácter de la pirámide: ");
    char caracter = System.console().readLine().charAt(0);
    for(int j=0; j<h; j++){
      System.out.print(printLinea(' ', j));
      System.out.println(printLinea(caracter, (h-j)));
    }
  }
}
