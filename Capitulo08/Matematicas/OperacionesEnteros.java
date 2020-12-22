package Matematicas;
public class OperacionesEnteros{
  public static void main(String [] args){
    System.out.print("Introduzca un número :" );
    int input = Integer.parseInt(System.console().readLine());
    System.out.println("El siguiente primo es el " + siguientePrimo(input));
  }
  public static boolean esPrimo(int x){
    for(int i=2; i<x; i++){
      if(x%i==0){
        return false;
      }
    }
    return true; 
  }


  public static int siguientePrimo(int x){
    boolean check = false;
    do{
      x++;
      if(esPrimo(x)){
        check=true;
      }
    }while(!check);
    return x;
  }
}

