public class EjercicioSorpresa8{
  public static void main(String [] args){
    String concat = "";
    System.out.println("Introduzca el número que desea");
    int num = Integer.parseInt(System.console().readLine());
    for( int i = 1; i <= num; i++){
      concat += i + " ";
      System.out.println(concat);
    }
  }
}
