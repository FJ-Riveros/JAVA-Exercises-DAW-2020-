public class EjercicioSorpresa11{
  public static void main (String [] args){
    System.out.println("Introduzca el número de filas que desea");
    int num = Integer.parseInt(System.console().readLine());
    for( int i = 1; i <= num; i++){
      for( int k = 0; k < (num - i); k++){
        System.out.print(" ");
      }
      for( int j = 1; j <= (( i * 2 ) - 1); j++){
        if( j >= 10){
        System.out.print(j % 10);
        }else{
        System.out.print(j);
        }
      }
      System.out.println();
    }
  }
}
