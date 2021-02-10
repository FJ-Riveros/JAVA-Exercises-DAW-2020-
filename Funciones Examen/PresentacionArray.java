public class PresentacionArray{
  public static void main(String[] args){
    int[][] pruebaBidi = {{1,100,1000},{4,65,31},{2000,23,10200}};
    /*System.out.print("Introduzca el número de items del Array: ");
    final int SIZE = Integer.parseInt(System.console().readLine());
    int[] input = new int[SIZE];
    System.out.print("Introduzca un valor: ");
    final int MAX = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca otro valor: ");
    final int MIN = Integer.parseInt(System.console().readLine());
    rellenaArrayUni(input, MAX, MIN);
    presentaArrayFormateado(input);*/
    //System.out.print(digitosMaxArray(pruebaBidi));
    presentaArrayFormateado(pruebaBidi);

  }
  
  public static void presentaArrayFormateado(int[] arr){
    int digitosMax = digitosMaxArray(arr);
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
        System.out.print("┘\n");
      }else{
        System.out.print("┴");
      }
    }
  }
  
  public static void presentaArrayFormateado(int[][] arr){
    int digitosMax = 0;
    for(int i=0; i<arr.length; i++){
      if(digitosMax < digitosMaxArray(arr[i])) digitosMax = digitosMaxArray(arr[i]);
    }
    System.out.print("┌");
    for(int i=0; i<arr[0].length; i++){
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
    String prueba = "%"+digitosMax+"d";
    //Parte central
    for(int x=0; x<arr.length; x++){
      for(int u=0; u<arr[0].length; u++){
        System.out.print("│");
        System.out.printf(prueba, arr[x][u]);
    
      }
      System.out.print("│");
      System.out.println();
      if(x==arr.length-1){
        System.out.print("└");
      }else{
        System.out.print("├");
      }
      for(int b=0; b<arr[0].length; b++){
        for(int o=0; o<digitosMax; o++){
          System.out.print("─");
        }
        if(x!=arr.length-1){
          if(b!=arr[0].length-1){
            System.out.print("┼");
          }else{
            System.out.print("┤");
          }
        }else{
          if(b!=arr[0].length-1){
            System.out.print("┴");
          }else{
            System.out.print("┘");
          }
        }
      }
      System.out.println();
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
  
  public static int digitosMaxArray(int[][] input){
    int max = 0;
    for(int i=0; i<input.length; i++){
      max = digitosMaxArray(input[i]);
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
