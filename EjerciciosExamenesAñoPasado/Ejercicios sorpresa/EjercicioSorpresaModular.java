public class EjercicioSorpresaModular{
  public static void main(String [] args){
    System.out.print("Indique las filas del Array:" );
    final int  FILAS= Integer.parseInt(System.console().readLine());
    System.out.print("Indique el primer valor para rellenar el Array:" );
    final int VALORA = Integer.parseInt(System.console().readLine());
    System.out.print("Indique el segundo valor para rellenar el Array:");
    final int VALORB = Integer.parseInt(System.console().readLine());
    int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
    presentaArrayBidimensional(arr, "columna");
  }
    public static void presentaArrayBidimensional(int[][] input, String formato){
      int comienzoFilas = 0;
      int finFilas = 0;
      int comienzoColumnas = 0;
      int finColumnas = 0;
      int igualadorFilas = 0;
      int igualadorColumnas = 0;
      switch(formato){
        case "filas":
        igualadorColumnas = 0;
        break;
        
        case "filainvertida":
          igualadorColumnas = input[0].length-1;
        break;
        
        case "columna":
          igualadorColumnas = 0;
          igualadorFilas = 0;
          
        break;
        
        case "columnainvertida":
          comienzoFilas = 0;
          finFilas = input.length;
          comienzoColumnas = 0;
          finColumnas = input[0].length;
          igualadorColumnas = input[0].length;
          igualadorFilas = input.length;
        break;
      }
      for(int i=0; i<input.length; i++){
        for(int j=0; j<input[0].length; j++){
          if(formato.equals("filas") || formato.equals("filainvertida")){
            System.out.printf("%4d", input[i][Math.abs(igualadorColumnas-j)]);
          }else{
            System.out.printf("%4d", input[Math.abs(igualadorColumnas-j)][igualadorFilas]);
          }
        }
        System.out.println();
      }
    }
}  
    /*public static int[][] rellenaYCreaArrayConDosValores(int FILAS, int COLUMNAS,
    int VALORA, int VALORB){
      
      
    }*/
  

