public class C04Ejercicio15{
  public static void main (String [] args){
    String r;
    String direccion;
    System.out.println("Este programa pinta una piramide rellena con el carácter indicado");
    System.out.println("Introduce el carácter que desees");
    r = System.console().readLine();
    System.out.println("Introduzca la dirección de la pirámide: ");
    System.out.println("-Arriba");
    System.out.println("-Abajo");
    System.out.println("-Derecha");
    System.out.println("-Izquierda");
    direccion = System.console().readLine();
    switch (direccion){
    
    case "Arriba":
      for(int i = 0; i < 4; i ++){
        for(int j = 0; j < 4 - i; j++){
          System.out.print(" ");
        }
        for(int j = 0; j < (i * 2) - 1; j++){
          System.out.print(r);
        }
        System.out.println();
      }
    break;
    
    case "Abajo":
      System.out.println();
      for(int i = 0; i < 4; i ++){
        for(int j = 0; j < i; j++){
          System.out.print(" ");
        }
        for(int j = 4; j > (i * 2) - 1; j--){
          System.out.print(r);
        }
        System.out.println();
      }
    break;
    
    case "Derecha":
      System.out.println();
      System.out.println(" " + r);
      System.out.println(" " + r + r);
      System.out.println(" " + r + r + r);
      System.out.println(" " + r + r);
      System.out.println(" " + r);
    break;
    
    case "Izquierda":
    System.out.println();
      System.out.println("   " + r);
      System.out.println("  " + r + r);
      System.out.println(" " + r + r + r);
      System.out.println("  " + r + r);
      System.out.println("   " + r);
    break;
    
    default:
    }
  }
}
