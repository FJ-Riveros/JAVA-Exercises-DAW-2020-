public class C07Ejercicio14 {
  public static void main (String [] args){
    String[] arr = new String[8];
    String[] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
    String[] aux = new String[8];
    int counter = 0;
    for(int i = 0; i < 8; i++){
      System.out.print("Introduzca una palabra, le quedan " + (8 - i) + " palabras por introducir: ");
      arr[i] = System.console().readLine();
    }
    
    for( int i = 0; i < 8; i++ ){
      for( int j = 0; j < 9; j++){
        if( arr[i].equals(colores[j]) ){
          aux[counter++] = arr[i];
        }
      }
    }
    boolean check = false;
    for( int i = 0; i < 8; i++ ){
      check = false;
      for( int j = 0; j < 9; j++){
        if( arr[i].equals(colores[j]) ){
          check = true;
        }
      }
      if( !check ) {
        aux[counter++] = arr[i];
      }
    }
    for(int i = 0; i < 8; i++){
      System.out.print(aux[i] + " ");
    }
  }
}
