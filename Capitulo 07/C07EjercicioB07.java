public class C07EjercicioB07 {
  public static void main (String [] args){
    final int ROWS = 4;
    final int COLUMNS = 5;
    String[][] arr = new String[ROWS][COLUMNS];
    int minaX = 0;
    int minaY = 0;
    int tesoroX = 0;
    int tesoroY = 0;
    for(int i=0; i<ROWS; i++){
      for(int j=0; j<COLUMNS; j++){
        arr[i][j] = "█";
      }
    }
    minaX = (int)(Math.random() * 5);
    minaY = (int)(Math.random() * 4);
    do{
      tesoroX = (int)(Math.random() * 5);
      tesoroY = (int)(Math.random() * 4);
    }while( (tesoroX == minaX) && (tesoroY == minaY) );
    arr[tesoroY][tesoroX] = "%";
    arr[minaY][minaX] = "*";
    System.out.println();
    boolean fin = false;
    do{
      for(int i=0; i<ROWS; i++){
        for(int j=0; j<COLUMNS; j++){
          if( arr[i][j] == "*" || arr[i][j] == "%"){
            System.out.print("█"+ " ");
          }else {
            System.out.print(arr[i][j] + " ");
          }
        }
        System.out.println();
        System.out.println();
      }
      System.out.print("Introduzca la coordenada de la fila(1-4): ");
      int h = Integer.parseInt(System.console().readLine());
      h--;
      System.out.print("Introduzca la coordenada de la columna(1-5): ");
      int w = Integer.parseInt(System.console().readLine());
      w--;
      if( arr[h][w] == "*" || arr[h][w] == "%"){
        for(int i=0; i<ROWS; i++){
          for(int j=0; j<COLUMNS; j++){
            System.out.print(arr[i][j] + " ");
          }
          System.out.println();
          System.out.println();
        }
        if( arr[h][w] == "*" ){
          System.out.print("Has tocado una mina, has perdido");
        }else{
          System.out.print("Has ganado!");
        }
        fin = true;
      }else{
        if((Math.abs(w - minaX) < 2) && (Math.abs(h - minaY) < 2)){
          System.out.print("¡Cuidado! ¡Hay una mina cerca!");
          System.out.println();
        }
        arr[h][w] = "▒";
      }
    }while( fin == false );
  }
}
