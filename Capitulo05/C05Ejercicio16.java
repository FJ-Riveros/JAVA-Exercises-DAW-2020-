public class C05Ejercicio16{
  public static void main( String [] args){
    String prim = " es primo";
    System.out.println("Introduzca el número que quiera saber si es primo o no");
    int num = Integer.parseInt(System.console().readLine());
    if( num == 1 ){
        prim = " no es primo";
      }else{
        for( int i = 2; i < num; i++){
          if( num % i == 0 ){
            prim = " no es primo";
          }
        }
      }
    System.out.println("El número " + num + prim);
  }
}
