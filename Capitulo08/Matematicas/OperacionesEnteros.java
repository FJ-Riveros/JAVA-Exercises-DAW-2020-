package Matematicas;
public class OperacionesEnteros{
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

