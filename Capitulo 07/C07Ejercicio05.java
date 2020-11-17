public class C07Ejercicio05 {
  public static void main (String [] args){
    int input = 0;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int[] nums = new int[10];
    for( int i = 0; i < 10; i++){
      System.out.print("Introduzca un número, le quedan " + (10 - i) + " números por introducir: ");
      input = Integer.parseInt(System.console().readLine());
      nums[i] = input;
      if( input > max ){
        max = input;
      }else if( input < min ){
        min = input;
      }
    }
    for( int i = 0; i < 10; i++){
      if( nums[i] == max ){
        System.out.print(nums[i] + " es el máximo ");
      } else if ( nums[i] == min ){
        System.out.print(nums[i] + " es el mínimo ");
      } else {
        System.out.print(nums[i] + " ");
      }
    }
  }
}
