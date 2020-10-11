public class C04Ejercicio17{
  public static void main( String [] args){
    String num; 
    System.out.println("Este programa dice cuál es la última cifra de un número entero");
    System.out.println("Introduce el número entero deseado");
    num = System.console().readLine();
    System.out.println(num.charAt(num.length() - 1));
  }
}
