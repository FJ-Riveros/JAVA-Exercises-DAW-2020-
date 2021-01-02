import Matematicas.ConversorDeSistemas;
public class pruebaEnteros{
public static void main(String [] args){
    //System.out.print("Introduzca un número :" );
    //String num = System.console().readLine();
    //System.out.print("Introduzca el digito a buscar :" );
    //int num = Integer.parseInt(System.console().readLine());
    //int exponente = Integer.parseInt(System.console().readLine());
    //System.out.println("Los digitos que tiene son " + Matematicas.OperacionesEnteros.potencia(num, exponente));
    //int[][] prueba = new int[5][5];
    /*for(int i=0; i< prueba.length; i++){
      prueba[i][j] = (int)(Math.random() * (20 + 1 - 10) + 10);
      System.out.print(prueba[i] + " ");
    }*/
    //int[][] minimo= Matematicas.ManipulacionArraysBidimensionales.generaArrayBiInt(5,5, 10, 20);
    int[][] minimo = {{0,1,2,3,4}, {5,6,7,8,9}};
    boolean posicion = Matematicas.ManipulacionArraysBidimensionales.esPuntoDeSilla(minimo,0, 1);
    System.out.println();
    for(int i=0; i<minimo.length; i++){
      for(int j=0; j<minimo[0].length; j++){
        System.out.print(minimo[i][j] + " ");
      }
      System.out.println();
    }
    
    System.out.println();
    System.out.println();
    System.out.println("Es punto de silla?" + posicion);
    
    /*for(int i=0; i<result.length; i++){
      System.out.print(result[i] + " ");
    }*/
  }
  
  
}
