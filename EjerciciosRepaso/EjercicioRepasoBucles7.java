public class EjercicioRepasoBucles7 {
  public static void main (String [] args){
    System.out.println("Introduzca el número de filas que desea");
    int num = Integer.parseInt(System.console().readLine());
    for( int i = 1; i <= num; i++){
      for( int j = 1; j < num - (i - 1); j++){
        System.out.print(" ");
      } 
      
      for( int k = 1; k <= i; k++){
        System.out.print(i);
      }
      System.out.println();
    }
    System.out.println();
    
    for( int i = 0; i < num; i++){
        for( int j = 1; j < (num - i ); j++){
          System.out.print(" ");
        }
        for( int k = 0; k <= i; k++){
          System.out.print(num - i);
        }  
        System.out.println();
    }
    System.out.println();
    
    for( int i = 0; i < num; i++){
      for( int j = 1; j < (num - i); j++){
        System.out.print(" ");
      }
      for( int k = 0; k <= i; k++){
        System.out.print( k + 1);
      }
      System.out.println();
    }
  }
}
