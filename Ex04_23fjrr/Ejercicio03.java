/**
 * @Author: FJ-Riveros
 */

public class Ejercicio03{
  public static void main(String[] args){
    System.out.print("Introduzca un número: ");
    long input = Long.parseLong(System.console().readLine());
    int cifras = devuelveCifras(input);
    if(cifras % 2 != 0){
      System.out.print("Lo siento. El número introducido tiene longitud impar, no se puede partir en trocitos");
    }else{
      System.out.println("Los trocitos del número son los siguientes: ");
      long aux = input;
      for(int i = 0; i<cifras/2; i++){
        System.out.println(devuelveDosPrimerosDigitos(aux));
        aux = devuelveNumSinPrimerosDigitos(aux);
      }
    }
  }
  
  public static int devuelveCifras(long num){
    int count = 0;
    while(num>0){
      count++;
      num /= 10;
    }
    return count;
  }
  
  public static long devuelveDosPrimerosDigitos(long num){
    int cifras = devuelveCifras(num);
    if(cifras == 2){
      return num;
    }else{
      long result = num/potencia(10,cifras-2);
      return result;
    }
  }
  
  public static long devuelveNumSinPrimerosDigitos(long num){
    int cifras = devuelveCifras(num);
    long result = num % potencia(10, (cifras - 2));
    return result;
  }
  
  
  public static long potencia(long base, int exponente){
    long aux = base;
    long result = base;
    if(exponente != 0){
      for(int i=1; i<exponente; i++){
        result = result * aux;
      } 
      return result;
    }else{
      return 1;
    }
  }
}
