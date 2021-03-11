import RecogidaDeDatos.Entrada;

public class Ejercicio02 {
  public static void main(String[] args){
    int option = 0;
    System.out.println("Recogida de datos del caballo." );
    /*System.out.print("Escriba el nombre de su caballo:" );
    String nombre = System.console().readLine();*/
    System.out.print("Escriba la altura de su caballo:" );
    float altura = Entrada.Flotante();
    System.out.print("Escriba el peso de su caballo:" );
    float peso = Entrada.Flotante();
    System.out.print("Escriba la edad de su caballo:" );
    int edad = Entrada.Entero();
    
    Caballo pegaso = new Caballo(altura, peso, edad);
    //System.out.print(pegaso.devuelveDatosCaballo());
     
    do{
      menu();
      option = Entrada.Entero();
      switch(option){
        case 1:
          if(pegaso.checkAumento("Comida")){
            pegaso.aumentaBarra("Comida");
            System.out.println("\n>El caballo ha comido.");
          }else{
            System.out.println("\n>El caballo no tiene hambre.");
          }
        break;
        
        case 2:
          if(pegaso.checkAumento("Descanso")){
            pegaso.aumentaBarra("Descanso");
            System.out.println("\n>El caballo ha dormido.");
          }else{
            System.out.println("\n>El caballo no tiene sueño.");
          }
        break;
        
        case 3:
          if(pegaso.checkAumento("Agua")){
            pegaso.aumentaBarra("Agua");
            System.out.println("\n>El caballo ha bebido agua.");
          }else{
            System.out.println("\n>El caballo no tiene sed.");
          }
        break;
        
        case 4:
          if(pegaso.checkDisminucion("Comida")){
            pegaso.disminuyeBarra("Comida");
            System.out.print(pegaso.saltoCaballo());
          }else{
            System.out.println("El caballo no puede saltar");
          }
          
        break;
        
        case 5:
        
        break;
        
        case 6:
          System.out.print(pegaso.presentaStats());
        break;
        default:
      }
    }while(option !=7);
  }
  
  public static void menu(){
    System.out.println("1. Comer");
    System.out.println("2. Dormir");
    System.out.println("3. Beber");
    System.out.println("4. Saltar");
    System.out.println("5. Galopar");
    System.out.println("6. Estatus del Caballo");
    System.out.println("7. Salir");
  }  
}
