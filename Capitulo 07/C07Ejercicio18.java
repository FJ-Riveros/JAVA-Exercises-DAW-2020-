public class C07Ejercicio18 {
  public static void main (String [] args) {
    int[] nums = new int[10];
    int[] resultLess = new int[10];
    int[] resultMore = new int[10];
    int counterLessLength = 0;
    int counterMoreLength = 0;
    for( int i = 0; i < 10; i++){
      nums[i] = (int)(Math.random() * 201);
      if( nums[i] <= 100 ){
        resultLess[counterLessLength++] = nums[i];
      }else{
        resultMore[counterMoreLength++] = nums[i];
      }
    }
    for( int i = 0; i < 10; i++){
      System.out.printf("%6d ", i);
    }
    System.out.println();
    for( int n: nums ){
      System.out.printf("%6d ", n);
    }
    int counterLess = 0;
    int counterMore = 0;
    int counterWhile = 0;
    do{
      if( counterMoreLength > counterMore ){
        nums[counterWhile] = resultMore[counterMore++];  
        counterWhile++;
      }
      if( counterLessLength > counterLess){
        nums[counterWhile] = resultLess[counterLess++];  
        counterWhile++;
      }
    }while( counterWhile < 10 );
    
    System.out.println();
    System.out.println();
    for( int i = 0; i < 10; i++){
      System.out.printf("%6d ", i);
    }
    System.out.println();
    for( int n: nums ){
      System.out.printf("%6d ", n);
    }
  }
}
