import RecogidaDeDatos.*;
public class pruebaCaptura{
  public static void main(String [] args){
    int prueba = Entrada.Entero();
    System.out.print(prueba);
    
    float prueba1 = Entrada.Flotante();
    System.out.print(prueba1);
    
    String prueba2 = Entrada.Cadena();
    System.out.print(prueba2);
    
    char prueba3 = Entrada.Caracter();
    System.out.print(prueba3);
    
    long prueba4 = Entrada.Long();
    System.out.print(prueba4);
  }
}
