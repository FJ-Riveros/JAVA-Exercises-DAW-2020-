public class C06Ejercicio05 {
  public static void main (String [] args){
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int num = 0;
    int media = 0;
    for( int i = 0; i < 50; i++){
      num = (int)((Math.random() * 100) + 100);
      System.out.print(num + " ");
      media += num;
      if( num > max ){
        max = num;
      }
      if( num < min ){
        min = num;
      }
    }
    System.out.println("El máximo es " + max + " el mínimo es " + min + " y la media es " + media / 50);
  }
}
