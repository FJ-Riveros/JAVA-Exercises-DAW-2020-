public class EjercicioSorpresa2{
  public static void main (String [] args ){
    System.out.println("Introduzca el primer entero");
    int primerEntero = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca el segundo entero");
    int segundoEntero = Integer.parseInt(System.console().readLine());
    System.out.println();
    System.out.println("Resultados");
    System.out.println("A + B = " + (primerEntero + segundoEntero));
    System.out.println("A - B = " + (primerEntero - segundoEntero));
    System.out.println("A * B = " + (primerEntero * segundoEntero));
    System.out.println("A / B = " + (primerEntero / segundoEntero));
    System.out.println("A % B = " + (primerEntero % segundoEntero));
  }
}
