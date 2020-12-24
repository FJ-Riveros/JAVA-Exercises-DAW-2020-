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
  
  public static int potencia(int base, int exponente){
    if(exponente != 0){
      for(int i=1; i<=exponente; i++){
        if(i!=1){
          base *= base;
        }
      } 
      return base;
    }else{
      return 1;
    }
  }
  
  public static int digitos(long x){
    int counter = 0;
    while(x >0){
      counter++;
      x /= 10;
    }
    return counter;
  }
  
  public static long volteado(long x){
    long volteado = 0;
    while(x > 0){
      volteado = (volteado*10) + (x%10);
      x /= 10;
    }
    return volteado;
  }
  
  public static int digitoN(long x, int pos){
    int digit = 0;
    x = volteado(x);
    for(int i=0; i<=pos; i++){
      if(i == pos-1 || i == pos){
        digit = (int)x%10;
      }
      x /= 10;
    }
    return digit;
  }
}

