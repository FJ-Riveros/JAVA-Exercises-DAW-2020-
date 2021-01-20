public class EjerciciosSorpresa14 {
  public static void main (String [] args){
    System.out.println("Introduzca la altura que desea: ");
    int h = Integer.parseInt(System.console().readLine());
    int k;
    for( int i = 1; i <= h; i++){
      for( int j = 0; j < h - i; j++){
        System.out.print(" ");
      }
      for( k = 1; k <= ((i * 2) - 1); k++){
        if( k % 2 != 0 ){
          System.out.print("*");
        }else{
          System.out.print(" ");
        }
      }
      for( int l = 1; l <= 20 - k; l++){
        System.out.print(" ");
      }
      for( int p = 1; p <= ((i * 2) - 1); p++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
