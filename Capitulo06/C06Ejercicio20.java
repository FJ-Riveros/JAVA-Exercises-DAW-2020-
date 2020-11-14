public class C06Ejercicio20 {
  public static void main (String [] args){
    //NO FUNCIONA
    System.out.println("Introduzca la capacidad de la cuba en litros: ");
    int capacity = Integer.parseInt(System.console().readLine());
    int liters = (int)(Math.random() * (capacity + 1));
    for( int i = 0; i <= capacity; i++){
      for( int j = 0; j < 6; j++){
        if( i == capacity){
          System.out.print("*");
        }else if ( liters <= (capacity - i) ){
          if( j == 0 || j == 5 ){
            System.out.print("*");
          }else{
            System.out.print("=");
          }
        }else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    System.out.println(liters);
  }
}
