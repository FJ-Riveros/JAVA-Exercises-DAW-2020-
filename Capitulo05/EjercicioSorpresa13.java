public class C05Ejercicio13 {
  public static void main (String [] args){
    int nums = 0;
    int positiveCount = 0;
    for( int i = 0; i < 10; i++){
      System.out.println("Introduzca 10 números, le quedan: " + ( 10 - i));
      nums = Integer.parseInt(System.console().readLine());
      if( nums > 0 ){
        positiveCount++;
      }
    }
    System.out.println("Tenemos " + (10 - ( 10 - positiveCount)) + " positivos y " + (10 - positiveCount) + " negativos");
  }
}
