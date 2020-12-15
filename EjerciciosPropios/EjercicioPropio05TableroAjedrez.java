public class EjercicioPropio05TableroAjedrez{
  public static void main (String [] args){
    int[][] arr = new int[8][8];
    System.out.print("Introduzca la posición que desee: ");
    final String input = System.console().readLine();
    int y = input.charAt(0) - '1';
    int x = input.charAt(1) - 'a';
    int difY = 0;
    int difX = 0;
    String result = "";
    char resultFilas,
    resultColumnas;
    System.out.print("Los posibles movimientos son: \n");
    for(int i=0; i<8; i++){
      for(int j=0; j<8; j++){
        difY = Math.abs(i - y);
        difX = Math.abs(j - x);
        if(difY == difX && i != y && j != x){
          resultFilas = (char)(i + '1');
          resultColumnas = (char)(j + 'a');
          System.out.print(resultFilas + "" + resultColumnas + " ");
        }
      }
    }
  }
}
