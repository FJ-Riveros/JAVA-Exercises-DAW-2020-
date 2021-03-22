public class PruebaTiempo{
  public static void main(String [] args){
    Tiempo prueba = new Tiempo(12,20,30);
    Tiempo prueba1 = new Tiempo(12,10,45);
    /*System.out.println(prueba);
    prueba.suma(prueba1);
    System.out.print(prueba);*/
    prueba.resta(prueba1);
    System.out.print(prueba);
  }
}
