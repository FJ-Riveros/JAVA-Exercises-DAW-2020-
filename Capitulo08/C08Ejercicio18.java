import Matematicas.OperacionesEnteros;
public class C08Ejercicio18{
  public static void main (String [] args){
    System.out.print("Este programa convierte decimales en binarios, introduzca el decimal: ");
    int dec = Integer.parseInt(System.console().readLine());
    int counter = 0;
    int bits = 0;
    int restaCiclica = 0;
    int result = 0;
    while(bits < dec){
      bits = Matematicas.OperacionesEnteros.potencia(2, counter);
      if(bits < dec){
        counter++;
      }
    }
    for(int i=counter; i>=0; i--){
      restaCiclica = Matematicas.OperacionesEnteros.potencia(2, i);
      if(dec - restaCiclica >=0){
      dec -= restaCiclica;
      result = (result * 10) + 1;
      }else{
        result *= 10;
      }
    }
    System.out.print("El número en binario es el: " + result);
  }
}
