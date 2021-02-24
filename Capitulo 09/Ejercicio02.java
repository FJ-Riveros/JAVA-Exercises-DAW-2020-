public class Ejercicio02 {
  public static void main(String[] args){
    int option = 0;
    System.out.println("Si no sabe alguno de los datos requeridos, presione enter." );
    /*System.out.print("Escriba el nombre de su caballo:" );
    String nombre = System.console().readLine();*/
    System.out.print("Escriba la altura de su caballo:" );
    float altura = Float.parseFloat(System.console().readLine());
    System.out.print("Escriba el peso de su caballo:" );
    float peso = Float.parseFloat(System.console().readLine());
    System.out.print("Escriba la edad de su caballo:" );
    int edad = Integer.parseInt(System.console().readLine());
    
    Caballo pegaso = new Caballo(altura, peso, edad);
    //System.out.print(pegaso.devuelveDatosCaballo());
     
    do{
      menu();
      option = Integer.parseInt(System.console().readLine());
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
