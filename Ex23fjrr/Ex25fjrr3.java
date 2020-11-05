/*

@author: Francisco Javier Riveros Racero
Date: 5/11/2020
Turn: 2º

*/

public class Ex25fjrr3 {
  public static void main (String [] args){
    System.out.println("FACTURA TIENDA");
    System.out.println("==============");
    String name = "";
    double precioUnidad = 0;
    int cuant = 0;
    int iva = 0;
    do{
      System.out.print("Introduzca el nombre del artículo ('fin' para salir): ");
      name = System.console().readLine();
      if( !(name.equals("fin"))){
        System.out.print("Precio por unidad para " + name + " (IVA incluido): ");
        precioUnidad = Double.parseDouble(System.console().readLine());
        System.out.print("Cantidad de unidades de " + name + " : ");
        cuant = Integer.parseInt(System.console().readLine());
        System.out.print("Tipo de IVA aplicado a " + name + " (4,10,21): ");
        iva = Integer.parseInt(System.console().readLine());
      }
    }while(!(name.equals("fin")));
    
  }
}
