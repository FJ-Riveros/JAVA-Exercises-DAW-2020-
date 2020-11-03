public class C05Ejercicio50Long {
  public static void main (String [] args){
    System.out.print("Introduzca la altura (5 como mínimo): ");
    int h = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el número de espacios entre los números (1 como mínimo): ");
    int space = Integer.parseInt(System.console().readLine());
    if( h >= 5 && space >= 1 ){
      for( int i = 0; i <= (space + space + 8); i++){
        if( i == 0 || (i > space && i <= 4 + space) || ( i > space + space + 4)){
          System.out.print("*");
        } else{
          System.out.print(" ");
        }
      }
      System.out.println();
      for( int i = 0; i <= (space + space + 8); i++){
        if( i == 0 || (i == space + 1) || (i == 3 + space + 2 + space)){
          System.out.print("*");
        }else{
          System.out.print(" ");
        }
      }
      System.out.println();
      for( int i = 0; i <= (space + space + 8); i++){
        if( i == 0 || (i > space && i <= 4 + space) || ( i > space + space + 4)){
          System.out.print("*");
        } else{
          System.out.print(" ");
        }
      }
      System.out.println();
      for( int j = 0; j < h - 4; j++){
        for( int i = 0; i <= (space + space + 8); i++){
          if( i == 0 || (i == space + 1 + 3) || (i == 3 + space + 5 + space )){
            System.out.print("*");
          }else{
            System.out.print(" ");
          }
        }
        System.out.println();
      }
      for( int i = 0; i <= (space + space + 8); i++){
        if( i == 0 || (i > space && i <= 4 + space) || ( i > space + space + 4)){
          System.out.print("*");
        } else{
          System.out.print(" ");
        }
      }
    }else{
      System.out.println("Error, los mínimos no han sido respetados");
    }
  }
}
