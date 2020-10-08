import java.util.*;
public class C04Ejercicio06 {
  public static void main(String [] args){
    float h;
    double resultado;
    System.out.println("Este programa calcula el tiempo de caida de un objeto");
    System.out.println("Introduzca la altura del objeto desde el suelo");
    h = Float.parseFloat(System.console().readLine());
    resultado = Math.sqrt(((2*h)/ 9.81));
    System.out.printf("%s %.2f %s","El objeto tardará", resultado, "segundos en caer");
  }
}
