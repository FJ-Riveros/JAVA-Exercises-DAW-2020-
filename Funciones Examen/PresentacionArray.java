public class PresentacionArray{
  public static void main(String[] args){
    System.out.print("Introduzca el número de items del Array: ");
    final int SIZE = Integer.parseInt(System.console().readLine());
    int[] input = new int[SIZE];
    System.out.print("Introduzca un valor: ");
    final int MAX = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca otro valor: ");
    final int MIN = Integer.parseInt(System.console().readLine());
    rellenaArrayUni(input, MAX, MIN);
    presentaArrayFormateado(input);

  }
  
  public static void presentaArrayFormateado(int[] arr){
    System.out.print("El Array tiene un tamaño de: " + arr.length);
    System.out.println();
    System.out.print("┌");
    for(int i=0; i<arr.length-1; i++){
      System.out.printf("───┬");
    }
    System.out.print("───┐");
    System.out.println();
    for(int item: arr){
      System.out.print("│");
      System.out.printf("%3d", item);
    }
    System.out.print("│");
    System.out.println();
    System.out.print("└");
    for(int i=0; i<arr.length-1; i++){
      System.out.print("───┴");
    }
    System.out.print("───┘");
  }
  public static void rellenaArrayUni(int[] input, int max, int min){
    if(max < min){
      int aux = max;
      max = min;
      min = aux;
    }
    for(int i=0; i<input.length; i++){
      input[i] = (int)(Math.random()* (max+1-min)+min);
    }
  }

}
