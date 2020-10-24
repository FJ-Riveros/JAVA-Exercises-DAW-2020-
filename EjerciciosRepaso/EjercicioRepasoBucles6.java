public class EjercicioRepasoBucles6 {
  public static void main (String [] args){
    System.out.println("Introduzca el número de filas que desea");
    int num = Integer.parseInt(System.console().readLine());
    for( int i = 1; i <= num; i++){
      for( int j= 1; j <= i; j++){
        System.out.print(i);
      }
      System.out.println();
    }
    
    System.out.println();
    
    for( int i = 1; i <= num; i++){
      for( int j= 1; j <= i; j++){
        System.out.print(num - (i - 1));
      }
      System.out.println();
    }
    System.out.println();
    
    for( int i = 1; i <= num; i++){
      for( int j= 1; j <= i; j++){
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
