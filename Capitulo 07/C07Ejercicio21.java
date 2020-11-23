public class C07Ejercicio21 {
  public static void main (String [] args){
    int[] nums = new int[15];
    for( int i = 0; i < 15; i++){
      nums[i] = (int)(Math.random() * 501);
    }
    System.out.print("Array original: \n");
    for( int j: nums ){
      System.out.print(j + " ");
    }
    
    for( int i = 0; i < 15; i++ ){
      if( nums[i] % 5 != 0 ){
        while( nums[i] % 5 != 0 ){
          nums[i]++;
        }
      }
    }
    System.out.print("\nArray cincuerizado: \n");
    for( int j: nums ){
      System.out.print(j + " ");
    }
  }
}
