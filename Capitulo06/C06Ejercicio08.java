public class C06Ejercicio08 {
  public static void main (String [] args){
    int resultadoPartido;
    int columnas = 3;
    for( int filas = 1; filas <= 15; filas++){
      System.out.printf("%4d |", filas);
      if( filas == 15 ){
        columnas = 1;
      }
      for( int apuesta = 1; apuesta <= columnas; apuesta++){
        resultadoPartido = (int)(Math.random() * 6) + 1;
        if( resultadoPartido <= 3){
           System.out.print("1   |");
        }else if( resultadoPartido == 4 || resultadoPartido == 5 ){
           System.out.print(" X  |");
        }else{
           System.out.print("   2|");
        }
      }
      System.out.println();
    }
  }
}
