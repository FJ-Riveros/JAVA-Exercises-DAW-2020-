public class EjercicioSorpresa10 {
  public static void main (String [] args){
    System.out.println("Introduzca la altura deseada");
    int num = Integer.parseInt(System.console().readLine());
    int aux = num - 1;
    for( int i = 1; i <= num; i++){
      for( int j = num; j > 0; j--){
        System.out.print(" ");
      }
      for( int x = 1; x <= i; x++){
        
          System.out.print(i);
        
      } 
     System.out.println(); 
    } 
  }
} 
