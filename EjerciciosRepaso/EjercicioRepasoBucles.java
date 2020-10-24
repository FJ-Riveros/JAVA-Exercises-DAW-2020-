public class EjercicioRepasoBucles2 {
  public static void main (String [] args){
    System.out.println("Introduzca la cantidad de números que quiere");
    int cont = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca a partir de qué número quiere contar");
    int num = Integer.parseInt(System.console().readLine());
    for( int i = num; i < (num + cont); i ++){
      System.out.println(i);
    }
  }
}
