public class EjercicioSorpresa18_01_2{
  public static void main (String [] args){
    System.out.print("Introduzca el número de items del Array: ");
    final int SIZE = Integer.parseInt(System.console().readLine());
    int[] input = new int[SIZE];
    System.out.print("Introduzca el valor máximo posible: ");
    final int MAX = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el valor mínimo posible: ");
    final int MIN = Integer.parseInt(System.console().readLine());
    rellenaArrayUni(input, MAX, MIN);
    for(int i=0; i<input.length; i++){
      System.out.print(input[i] + " ");
    }
  }
  
  public static void rellenaArrayUni(int[] arr, int max, int min){
    for(int i=0; i<arr.length; i++){
      arr[i] = (int)(Math.random()* (max+1-min)+min);
    }
  }
}
