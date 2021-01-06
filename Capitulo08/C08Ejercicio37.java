import static Matematicas.OperacionesEnteros.digitos;
import static Matematicas.OperacionesEnteros.digitoN;
public class C08Ejercicio37{
  public static void main(String [] args){
    System.out.print("Introduzca un número a codificar en Morse: ");
    int input = Integer.parseInt(System.console().readLine());
    System.out.println(convierteEnMorse(input));
  }
  
  /*
   * Convierte un número decimal a la codificación Morse.
   * @param n      Entero decimal que deseamos convertir a Morse
   * @return       String con el número convertido
  */
  public static String convierteEnMorse(int n){
    String result = "";
    int digitoActual = 0;
    for(int i=0; i<digitos(n); i++){
      for(int j=1; j<=5; j++){
        digitoActual = digitoN((long)n, i);
        if(digitoActual == 0){
          result += "_ ";
        }else{
          if(digitoActual <= 5 && j<= digitoActual){
            result += ". ";
          }else if(digitoActual <= 5){
            result += "_ ";
          }else if(digitoActual > 5 && (j+5)<= digitoActual){
            result += "_ ";
          }else{
            result += ". ";
          }
        }
      }
    }
    return result;
  }
}
