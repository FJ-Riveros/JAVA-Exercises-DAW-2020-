public class EjercicioSorpresa10 {
  public static void main (String [] args){
    System.out.println("Introduzca la altura deseada");
    int num = Integer.parseInt(System.console().readLine());
    for( int i = 1; i <= num ; i++){
      for( int j = 1; j <= ((i * 2) - 1); j++){
        System.out.print(j + " ");
      }
      System.out.println();
    } 
  }
} 
