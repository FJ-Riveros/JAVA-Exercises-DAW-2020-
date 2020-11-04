public class EjercicioTicketExamen {
  public static void main (String [] args){
    System.out.print("Introduzca el precio del artículo (En euros): ");
    float price = Float.parseFloat(System.console().readLine());
    System.out.print("Introduzca el número de unidades: ");
    int cuant = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el código de descuento: ");
    int desc = Integer.parseInt(System.console().readLine());
    System.out.println("A continuación se le muestra el precio desglosado del pedido:"); 
    double subTotal = (double)price * cuant;
    double cantDescuento = 0;
    switch(desc){
      case 685:
        cantDescuento = 15;
      break;
      
      case 778:
        if( cuant >= 20 ){
          cantDescuento = ((20 * price) * 0.05);
        }else{
          cantDescuento = ((cuant * price) * 0.05);
        }
      break;
      
      case 219:
        if(cuant > 5){
          cantDescuento = 5 * price; 
        }
      break;
      default:
        cantDescuento = 0;
    }
    
    for( int i = 0; i < 50; i++){
      System.out.print("-");
    }
    System.out.println();
    System.out.printf("%-38s %9.2f %1s \n" , "Precio del artículo:", price, "$");
    System.out.printf("%-39s %5d \n" , "Número de unidades:", cuant);
    System.out.printf("%-39s %8.2f %1s \n" , "Precio total unidades:", subTotal, "$");
    System.out.printf("%-20s %-10d %9.2f %1s \n" , "Descuento aplicado: Código:", desc, cantDescuento, "$");
    System.out.printf("%-38s %9.2f %1s \n" , "Precio con descuento:", subTotal - cantDescuento, "$");
    System.out.printf("%-38s %9.2f %1s \n" , "IVA (21%):", (subTotal - cantDescuento) * 0.21, "$");
    for( int i = 0; i < 50; i++){
      System.out.print("-");
    }
    System.out.println();
    System.out.printf("%-38s %9.2f %1s \n" , "PRECIO FINAL", ((subTotal - cantDescuento) * 0.21) + (subTotal - cantDescuento), "$");
  }
}
