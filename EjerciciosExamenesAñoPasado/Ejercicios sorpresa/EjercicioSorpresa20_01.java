public class EjercicioSorpresa20_01{
  public static void main(String [] args){
    String[] opciones = {"Suma", "Resta", "Multiplica", "Salir"};
    System.out.print("Usted ha elegido la opción: " + opciones[menu(opciones)]);
  }
  public static int menu(String[] opciones){
    System.out.print("MENU: Elija opción:\n");
    for(int i=0; i<opciones.length; i++){
      System.out.println((i+1) + ".- " + opciones[i]);
    }
    System.out.print("Indique opción: ");
    return Integer.parseInt(System.console().readLine()) - 1;
  }
}
