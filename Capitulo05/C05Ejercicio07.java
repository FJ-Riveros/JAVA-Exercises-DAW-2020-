public class C05Ejercicio07 {
  public static void main (String [] args){
    int combinacion = 1853;
    int userAnswer = 0;
    for( int i = 0; i < 4; i++){
      System.out.println("Introduzca la combinación (4 Dígitos), intentos restantes: " + ( 4 - i));
      userAnswer = Integer.parseInt(System.console().readLine());
      if( userAnswer >= 10000){
        System.out.println("La combinación no puede ser mayor de 4 dígitos");
      }else{
        if ( userAnswer == combinacion) {
          System.out.println("La caja fuerte ha sido abierta satisfactoriamente");
          i = 4;
        }else{
          System.out.println("Lo siento, esa no es la combinación");
        }
      }
    }
  }
}
