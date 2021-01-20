public class EjercicioSorpresa5 {
  public static void main (String [] args){
    double num;
    double calculo = 0;
    String acumulador = "";
    for( int i = 0; i < 10; i++){
      System.out.println("Introduzca los números requeridos, le faltan " + (10 - i) + " por introducir");
      num = Double.parseDouble(System.console().readLine());
      calculo += num;
      acumulador += num + " - ";
    }
    System.out.println("La media es " + (calculo / 10));
    System.out.println(acumulador);
  }
}
