import java.lang.Math.*;

public class C03Ejercicio09{
  public static void main ( String [] args ){
  System.out.println("Este programa calcula el Volumen de un cono");
  System.out.println("Introduce el radio en cm");
  int r = Integer.parseInt(System.console().readLine());
  r = r * r;
  System.out.println("Introduce la altura en cm");
  int h = Integer.parseInt(System.console().readLine());
  double v = ((double)1/3)* Math.PI * r * h; 
  System.out.println();
  System.out.printf("%s %.2f","El Volumen es:", v);   
  }
}
