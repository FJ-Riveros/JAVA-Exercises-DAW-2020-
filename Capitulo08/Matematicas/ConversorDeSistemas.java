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
   * @return                long en traducido a octal
  */
  public static long conversorDecimalOctalRapido(long x){
    //Terminar
  }
}
