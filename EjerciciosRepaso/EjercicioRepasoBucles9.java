public class EjercicioRepasoBucles9{
  public static void main (String [] args){
    int num;
    int count = 0;
    do{
      System.out.print("Introduzca un número entero( 0 para salir): ");
      num = Integer.parseInt(System.console().readLine());
      if( num != 0){
        System.out.println("El cuadrado de " + num + " es " + (num * num));
        count++; 
      }
      if( count == 4 ){
        num = 0;
      }
    }while( num != 0 );
  }
}
