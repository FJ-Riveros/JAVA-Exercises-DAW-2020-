public class C07Ejercicio11 {
  public static void main (String [] args){
    int input = 0;
    int[] original = new int[10];
    int[] result = new int[10];
    int[] resultNoPrim = new int[10];
    int counter = 0;
    int counterNoPrim = 0;
    boolean primo = true;
    for( int i = 0; i < 10; i++){
      System.out.print("Introduzca un número, le quedan: " + (10 - i) + " números por introducir: ");
      input = Integer.parseInt(System.console().readLine());
      original[i] = input;
      primo = true;
      for( int j = 2; j < input; j++){
        if( input % j == 0 ){
          primo = false;
        }
      }
      if ( primo ) {
        result[counter++] = input;
      }else{
        resultNoPrim[counterNoPrim++] = input;
      }
    }
    for( int i = 0; i < 10; i++){
      System.out.print(original[i] + " ");
    }
    
    for( int i = 0; i < counter; i++){
      original[i] = result[i];
    }
    for( int i = 0; i < counterNoPrim; i++){
      original[counter++] = resultNoPrim[i];
    }
    System.out.println();
    for( int i = 0; i < 10; i++){
      System.out.print(original[i] + " ");
    }
  }
}
