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
    double ivaOp4 = 0;
    double ivaOp10 = 0;
    double ivaOp21 = 0;
    double total = 0;
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
        switch (iva){
          case 4:
            ivaOp4 += (((precioUnidad * cuant) * 100) / 104);  
          break;
          
          case 10:
            ivaOp10 += (((precioUnidad * cuant) * 100) / 110);
          break;
          
          case 21:
            ivaOp21 += (((precioUnidad * cuant) * 100) / 121);
          break;
          default:
        }
        total += cuant * precioUnidad;
      }
    }while(!(name.equals("fin")));
    System.out.println();
    System.out.printf("%-35s %8.2f\n", "TOTAL:", total);
    for( int i = 0; i < 45; i++){
      System.out.print("-");
    }
    System.out.println();
    System.out.printf("%-24s %8.2f %-4s %5.2f\n", "Base imponible   4%:",ivaOp4,"IVA:", ivaOp4 * 0.04);
    System.out.printf("%-24s %8.2f %-4s %5.2f\n", "Base imponible  10%:",ivaOp10,"IVA:", ivaOp10 * 0.10);
    System.out.printf("%-24s %8.2f %-4s %5.2f\n", "Base imponible  21%:",ivaOp21,"IVA:", ivaOp21 * 0.21);
  }
}
