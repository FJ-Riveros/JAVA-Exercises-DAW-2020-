public class C07Ejercicio19 {
  public static void main (String [] args){
    int[] original = new int[12];
    for(int i = 0; i < 12; i++){
      original[i] = (int)(Math.random() * 201);
    }
    System.out.println("Índice   ");
    for( int i = 0; i < 12; i++){
      System.out.printf("%4d" , i);
    }
    System.out.println("Valor    ");
    for( int n: original ){
      System.out.printf("%4d", n);
    }
  }
}
