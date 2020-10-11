public class C04Ejercicio20{
  public static void main( String [] args){
    int num; 
    boolean capicua = false;
    System.out.println("Este programa dice cuál es la última cifra de un número entero de máximo 5 cifras");
    do{
      System.out.println("Introduce el número entero deseado, no puede ser de más de 5 cifras");
      num = Integer.parseInt(System.console().readLine());
    }while(num > 100000);
    if( num < 10 ){
      capicua = true;
    }else if( num >= 10 && num < 100){
      if((num / 10) == (num % 10)){
        capicua = true;
      }
    }else if( num >= 100 && num < 1000){
      if((num / 100) == (num % 10)){
      capicua = true;
      }
    }else if( num >= 1000 && num < 10000){
      if((num / 1000) == (num % 10)){
        capicua = true;
      }
    }else if( num >= 10000 && num < 100000){
      if((num / 10000) == (num % 10)){
        capicua = true;
      }
    }
    if(capicua){
      System.out.println("El número es capicua");
    }else{
       System.out.println("El número no es capicua");
    }
  }
}
