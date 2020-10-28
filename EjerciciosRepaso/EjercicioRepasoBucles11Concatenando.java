public class EjercicioRepasoBucles11Concatenando {
  public static void main ( String [] args){
    String text;
    String aux = "";
    do{
    System.out.println("Introduzca las palabras");
    text = System.console().readLine();
    if( !text.equals("salir")){
      aux = text + " " + aux;
    }
    }while( !(text.equals("salir")));
    System.out.println(aux);
  }
}
