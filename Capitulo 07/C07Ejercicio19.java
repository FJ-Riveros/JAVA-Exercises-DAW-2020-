public class C07Ejercicio19 {
  public static void main (String [] args){
    int[] original = new int[12];
    for(int i = 0; i < 12; i++){
      original[i] = (int)(Math.random() * 201);
    }
    System.out.print("Índice   ");
    for( int i = 0; i < 12; i++){
      System.out.printf("%4d" , i);
    }
    System.out.print("\nValor    ");
    for( int n: original ){
      System.out.printf("%4d", n);
    }
    System.out.println();
    System.out.print("Introduzca el número que quiera insertar: ");
    int insert = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la posición donde lo quiera insertar(0 - 11): ");
    int pos = Integer.parseInt(System.console().readLine());
    for( int i = 11; i > pos; i-- ){
      original[i] = original[ i - 1];
    }
    original[pos] = insert;
    System.out.print("Índice   ");
    for( int i = 0; i < 12; i++){
      System.out.printf("%4d" , i);
    }
    System.out.print("\nValor    ");
    for( int n: original ){
      System.out.printf("%4d", n);
    }
  }
}
