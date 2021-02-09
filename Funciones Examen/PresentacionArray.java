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
    int digitosMax = digitosMaxArray(arr);
    System.out.print(digitosMax);
    System.out.print("El Array tiene un tamaño de: " + arr.length);
    System.out.println();
    System.out.print("┌");
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<digitosMax; j++){
        System.out.print("─");
      }
      if(i == arr.length-1){
          System.out.print("┐");
      }else{
        System.out.print("┬");
      }
    }
    System.out.println();
    for(int item: arr){
      System.out.print("│");
      for(int i=0; i<digitosMax-cuentaDigitos(item); i++){
        System.out.print(" ");
      }
      System.out.print(item);
    }
    System.out.print("│");
    System.out.println();
    System.out.print("└");
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<digitosMax; j++){
        System.out.print("─");
      }
      if(i == arr.length-1){
        System.out.print("┘");
      }else{
        System.out.print("┴");
      }
    }
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
  
  public static int digitosMaxArray(int[] input){
    int max = 0;
    for(int i=0; i<input.length; i++){
      if(cuentaDigitos(input[i]) > max){
        max = cuentaDigitos(input[i]);
      }
    }
    return max;
  }
  
  public static int cuentaDigitos(int num){
    int count = 0;
    while(num>0){
      count++;
      num /= 10;
    }
    return count;
  }
  
}
