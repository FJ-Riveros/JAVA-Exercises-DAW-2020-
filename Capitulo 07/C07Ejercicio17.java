public class C07Ejercicio17 {
  public static void main (String [] args){
    int[] nums = new int[10];
    boolean check = false;
    int guide = 0;
    for( int i = 0; i < 10; i++){
      nums[i] = (int)(Math.random() * 101);
    }
    do{
      System.out.print("Introduzca un número(entre 0 y 100): ");
      int input = Integer.parseInt(System.console().readLine());
      for( int n: nums ){
        System.out.print(n + " ");
      }
      System.out.println();
      for( int i = 0; i < 10; i++){
        if( nums[i] == input ){
          guide = i;
          check = true;
        }
      }
      if( !check ){
        System.out.print("El número no se encuentra dentro del Array, introduzca otro número. ");
      }
    }while( !check );
    for( int i = 1; i < (11 - guide ); i++){ 
      int aux = nums[9];
      for( int j = 9; j > 0; j--){
        nums[j] = nums[j - 1];
      }
      nums[0] = aux;
    }
    for( int j: nums ){
      System.out.print(j + " ");
    }
  }
}
