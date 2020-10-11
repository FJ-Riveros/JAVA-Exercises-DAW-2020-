public class C04Ejercicio17{
  public static void main( String [] args){
    int num; 
    System.out.println("Este programa dice cuál es la última cifra de un número entero");
    System.out.println("Introduce el número entero deseado");
    num = Integer.parseInt(System.console().readLine());
    System.out.println("La última cifra introducida es: " + (num % 10));
  }
}
