public class C06Ejercicio26 {
  public static void main (String [] args){
    //NO TERMINADO
    System.out.print("Introduzca la anchura de la tableta: ");
    int w = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la altura de la tableta: ");
    int h = Integer.parseInt(System.console().readLine());
    for( int i = 0; i < h; i++){
      for(int j = 0; j < w; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
