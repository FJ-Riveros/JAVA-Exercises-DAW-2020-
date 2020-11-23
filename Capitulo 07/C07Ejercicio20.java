public class C07Ejercicio20 {
  public static void main (String [] args){
    System.out.print("Introduzca el número total de Reyes: ");
    int total = Integer.parseInt(System.console().readLine());
    String[] reyes = new String[total];
    System.out.print("Vaya introduciendo los nombres de los Reyes y pulsando INTRO.");
    System.out.println();
    for( int i = 0; i < total; i++){
      reyes[i] = System.console().readLine();
    }
    System.out.println("Los reyes introducidos son: \n");
    int counter = 0;
    for(int i = 0; i < total; i++){
      counter = 0;
      for(int j = 0; j <= i; j++){
        if( reyes[j].equals(reyes[i]) ){
          counter++;
        }
      }
      System.out.print(reyes[i] + " " + counter + "º");
      System.out.println();
    }
    /*for( String n: reyes ) {
      System.out.print(n + " ");
    }
    */
  }
}
