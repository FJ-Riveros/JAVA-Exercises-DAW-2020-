public class EjercicioSorpresa9B{
  public static void main(String [] args){
    System.out.println("Introduzca el número de filas que desee");
    int num = Integer.parseInt(System.console().readLine());
    for( int i = 1; i <= num; i++){
      for( int j = 1; j <= i; j++){
        System.out.print( j + " ");
      }
      System.out.println();
    }
  }
}

