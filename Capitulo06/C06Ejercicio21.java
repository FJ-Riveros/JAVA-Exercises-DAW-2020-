public class C06Ejercicio21 {
  public static void main (String [] args){
    System.out.print("Introduzca la altura de la serpiente: ");
    int h = Integer.parseInt(System.console().readLine());
    int pos = 12;
    int random;
    for( int j = 0; j < h; j++){
      random = (int)(Math.random() * 3);
      switch( random){
        case 1:
          pos -= 1;
        break;
        
        case 2:
          pos += 1;
        break;
        default:
      }
      for( int i = 0; i < pos; i++){
        System.out.print(" ");
      }
      if( j == 0 ){
        System.out.print("@");
      }else{
        System.out.print("*");
      }
      System.out.println();  
    }
  }
}
