public class C04Ejercicio18{
  public static void main( String [] args){
    int num; 
    int first = 0;
    System.out.println("Este programa dice cuál es la última cifra de un número entero de máximo 5 cifras");
    do{
      System.out.println("Introduce el número entero deseado, no puede ser de más de 5 cifras");
      num = Integer.parseInt(System.console().readLine());
    }while(num > 100000);
    if( num < 10 ){
      first = num;
    }else if( num >= 10 && num < 100){
      first = num / 10;
    }else if( num >= 100 && num < 1000){
      first = num / 100;
    }else if( num >= 1000 && num < 10000){
      first = num / 1000;
    }else if( num >= 10000 && num < 100000){
      first = num / 10000;
    }
    System.out.println("La primera cifra del número introducido es: " + first);
  }
}
