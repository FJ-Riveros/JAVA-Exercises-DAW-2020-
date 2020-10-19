public class Random {
  public static void main (String [] args){
    String userMessage = " ";
    int num = 0;
    System.out.println("Introduzca la frase que quiere que se repita: ");
    userMessage = System.console().readLine();
    System.out.print("Introduzca el número de veces que quiere que se repita: ");
    num = Integer.parseInt(System.console().readLine());
    for( int i = 1; i <= num; i++){
      System.out.println(userMessage);
    }
  }
}
