public class C07Ejercicio07 {
  public static void main (String [] args){
    int[] nums = new int[100];
    for(int i = 0; i < 100; i++){
      nums[i] = (int)(Math.random() * 21);
      System.out.print( nums[i] + " ");
    } 
    System.out.println();
    System.out.print("Introduzca el valor a cambiar: ");
    int first = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el valor que lo sustituirá: ");
    int second = Integer.parseInt(System.console().readLine());
    for(int i = 0; i < 100; i++){
      if( nums[i] == first ){
        nums[i] = second;
        System.out.print( "\"" + nums[i] + "\"" + " ");
      }else{
        System.out.print( nums[i] + " ");
      }
    }
  }
}
