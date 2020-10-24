public class EjercicioRepasoBucles5 {
  public static void main (String [] args){
    System.out.println("Introduzca el número de filas que desea");
    int num = Integer.parseInt(System.console().readLine());
    for( int i = 1; i <= num; i++){
      for( int j = 0; j < num; j++){
        System.out.print(" ");
      }
      System.out.println(i);
    
    }
  
  }
}
