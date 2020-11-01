public class C05Ejercicio36 {
  public static void main (String [] args){
    System.out.print("Introduzca un número entero positivo: ");
    int num = Integer.parseInt(System.console().readLine());
    int aux = num;
    int counter = 0;
    boolean result = false;
    while( aux > 0 ){
      aux /= 10;
      counter++;
    }
    if( counter == 1 || counter == 2){
      result = true;
    }
    
    if( result == true ){
      System.out.println("El número: " + num + " es capicúa");
    }else{
      System.out.println("El número: " + num + " no es capicúa");
    }
  }
}
