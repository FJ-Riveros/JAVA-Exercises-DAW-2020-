public class EjercicioSorpresa9{
  public static void main(String [] args){
    String concat = "";
    System.out.println("Introduzca el número de filas que desee");
    int num = Integer.parseInt(System.console().readLine());
    for( int i = 1; i <= (num * 2); i++){
      concat += i + " ";
      System.out.println(concat);
      i++;
      concat += i + " ";
    }
  }
}
