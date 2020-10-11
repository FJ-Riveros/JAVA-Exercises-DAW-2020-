public class C04Ejercicio18{
  public static void main( String [] args){
    String num = ""; 
    System.out.println("Este programa dice cuál es la última cifra de un número entero");
    do{
      System.out.println("Introduce el número entero deseado, no puede ser de más de 5 cifras");
      num = System.console().readLine();
      System.out.println(num.charAt(0));
    }while(num.length() > 6);
  }
}
