import Matematicas.OperacionesEnteros;

public class C08Ejercicio17{
  public static void main (String [] args){
    System.out.print("Este programa convierte números binarios a decimales, introduzca el número binario: \n");
    int numBinario = Integer.parseInt(System.console().readLine());
    int digits = Matematicas.OperacionesEnteros.digitos(numBinario);
    int multiplicador = 1;
    int result = 0;
    for(int i = 0; i < digits; i++){
      if(numBinario%10 == 1){
        result += multiplicador;
      }
      multiplicador *= 2;
      numBinario /= 10;
    }
    System.out.print("Equivalencia a decimal: " + result);
  }
}
