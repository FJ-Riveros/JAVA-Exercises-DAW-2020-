public class C07Ejercicio13 {
  public static void main (String [] args){
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int[] arr = new int[100];
    for( int i = 0; i < 100; i++){
      arr[i] = (int)(Math.random() * 501);
      System.out.print(arr[i] + " ");
      if( arr[i] < min ){
        min = arr[i];
      }else if( arr[i] > max ){
        max = arr[i];
      }
    }
    System.out.print("\n¿Qué quiere destacar? (1 - mínimo, 2 - máximo): ");
    int selector = Integer.parseInt(System.console().readLine());
    for( int i = 0; i < 100; i++){
      if( selector == 1 && arr[i] == min){
        System.out.print("**" + arr[i] + "** ");
      }else if( selector == 2 && arr[i] == max ){
        System.out.print("**" + arr[i] + "** ");
      }else{
         System.out.print(arr[i] + " ");
      }
    }
  }
}
