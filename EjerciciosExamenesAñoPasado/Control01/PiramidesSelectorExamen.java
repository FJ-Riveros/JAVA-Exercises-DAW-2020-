public class PiramidesSelectorExamen {
  public static void main(String [] args){
    System.out.print("Introduzca la altura que desea: ");
    int h = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la orientación (izquierda, derecha, arriba, abajo): ");
    String direction = System.console().readLine();
    System.out.print("Introduzca el primer carácter: ");
    char firstCharacter = System.console().readLine().charAt(0);
    System.out.print("Introduzca el segundo carácter: ");
    char secondCharacter = System.console().readLine().charAt(0);
    int i = 0;
    
    switch (direction){
      case "izquierda":
        for(  i = 1; i <= h; i++){
          for(int l = 0; l < h - i; l++){
            System.out.print(" ");
          }
          for( int j = 0; j < i; j++){
            if( j % 2 == 0 ){
              System.out.print(firstCharacter);
            }else{
              System.out.print(secondCharacter);
            }
          }
          System.out.println();
        }
        for( int k = i - 2; k >= 1; k--){
          for(int l = 0; l < h - k; l++){
            System.out.print(" ");
          }
          for( int j = 0; j < k; j++){
            if( j % 2 == 0){
              System.out.print(firstCharacter);
            }else{
              System.out.print(secondCharacter);
            }
          }
          System.out.println();
        }
      break;
      
      case "derecha":
        for(  i = 1; i <= h; i++){
          for( int j = 0; j < i; j++){
            if( j % 2 == 0 ){
              System.out.print(firstCharacter);
            }else{
              System.out.print(secondCharacter);
            }
          }
          System.out.println();
        }
        for( int k = i - 2; k >= 1; k--){
          for( int j = 0; j < k; j++){
            if( j % 2 == 0){
              System.out.print(firstCharacter);
            }else{
              System.out.print(secondCharacter);
            }
          }
          System.out.println();
        }
      break;
      
      case "arriba":
        for( int l = 1; l <= h; l++){
          for( int j = 0; j < h - l; j++){
            System.out.print(" ");
          }
          for( int k = 0; k < (l * 2) - 1; k++){
            if( k % 2 == 0){
              System.out.print(firstCharacter);
            }else{
              System.out.print(secondCharacter);
            }
          }
          System.out.println();
        }
      break;
      
      case "abajo":
        for( int l = 1; l <= h; l++){
          for(int k = 1; k < l; k++){
            System.out.print(" ");
          }
          for(int j = 0; j < ((h - (l - 1 )) * 2) - 1; j++){
            if( j % 2 == 0 ){
              System.out.print(firstCharacter);
            }else{
              System.out.print(secondCharacter);
            }
          }
          System.out.println();
        }
      break;
      
      default:
    }
  }
}
