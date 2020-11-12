public class C06Ejercicio14 {
  public static void main (String [] args){
    System.out.println("Introduzca el número que el programa debe adivinar");
    int num = Integer.parseInt(System.console().readLine());
    int counter = 0;
    int randomNum = 0;
    int range = 0;
    String guide = "";
    do {
      if( guide.equals("")){
        randomNum = (int)(Math.random() * 101 );
      }
      else if( guide.equals("menor")){
        randomNum = (int)(Math.random() * (101 - range)) + range;
      }else if( guide.equals("mayor")){
        randomNum = (int)(Math.random() * (range ) + 1);
      }
      counter++;
      if( counter < 5 ){
        if( num != randomNum ){
          System.out.print("El programa supone que el número es " + randomNum);
          System.out.println("¿Es el número que dice el programa mayor o menor que el número a adivinar?: ");
          guide = System.console().readLine();
          if( guide.equals("menor")){
            range = randomNum + 1;
          }else if( guide.equals("mayor")){
            range = randomNum - 1;
          }
        }
      }
    }while( num != randomNum && counter < 5);
    if( num == randomNum ){
    System.out.println("El programa ha acertado, usted pierde");
    }else{
      System.out.println("El programa no ha acertado, usted gana.");
    }
  }
}
