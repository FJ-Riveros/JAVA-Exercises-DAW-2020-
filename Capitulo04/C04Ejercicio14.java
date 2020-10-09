public class C04Ejercicio14{
  public static void main (String [] args){
    int a;
    String par = "";
    String divisible = "";
    System.out.println("Este programa indica si un número es  par y/o divisible por 5");
    a = Integer.parseInt(System.console().readLine());
    if( a / 2 == 0 ){
    par = "es par";
    }else{
    par = "es impar";
    }
    if( a % 5 == 0 ){
    divisible = "es divisible por 5";
    }else{
    divisible = "no es divisible por 5";
    }
    System.out.println("El número " + a  + " " + par + " y " + divisible);
  }
}
