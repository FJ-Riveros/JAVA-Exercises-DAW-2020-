public class Ejercicio02 {
  public static void main(String[] args){
    int option = 0;
    Caballo Pegaso = new Caballo((float)1.52, (float)30.2, 5);
    System.out.print(Pegaso.devuelveDatosCaballo());
    System.out.print(Pegaso.presentaStats()); 
    do{
      option = Integer.parseInt(System.console().readLine());
      menu();
      switch(option){
        case 1:
          if(
        break;
        
        case 2:
        
        break;
        
        case 3:
        
        break;
        
        case 4:
        
        break;
        
        case 5:
        
        break;
        default:
      }
    }while(option !=6);
  }
  
  public static void menu(){
    System.out.println("1. Comer");
    System.out.println("2. Dormir");
    System.out.println("3. Beber");
    System.out.println("4. Saltar");
    System.out.println("5. Galopar");
    System.out.println("6. Salir");
    
  }
}
