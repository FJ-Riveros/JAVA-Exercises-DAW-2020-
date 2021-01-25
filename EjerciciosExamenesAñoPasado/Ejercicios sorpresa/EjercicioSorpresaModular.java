public class EjercicioSorpresaModular{
  public static void main(String [] args){
    System.out.print("Indique las filas del Array:" );
    final int  FILAS = Integer.parseInt(System.console().readLine());
    System.out.print("Indique las columnas del Array:" );
    final int  COLUMNAS = Integer.parseInt(System.console().readLine());
    System.out.print("Indique el primer valor para rellenar el Array:" );
    final int VALORA = Integer.parseInt(System.console().readLine());
    System.out.print("Indique el segundo valor para rellenar el Array:");
    final int VALORB = Integer.parseInt(System.console().readLine());
    //int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
    int[][] prueba = rellenaYCreaArrayConDosValores(FILAS,COLUMNAS,VALORA,VALORB);
    presentaArrayBidimensional(prueba, "filas");
    presentaArrayBidimensional(prueba, "filainvertida");
    presentaArrayBidimensional(prueba, "columna");
    presentaArrayBidimensional(prueba, "columnainvertida");
    
  }
    public static void presentaArrayBidimensional(int[][] input, String formato){
      int finVariableA = input.length;
      int finVariableB= input[0].length;
      int igualadorColumnas = 0;
      int igualadorFilas = input.length-1;
      switch(formato){
        case "filainvertida":
          igualadorColumnas = input[0].length-1;
        break;
        
        case "columna":
        igualadorFilas = 0;
        finVariableA = input[0].length;
        finVariableB = input.length;
        break;
        
        case "columnainvertida":
        finVariableA = input[0].length;
        finVariableB = input.length;
        break;
        default:
      }
      for(int i=0; i<finVariableA; i++){
        for(int j=0; j<finVariableB; j++){
          if(formato.equals("filas") || formato.equals("filainvertida")){
            System.out.printf("%4d", input[i][Math.abs(igualadorColumnas-j)]);
          }else{
            System.out.printf("%4d", input[Math.abs(igualadorFilas-j)][Math.abs(igualadorColumnas-i)]);
          }
        }
        System.out.println();
      }
      System.out.println();
    }
 
    public static int[][] rellenaYCreaArrayConDosValores(int FILAS, int COLUMNAS,
    int VALORA, int VALORB){
      int[][] result;
        
      if(VALORA>VALORB) {
        int aux;
        aux = VALORB;
        VALORB = VALORA;
        VALORA = aux;
      }
    
      result = new int [FILAS][COLUMNAS];
      for (int i=0; i<FILAS; i++) {
        for (int j=0; j<COLUMNAS; j++) {
          result[i][j] = (int) (Math.random()*(VALORB-VALORA+1))+VALORA;
        }
      }
      return result;
    }  
}  
