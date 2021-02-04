import RecogidaDeDatos.Entrada;
public class diagonalMatrizBidi{
  public static void main(String[] args){
    System.out.print("Introduzca las filas del Array: ");
    final int SIZEROWS = RecogidaDeDatos.Entrada.Entero();
    System.out.print("Introduzca las columnas del Array: ");
    final int SIZECOLUMNS = RecogidaDeDatos.Entrada.Entero();
    String[][] input = new String[SIZEROWS][SIZECOLUMNS];
    int[] helper = {input.length-1, input[0].length-1};
    System.out.println("Seleccione la diagonal: ");
    System.out.println("1- Desde la esquina superior izquierda.");
    System.out.println("2- Desde la esquina superior derecha.");
    System.out.println("3- Desde la esquina infieror izquierda.");
    System.out.println("4- Desde la esquina inferior derecha.");
    final int DIRECTION = RecogidaDeDatos.Entrada.Entero();
    int x = 0;
    int y = 0;
    switch( DIRECTION){
      case 2:
        x = helper[1];
      break;
      
      case 3:
        y = helper[0];
      break;
      
      case 4:
        x = helper[1];
        y = helper[0];
      break;
      
      default:
    }
    rellenaArrayConBlanco(input);
    devuelveDiagonal(input, y,x);
  }
    
  public static void devuelveDiagonal(String[][] input, int comienzoY, int comienzoX){
    int selectorX = comienzoX;
    int selectorY = comienzoY;
    for(int i=0; i<input.length; i++){
      if(comienzoY == 0 && comienzoX == 0){
        input[selectorY++][selectorX++] = "██";
      }else if(comienzoY==0 && comienzoX==input[0].length-1){
        input[selectorY++][selectorX--] = "██";
      }else if(comienzoY==input.length-1 && comienzoX==0){
        input[selectorY--][selectorX++] = "██";
      }else if(comienzoY==input.length-1 && comienzoX==input[0].length-1){
        input[selectorY--][selectorX--] = "██";
      }
    }
    presentaTabla(input);
  }
  
  public static void presentaTabla(String[][] input){
    for(int i=0; i<input.length; i++){
      for(int j=0; j<input[0].length; j++){
        System.out.print(input[i][j]);
      }
      System.out.println();
    }
  }
  
  public static void rellenaArrayConBlanco(String[][] input){
    for(int i=0; i<input.length; i++){
      for(int j=0; j<input[0].length; j++){
        input[i][j] = "▒▒";
      }
    }
  }
  
}
