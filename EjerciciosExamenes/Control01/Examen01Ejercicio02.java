public class Examen01Ejercicio02 {
  public static void main ( String [] args ) {
  int h;
  String orientacion;
  System.out.println("Este programa pinta piramides");
  do{
  System.out.print("Introduzca la altura (1-10): ");
  h = Integer.parseInt(System.console().readLine());
  System.out.println(h);
  }
  while((h > 10) || (h < 1));
  
  do{
    System.out.println("Introduzca la orientación: izquierda, derecha,
    arriba, abajo");
    orientacion = System.console().readLine();
    System.out.println(orientacion);
  }while(orientacion != "izquierda" || orientacion != "derecha" || orientacion
  != "arriba" || orientacion != "abajo");
}
}
