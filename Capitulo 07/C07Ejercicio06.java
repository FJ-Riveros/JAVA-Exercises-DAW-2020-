public class C07Ejercicio06 {
  public static void main (String [] args){
    int[] nums = new int[15];
    int input = 0;
    for( int i = 1; i <= 15; i++){
      System.out.print("Introduzca un número que desee, le quedan " + (16 - i) + " números por introducir: ");
      input = Integer.parseInt(System.console().readLine());
      if( i == 15 ){
        nums[0] = input;
      }else{
        nums[i] = input;  
      }
    }
    for( int i = 0; i < 15; i++){
      System.out.print(nums[i] + " ");
    }
  }
}
