public class C07Ejercicio10 {
  public static void main (String [] args){
    int[] original = new int[20];
    int[] result = new int[20];
    int counter = 0;
    for( int i = 0; i < 20; i++){
      original[i] = (int)(Math.random() * 101);
      if( original[i] % 2 == 0 ){
        result[counter] = original[i];
        counter++;
      }
    }
    for( int i = 0; i < 20; i++){
      if( original[i] % 2 != 0 ){
        result[counter] = original[i];
        counter++;
      }
    }
    for( int i = 0; i < 20; i++){
      System.out.print(result[i] + " ");
    }
  }
}
