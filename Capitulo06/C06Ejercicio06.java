public class C06Ejercicio06 {
  public static void main (String [] args){
    int num = (int)(Math.random() * 101);
    int counter = 0;
    int answer = 0;
    do {
    System.out.print("Intente adivinar el número: ");
    answer = Integer.parseInt(System.console().readLine());
    counter++;
    if( answer != num  && counter < 5){
      System.out.print("Le quedan " + (5 - counter) + " intentos. ");
      if( answer > num ){
        System.out.println("El número introducido es mayor que el secreto.");
      }else{
        System.out.println("El número introducido es menor que el secreto.");
      }
    }if(answer == num){
      System.out.println("Enhorabuena ha acertado");
    }
    }while( answer != num && counter < 5 );
  }
}
