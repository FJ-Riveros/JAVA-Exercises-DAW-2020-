public class EjercicioSorpresa12 {
  public static void main (String [] args){
    System.out.println("Introduzca el número de filas que desea");
    int num = Integer.parseInt(System.console().readLine());
    int k;
    for( int i = 1; i <= num; i++){
      for( int j = 0; j < ( num - i); j++){
        System.out.print(" ");
      }
      for( k = 1; k <= i; k++){
        if( k >= 10 ){
          System.out.print(k % 10);
        }else{
          System.out.print(k);
        }
      }
      for( int h = k - 2; h >= 1; h--){
        System.out.print(h);
      }
      System.out.println();
    }
  }
}
