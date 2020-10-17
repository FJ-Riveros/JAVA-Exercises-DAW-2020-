public class C05Ejercicio10 {
  public static void main (String [] args){
    float num = 0;
    int counter = 0;
    float acumulator = 0;
    System.out.println("Este programa indica la media de los números introducidos, para terminar introduzca un número negativo");
    do{
      System.out.print("Introduzca un número: ");
      num = Integer.parseInt(System.console().readLine());
      if( num >= 0 ){
      acumulator = acumulator + num;
      counter++;
      }
    }while( num >= 0 );
    System.out.println("La media es de: " + (acumulator / counter));
  }
}
