public class EjercicioSorpresa6 {
  public static void main (String [] args){
    boolean par = false;
    System.out.println("Introduzca el número");
    int num = Integer.parseInt(System.console().readLine());
    if( num % 2 == 0 ){
      par = true;
    }
    for( int i = 1; i <= 10; i++){
      if(par == true){
        System.out.printf(" %3d %s %2d %s %-3d \n", num, "*", i,"=",(num * i));
      }else{
        System.out.printf(" %3d %s %2d %s %-3d \n", num, "+",i, "=",(num + i));
      }
    }
  }
}
