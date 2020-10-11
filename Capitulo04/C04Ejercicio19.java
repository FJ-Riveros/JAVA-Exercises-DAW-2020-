public class C04Ejercicio19{
  public static void main( String [] args){
    int num; 
    int cifra = 0;
    System.out.println("Este programa dice cuál es la última cifra de un número entero de máximo 5 cifras");
    do{
      System.out.println("Introduce el número entero deseado, no puede ser de más de 5 cifras");
      num = Math.abs(Integer.parseInt(System.console().readLine()));
    }while(num > 100000);
    if( num < 10 ){
      cifra = 1;
    }else if( num >= 10 && num < 100){
      cifra = 2;
    }else if( num >= 100 && num < 1000){
      cifra = 3;
    }else if( num >= 1000 && num < 10000){
      cifra = 4;
    }else if( num >= 10000 && num < 100000){
      cifra = 5;
    }
    System.out.println("El número introducido tiene " + cifra + " cifras");
  }
}
