public class C05Ejercicio26 {
  public static void main (String [] args){
    System.out.print("Introduzca un número: ");
    int num = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca un dígito: ");
    int digit = Integer.parseInt(System.console().readLine());
    int aux = num;
    int acc = 0;
    while( aux > 0 ){
      acc++;
      aux /= 10;
    }
    for( int i = 1; i <= acc; i++){
      if( num % (int)(Math.pow(10, (acc - i) + 1)) == digit){
        System.out.println("Lo tienes en la posición " + i);
      }
    }
    //System.out.println(num % (int)Math.pow(10,2));
  }
}
