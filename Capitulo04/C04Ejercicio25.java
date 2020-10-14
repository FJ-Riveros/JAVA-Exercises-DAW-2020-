public class C04Ejercicio25 {
  public static void main (String [] args){
    int h = 0;
    int width = 0;
    String bordado = "";
    double base = 0;
    System.out.print("Introduzca la altura de la bandera en cm:  ");
    h = Integer.parseInt(System.console().readLine());
    System.out.println();
    System.out.print("Introduzca el ancho de la bandera en cm:  ");
    width = Integer.parseInt(System.console().readLine());
    System.out.println();
    System.out.print("¿Quiere escudo bordado? ( s / n )  ");
    bordado = System.console().readLine();
    System.out.println();
    System.out.println("Gracias. Aquí tiene el desglose de su compra.");
    System.out.println();
    base = (h * width);
    
    System.out.printf(" %-10s %-4.0f %-10s %-7.1f \n" , "Bandera de" , base, "cm2:", (base * 0.1));
    System.out.printf(" %-26s %-7.1s \n" , "Con escudo:" , "2,50");
    System.out.printf(" %-10s %-4.0f %-10s %-7.1f \n" , "Bandera de" , base, "cm2:", (base * 0.1));
    System.out.printf(" %-10s %-4.0f %-10s %-7.1f \n" , "Bandera de" , base, "cm2:", (base * 0.1));    
    
    
  }
}
