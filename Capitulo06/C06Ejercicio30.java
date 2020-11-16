public class C06Ejercicio30 {
  public static void main (String [] args){
    System.out.print("Introduzca la altura de la pecera (como mínimo 4): ");
    int h = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el ancho de la pecera (como mínimo 4): ");
    int w = Integer.parseInt(System.console().readLine());
    int a = 0;
    int b = 0;
    int c = 0;
    int counter = 0;
    do{
      a = (int)(Math.random() * ((h - 2) * (w - 2)));
      b = (int)(Math.random() * ((h - 2) * (w - 2)));
      c = (int)(Math.random() * ((h - 2) * (w - 2)));
    }while( a == c || a == b || b == c );
    for(int i = 0; i < h; i++){
      for( int j = 0; j < w; j++){
        if( i == 0 || i == h - 1 || j == 0 || j == w - 1){
          System.out.print("*");
        }else if ( counter == a ){
          System.out.print("$");
          counter++;
        }else if( counter == b){
          System.out.print("@");
          counter++;
        }else if( counter == c){
          System.out.print("&");
          counter++;
        }else{
          System.out.print(" ");
          counter++;
        }
      }
      System.out.println();
    }
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
  }
}
