public class C06Ejercicio09{
  public static void main (String [] args){
    int num = 1 ;
    int counter = 0;
    do {
      num = (int)((Math.random() * 50.5) * 2 );
      counter++;
    }while ( num != 24 );
    System.out.println("Se han generado " + counter + " números");
  }
}
