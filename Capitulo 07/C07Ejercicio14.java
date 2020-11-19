public class C07Ejercicio14 {
  public static void main (String [] args){
    String[] arr = new String[8];
    String[] colores = new String [9];
    String[] aux = new String[8];
    int counter = 0;
    colores[0] = "verde";
    colores[1] = "rojo";
    colores[2] = "azul";
    colores[3] = "amarillo";
    colores[4] = "naranja";
    colores[5] = "rosa";
    colores[6] = "negro";
    colores[7] = "blanco";
    colores[8] = "morado";
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
