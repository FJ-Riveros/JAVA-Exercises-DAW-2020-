public class EjercicioRepasoBucles3 {
  public static void main (String [] args){
    System.out.println("Introduzca la cantidad de números que quiere");
    int cont = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca a partir de qué número quiere contar");
    int num = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca de qué número quiere ir saltando");
    int jump = Integer.parseInt(System.console().readLine());
    System.out.println();
    for( int i = 0; i < cont; i++ ){
      System.out.println(num);
      num += jump;
    }
  }
}
