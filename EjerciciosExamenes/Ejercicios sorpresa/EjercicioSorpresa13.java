public class EjercicioSorpresa13 {
  public static void main (String [] args){
    System.out.print("Introduzca la altura: ");
    int h = Integer.parseInt(System.console().readLine());
    for( int i = 1; i <= h; i++){
      for( int j = 0; j <  h - i; j++){
        System.out.print(" ");
      }
      for( int k = 1; k <= ((i * 2) - 1); k++){
        if( k % 2 != 0 ){
          System.out.print("*");
        }else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
