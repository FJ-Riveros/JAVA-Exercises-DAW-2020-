import RecogidaDeDatos.Entrada;
public class diagonalMatrizBidi{
  public static void main(String[] args){
    //TERMINAR TENIENDO EN CUENTA EL CASO DE QUE ES MUY LIOSO, CAMBIAR EL INPUT DEL USER CON NUMEROS
    System.out.print("Introduzca las filas del Array: ");
    final int SIZEROWS = RecogidaDeDatos.Entrada.Entero();
    System.out.print("Introduzca las columnas del Array: ");
    final int SIZECOLUMNS = RecogidaDeDatos.Entrada.Entero();
    String[][] input = new String[SIZEROWS][SIZECOLUMNS];
    System.out.print("Introduzca la dirección de la diagonal: ");
    final int DIRECTION = RecogidaDeDatos.Entrada.Entero();
    System.out.print("Introduzca la fila desde donde quiere comenzar: ");
    final int ROW = RecogidaDeDatos.Entrada.Entero();
    System.out.print("Introduzca la columna desde donde quiere comenzar: ");
    final int COLUMN = RecogidaDeDatos.Entrada.Entero();
    rellenaArrayConBlanco(input);
    devuelveDiagonal(input, ROW,COLUMN);
    
    
  }
  
  public static void devuelveDiagonal(String[][] input, int ROW, int COLUMN){
    int selectorX = COLUMN;
    int selectorY = ROW;
    for(int i=0; i<input.length; i++){
      if(ROW == 0 && COLUMN == 0){
        input[selectorY++][selectorX++] = "██";
      }else if(ROW==0 && COLUMN==input[0].length-1){
        input[selectorY++][selectorX--] = "██";
      }else if(ROW==input.length-1 && COLUMN==0){
        input[selectorY--][selectorX++] = "██";
      }else if(ROW==input.length-1 && COLUMN==input[0].length-1){
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
