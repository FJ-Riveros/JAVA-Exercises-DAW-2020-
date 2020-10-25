public class EjercicioRepasoBucles10 {
  public static void main (String [] args){
    String acc = "";
    String input;
    do{
      System.out.println("Introduzca una palabra( acaba con 'salir'): ");
      input = System.console().readLine();
      if( !input.equals("salir")){
        acc += input + " " ;
      }
    }while( !input.equals("salir"));
    System.out.println(acc);
  }
}
