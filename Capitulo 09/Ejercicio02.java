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
    System.out.print(pegaso.devuelveDatosCaballo());
    System.out.print(pegaso.presentaStats()); 
    do{
      option = Integer.parseInt(System.console().readLine());
      menu();
      switch(option){
        case 1:
          if(checkAumento
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
