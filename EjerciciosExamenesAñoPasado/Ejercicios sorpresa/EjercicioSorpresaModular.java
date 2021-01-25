public class EjercicioSorpresaModular{
  public static void main(String [] args){
    System.out.print("Indique las filas del Array:" );
    final int  FILAS= Integer.parseInt(System.console().readLine());
    System.out.print("Indique el primer valor para rellenar el Array:" );
    final int VALORA = Integer.parseInt(System.console().readLine());
    System.out.print("Indique el segundo valor para rellenar el Array:");
    final int VALORB = Integer.parseInt(System.console().readLine());
    int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
    presentaArrayBidimensional(arr, "filas");
    presentaArrayBidimensional(arr, "filainvertida");
    presentaArrayBidimensional(arr, "columna");
    presentaArrayBidimensional(arr, "columnainvertida");
    
  }
    public static void presentaArrayBidimensional(int[][] input, String formato){
      int finVariableA = input.length;
      int finVariableB= input[0].length;
      int igualadorColumnas = 0;
      int igualadorFilas = input.length-1;
      switch(formato){
        case
      }
      if(formato.equals("filainvertida")) igualadorColumnas = input[0].length-1;
      if(formato.equals("columna")) igualadorFilas = 0;
      if(formato.equals("columna") || 
      formato.equals("columnainvertida")){
        finVariableA = input[0].length;
        finVariableB = input.length;
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
}  
    /*public static int[][] rellenaYCreaArrayConDosValores(int FILAS, int COLUMNAS,
    int VALORA, int VALORB){
      
      
    }*/
  

