public class C03Ejercicio12 {
  public static void main ( String [] args ){
  System.out.println("Introduzca la nota del primer examen");
  float primerExamen = Float.parseFloat(System.console().readLine());
  System.out.println("¿Qué nota quieres sacar en el trimestre?");
  float notaDeseada = Float.parseFloat(System.console().readLine());
  double resultado = ((notaDeseada-(primerExamen * 0.40))*100) / 60;
  System.out.println("Necesitarás un " + resultado + " para alcanzar la media");
  }
}
