public class C03Ejercicio02 {
  public static void main ( String [] args ) {
  System.out.println("Conversor de euros a pesetas");
  System.out.print("Introduzca la cantidad de euros a convertir:");
  int euros = Integer.parseInt( System.console().readLine());
  System.out.println("Euros: " + euros);
  System.out.println("Pesetas: " + (euros * 166.386));
  }
}
  
