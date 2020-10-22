public class EjercicioSorpresa10 {
  public static void main (String [] args){
    
    System.out.println("Introduzca la altura deseada");
    int num = Integer.parseInt(System.console().readLine());
    for( int i = 1; i <= (num * 2); i++){
      for( int j = num + 4; j >= 0; j--){
        System.out.print(" ");
      }
      for( int x = 1; x <= i; x++){
        if( i % 2 != 0){
          System.out.print(i);
        }
      } 
     System.out.println(); 
    } 
  }
} 
