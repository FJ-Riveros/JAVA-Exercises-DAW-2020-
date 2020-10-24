public class EjercicioRepasoBucles4 {
  public static void main ( String [] args){
    System.out.println("Introduzca el número por el que se empieza");
    int cont = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca el número por el que termina");
    int num = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca de qué número quiere ir saltando");
    int jump = Integer.parseInt(System.console().readLine());
    System.out.println();
    for( int i = cont; i >= num ; i-= jump ){
      System.out.println(i);
    }
  }
}
