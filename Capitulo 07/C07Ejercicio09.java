public class C07Ejercicio09 {
  public static void main (String [] args) {
    int[] nums = new int[8];
    for(int i = 0; i < 8; i++){
      System.out.print("Introduzca el " + (i+1) + " º número: ");
      int num = Integer.parseInt(System.console().readLine());
      nums[i] = num;
    }
    for( int i = 0; i < 8; i++){
      if( nums[i] % 2 == 0 ){
        System.out.print(nums[i] + " par ");
      }else{
        System.out.print(nums[i] + " impar ");
      }
    }
  }
}
