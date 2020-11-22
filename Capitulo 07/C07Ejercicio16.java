public class C07Ejercicio16 {
  public static void main (String [] args){
    int[] nums = new int[20];
    for( int i = 0; i < 20; i++){
      nums[i] = (int)(Math.random() * 401);
      System.out.print( nums[i] + " ");
    }
    System.out.println("\n¿Qué números quiere resaltar? (1 - los múltiplos de 5, 2 - los múltiplos de 7): ");
    int choice = Integer.parseInt(System.console().readLine());
    for( int i = 0; i < 20; i++){
      if( choice == 1 && nums[i] % 5 == 0 7){
        System.out.print("[" + nums[i] + "] ");
      }else if ( choice == 2 && nums[i] % 7 == 0 ){
        System.out.print("[" + nums[i] + "] ");
      }else{
        System.out.print(nums[i] + " ");
      }
    }
  }
}
