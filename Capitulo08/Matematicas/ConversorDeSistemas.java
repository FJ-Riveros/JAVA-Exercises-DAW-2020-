  package Matematicas;
  import Matematicas.OperacionesEnteros;
  import  Matematicas.OperacionesEnteros.digitoN;
  import  Matematicas.OperacionesEnteros.digitos;
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
    int digits = OperacionesEnteros.digitos(x);
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
    long bits = 0;
    long restaCiclica = 0;
    long result = 0;
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
      if(filter - 'A' >= 0 && filter - 'A' <= 5){
        add = 10 + (filter - 'A');
      }else{
        add = filter - '0';
      }
      result += add * (Matematicas.OperacionesEnteros.potencia(16, exponente++));
    }
    return result;
  }
  
  /*
   * Convierte un número decimal a la codificación Morse.
   * @param n      Entero decimal que deseamos convertir a Morse
   * @return       String con el número convertido
  */
  public static String convierteEnMorse(int n){
    String result = "";
    int digitoActual = 0;
    for(int i=0; i<digitos(n); i++){
      for(int j=1; j<=5; j++){
        digitoActual = digitoN((long)n, i);
        if(digitoActual == 0){
          result += "_ ";
        }else{
          if(digitoActual <= 5 && j<= digitoActual){
            result += ". ";
          }else if(digitoActual <= 5){
            result += "_ ";
          }else if(digitoActual > 5 && (j+5)<= digitoActual){
            result += "_ ";
          }else{
            result += ". ";
          }
        }
      }
    }
    return result;
  }
}
