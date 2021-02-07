public class EjercicioSorpresaSubmatriz{
  public static void main(String [] args){
    System.out.print("Introduzca la coordenada Y de la matriz original:");
    int y = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la coordenada X de la matriz original:");
    int x = Integer.parseInt(System.console().readLine());
    int[][] input = rellenaYCreaArrayConDosValores(5,5,10,20);
    System.out.print("Matriz de origen: \n");
    for(int i=0; i<input.length; i++){
      for(int j=0; j<input[0].length; j++){
        System.out.print(input[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
    int[] result = repetidosSubmatriz(input, x, y);
    System.out.print("\nResultado: \n");
    for(int i=0; i<result.length; i++) System.out.print(result[i] + " ");
  }
  
  public static int[] repetidosSubmatriz(int[][] x, int coordx, int coordy){
    int counter = 0;
    boolean check = false;
    int[] unidadesEnBlanco = new int[x.length*x[0].length];
    for(int i=0; i<x.length; i++){
      for(int j=0; j<x[0].length; j++){
        check = false;
        if((i < coordy && j>coordx) || (i>coordy)){
          for(int p=0; p<unidadesEnBlanco.length; p++){
            if(x[i][j] == unidadesEnBlanco[p]) check = true;
          }
          if(!check) unidadesEnBlanco[counter++] = x[i][j]; 
        }
      }
    }
    //Check si está en el array original
    int[] aux = new int[counter];
    int counterB = 0;
    for(int i=0; i<=coordy; i++){
      for(int j=0; j<=coordx; j++){
        for(int u=0 ;u<unidadesEnBlanco.length; u++){
          if(unidadesEnBlanco[u] == x[i][j]){
            aux[counterB++] = x[i][j];
            unidadesEnBlanco[u] = Integer.MIN_VALUE;
          }
        }
      }
    }
    int[] result = new int[counterB];
    for(int i=0; i<counterB; i++){
      result[i] = aux[i];
    }
    return result;
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
