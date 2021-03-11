public class PruebaZona{
  public static void main(String[] args){
    Zona principal = new Zona(1000);
    Zona compra_venta = new Zona(200);
    Zona vip = new Zona(25);
    int userInput = 0;
    int inputZona = 0;
    int entradasDeseadas = 0;
    do{
      presentaMenu();
      userInput = Integer.parseInt(System.console().readLine());
      if(userInput == 1){
        System.out.println("Quedan " + (principal.getEntradasPorVender() + compra_venta.getEntradasPorVender() + vip.getEntradasPorVender()) + " entradas por vender.");
      }else if( userInput == 2){
        System.out.println("Introduzca la zona de la que quiere comprar las entradas: ");
        System.out.println("1. Principal. ");
        System.out.println("2. Compra/Venta. ");
        System.out.println("3. VIP. ");
        inputZona = Integer.parseInt(System.console().readLine());
        if(inputZona >3 || inputZona<1){
          System.out.println("Esa zona no existe.");
        }else{
          System.out.println("Introduzca el número de entradas que quiere: ");
          entradasDeseadas = Integer.parseInt(System.console().readLine());
          switch(inputZona){
          case 1:
            principal.vender(entradasDeseadas);
          break;
          
          case 2:
            compra_venta.vender(entradasDeseadas);
          break;
          
          case 3:
            vip.vender(entradasDeseadas);
          break;
          }
        }
      }
    }while(userInput != 3);
  }
  
  public static void presentaMenu(){
    System.out.println("1. Mostrar número de entradas libres.");
    System.out.println("2. Vender entradas.");
    System.out.println("3. Salir.");
  }
}
