public class C05Ejercicio17 {
  public static void main( String [] args){
    System.out.println("Introduzca el número que desee");
    int num = Integer.parseInt(System.console().readLine());
    int acc = 0;
    if( num >= 0 ){
      for( int i = num; i <= (num + 100); i++){
        acc += i;
        System.out.println(i);
      }
    }else{
      System.out.println("El número introducido ha de ser positivo");
    }
  }
}
