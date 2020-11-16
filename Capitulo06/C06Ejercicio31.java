public class C06Ejercicio31 {
  public static void main (String [] args){
    System.out.print("Introduzca la cantidad de dinero que quiera apostar: ");
    int cant = Integer.parseInt(System.console().readLine());
    int firstDado = (int)(Math.random() * 6) + 1;
    int secondDado = (int)(Math.random() * 6) + 1;
    int original = 0;
    boolean lost = true;
    System.out.println("1  " + (firstDado + secondDado));
    switch ( firstDado + secondDado ){
      case 2: 
        lost = true;
      break;
      
      case 3: 
        lost = true;
      break;
      
      case 12: 
        lost = true;
      break;
      
      case 7: 
        lost = false;
      break;
      
      case 11: 
        lost = false;
      break; 
      default:  
        do{
          original = firstDado + secondDado;
          firstDado = (int)(Math.random() * 6) + 1; 
          secondDado = (int)(Math.random() * 6) + 1;
          System.out.println("2  " + (firstDado + secondDado));
          if( firstDado + secondDado == original ){
            lost = false;
          }
        }while( firstDado + secondDado != 7 && firstDado + secondDado != original);
    } 
    if( lost ){
      System.out.println("Usted ha perdido");
    }else{
      System.out.println("Usted ha ganado y obtiene: " + cant * 2 + " euros");
    }
  }
}
