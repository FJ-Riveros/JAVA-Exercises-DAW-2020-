public class Examen01Ejercicio02 {
  public static void main ( String [] args ) {
  int h;
  System.out.println("Este programa pinta piramides");
  do{
  System.out.println("Introduzca la altura (1-10): ");
  h = Integer.parseInt(System.console().readLine());
  System.out.println(h);
  }
  while((h > 10) || (h < 1));
  
  }
}
