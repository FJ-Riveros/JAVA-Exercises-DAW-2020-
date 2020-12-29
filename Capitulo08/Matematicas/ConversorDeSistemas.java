  package Matematicas;
  import Matematicas.OperacionesEnteros;
  //////////////////////////////////////////////////////////////////////////////
  /*                                 Conversor de Sistemas                    */
  //////////////////////////////////////////////////////////////////////////////
  public class ConversorDeSistemas{ 
  /*
   * Traducimos un número binario en decimal.
   * @param x               número en binario a convertir
   * @return                long en traducido a decimal
  */
  public static long conversorBinarioDecimal(long x){
    int digits = Matematicas.OperacionesEnteros.digitos(x);
    int multiplicador = 1;
    int result = 0;
    for(int i = 0; i < digits; i++){
      if(x%10 == 1){
        result += multiplicador;
      }
      multiplicador *= 2;
      x /= 10;
    }
    return result;
  }
  
  /*
   * Traducimos un número decimal en binario(forma lenta).
   * @param x               número en decimal a convertir a binario
   * @return                long en traducido a binario
  */
  public static long conversorDecimalBinarioLento(long x){
    int counter = 0;
    int bits = 0;
    int restaCiclica = 0;
    int result = 0;
    while(bits < x){
      bits = Matematicas.OperacionesEnteros.potencia(2, counter);
      if(bits < x){
        counter++;
      }
    }
    for(int i=counter; i>=0; i--){
      restaCiclica = Matematicas.OperacionesEnteros.potencia(2, i);
      if(x - restaCiclica >=0){
      x -= restaCiclica;
      result = (result * 10) + 1;
      }else{
        result *= 10;
      }
    }
    return result;
  }
  
  /*
   * Traducimos un número decimal en binario(forma rápida).
   * @param x               número en decimal a convertir a binario
   * @return                long en traducido a binario
  */
  public static long conversorDecimalBinarioRapido(long x){
    if(x == 0){
      return 0;
    }
    long result = 1;
    while(x > 1){
      result = Matematicas.OperacionesEnteros.pegaPorDetras(result, (int)x%2);
      x /= 2;
    }
    result = Matematicas.OperacionesEnteros.pegaPorDetras(result, 1);
    result = Matematicas.OperacionesEnteros.volteado(result);
    result = Matematicas.OperacionesEnteros.quitaPorDetras(result, 1);
    return result;
  }
  
  /*
   * Traducimos un número decimal en octal(forma rápida).
   * @param x               número en decimal a convertir a octal
   * @return                long traducido a octal
  */
  public static long conversorDecimalOctal(long x){
    long result = 1;
    while(x >= 1){
      result = Matematicas.OperacionesEnteros.pegaPorDetras(result,(int)x%8);
      x/= 8;
    }
    result = Matematicas.OperacionesEnteros.volteado(result);
    result = Matematicas.OperacionesEnteros.quitaPorDetras(result, 1);
    return result;
  }
  
  /*
   * Traducimos un número decimal en Hexadecimal.
   * @param x               número en decimal a convertir a Hexadecimal
   * @return                String, número convertido a Hexadecimal
  */
  public static String conversorDecimalHexadecimal(long x){
    String add = "";
    String result = "";
    if(x == 0){
      return "0";
    }
    while(x >= 1){
      add = "";
      switch((int)x%16){
        case 10:
          add = "A";  
        break;
        
        case 11:
          add = "B";  
        break;
        
        case 12:
          add = "C";  
        break;
        
        case 13:
          add = "D";  
        break;
        
        case 14:
          add = "E";  
        break;
        
        case 15:
          add = "F";  
        break;
        default:
          add = "" + x%16;
      }
      result = add + result;
      x/= 16;
    }
    return result;
  }
  
  /*
   * Traducimos un número octal a decimal.
   * @param x               número en octal a convertir a decimal
   * @return                long, número octal convertido a decimal
  */
  public static long conversorOctalDecimal(long x){
    int digits = Matematicas.OperacionesEnteros.digitos(x);
    int exponente = 0;
    int result = 0;
    for(int i = 0; i < digits; i++){
      result += (x%10) * Matematicas.OperacionesEnteros.potencia(8, exponente++);
      x /= 10;
    }
    return result;
  }
  
  /*
   * Traducimos un número hexadecimal a decimal.
   * @param x               String en hexadecimal a convertir a decimal
   * @return                long, String hexadecimal convertido a decimal
  */
  public static long conversorHexadecimalDecimal(String x){
    int digits = x.length();
    int result = 0;
    char filter = 0;
    int add = 0;
    int exponente = 0;
    for(int i=digits-1; i >= 0; i--){
      filter = x.charAt(i);
      switch(filter){
        case 'A':
          add = 10;
        break;
        
        case 'B':
          add = 11;
        break;
        
        case 'C':
          add = 12;
        break;
        
        case 'D':
          add = 13;
        break;
        
        case 'E':
          add = 14;
        break;
        
        case 'F':
          add = 15;
        break;
        default: 
          add = filter - '0';
      }
      result += add * (Matematicas.OperacionesEnteros.potencia(16, exponente++));
    }
    return result;
  }
}
