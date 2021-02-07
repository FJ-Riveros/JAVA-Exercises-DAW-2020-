import RecogidaDeDatos.Entrada;
public class PruebaEntrada{
  public static void main(String[] args){
    /*System.out.print("Introduzca un entero: ");
    int prueba = RecogidaDeDatos.Entrada.Entero();
    System.out.print(prueba);*/
    long pruebalong = Entrada.Long();
    System.out.println(pruebalong);
    String pruebaString = Entrada.Cadena();
    System.out.print(pruebaString);
  }
}
