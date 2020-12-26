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
    int aux = base;
    if(exponente != 0){
      for(int i=1; i<exponente; i++){
        base = base * aux;
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
    return (int)((volteado(x) / potencia(10, pos))%10);
  }
  
  public static boolean esCapicua(long x){
    if(volteado(x) == x){
      return true;
    }else{
      return false;
    }
  }
  
  public static int posicionDeDigito(long x, int digitoDeseado){
    x = volteado(x);
    int dig = digitos(x);
    for(int i=0; i<dig; i++){
      if(digitoDeseado == x%10){
        return i;
      }
      x /= 10;
    }
    return -1;
  }
  
  public static long quitaPorDetras(long x, int digitosQuitar){
    return x/(potencia(10, digitosQuitar));
  }
  
  public static long quitaPorDelante(long x, int digitosQuitar){    
    return x%(potencia(10, (digitos(x)-digitosQuitar)));
  }
  
  public static long pegaPorDetras(long x, int digitoAdd){
    return (x*10) + digitoAdd;
  }
  
  public static long pegaPorDelante(long x, int digitoAdd){
    return (digitoAdd * potencia(10, digitos(x))) + x;
  }
  
  public static long trozoDeNumero(long x, int posEmpieza, int posTermina){
    int digitosTotales = digitos(x);
    long result = 0;
    x = volteado(x);
    for(int i=0; i < digitosTotales; i++){
      if( i >= posEmpieza && i<= posTermina ){
        result = (result * 10) + (x%10); 
      } 
      x/=10;
    }
    return result;
  }
  
  public static long juntaNumeros(long x, long y){
    return (x * potencia(10,digitos(y))) + y;
  }
}

