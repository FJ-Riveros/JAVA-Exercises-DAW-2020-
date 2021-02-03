import funcionesAux01.Auxiliares01.*;
public class Ejercicio01{
  //Terminar
  public static void main(String[] args){
    String[] datos = {"Coche", "Avión", "Rueda", "Camión", "Silla"};
    char[] result = funcionesAux01.Auxiliares01.eligePalabra(datos);
    for(char item: result) System.out.print(item + " ");
    char[] letrasOcultas = funcionesAux01.Auxiliares01.palabraEnBlanco(funcionesAux01.Auxiliares01.longitudPalabra(result));
    System.out.println();
    funcionesAux01.Auxiliares01.presentaPalabra(letrasOcultas);
  }
}
