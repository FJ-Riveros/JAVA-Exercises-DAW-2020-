package Matematicas;
public class OperacionesEnteros{
  
  /*
   * Nos dice si un int es primo o no.
   * @param x número entero
   * @return booleano true or false
  */
  public static boolean esPrimo(int x){
    for(int i=2; i<x; i++){
      if(x%i==0){
        return false;
      }
    }
    return true; 
  }

  /*
   * Nos dice el siguiente primo de un int.
   * @param x    número entero
   * @return     número entero
  */
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
  
  /*
   * Devuelve la potencia de una base y un exponente.
   * @param base        base de la operación
   * @param exponente   exponente de la operación
   * @return            número entero, resultado de la potencia
  */
  public static long potencia(int base, int exponente){
    int aux = base;
    long result = (long)base;
    if(exponente != 0){
      for(int i=1; i<exponente; i++){
        result = result * aux;
      } 
      return result;
    }else{
      return 1;
    }
  }
  
  /*
   * Devuelve la cantidad de dígitos de un número.
   * @param x           número del que se desean saber los dígitos
   * @return            número entero, cantidad de dígitos
  */
  public static int digitos(long x){
    int counter = 0;
    while(x >0){
      counter++;
      x /= 10;
    }
    return counter;
  }
  
  /*
   * Devuelve un long dado la vuelta.
   * @param x           long que se desea voltear
   * @return            long, el número dado la vuelta
  */
  public static long volteado(long x){
    long volteado = 0;
    while(x > 0){
      volteado = (volteado*10) + (x%10);
      x /= 10;
    }
    return volteado;
  }
  
  /*
   * Devuelve el dígito deseado dentro de un long.
   * @param x           long del que se desea copiar un dígito en concreto
   * @param pos         posición del dígito dentro del long, empezando desde la izquierda y desde 0
   * @return            número entero dígito seleccionado
  */
  public static int digitoN(long x, int pos){
    return (int)((volteado(x) / potencia(10, pos))%10);
  }
  
  /*
   * Nos dice con un boolean si el long introducido es Capicua.
   * @param x           long del que se desea saber si es Capicua
   * @return            boolean true si es Capicua, false si no.
  */
  public static boolean esCapicua(long x){
    if(volteado(x) == x){
      return true;
    }else{
      return false;
    }
  }
  
  /*
   * Devuelve la posición de un dígito deseado dentro de un long, si no se encuentra devuelve -1.
   * @param x               long del que se desea saber la posición de un digito en concreto
   * @param digitoDeseado   dígito a buscar dentro del long
   * @return                int, posición del dígito dentro del long si se encuentra, empezando desde la izquierda y desde 0, si no se encuentra devuelve -1
  */
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
  
  /*
   * Quita la cantidad de dígitos deseada de derecha a izquierda de un long.
   * @param x               long del que se desea eliminar digitos
   * @param digitosQuitar   cantidad de dígitos a eliminar
   * @return                long con los dígitos eliminados
  */
  public static long quitaPorDetras(long x, int digitosQuitar){
    return x/(potencia(10, digitosQuitar));
  }
  
  /*
   * Quita la cantidad de dígitos deseada de izquierda a derecha de un long.
   * @param x               long del que se desea eliminar digitos
   * @param digitosQuitar   cantidad de dígitos a eliminar
   * @return                long con los dígitos eliminados
  */
  public static long quitaPorDelante(long x, int digitosQuitar){    
    return x%(potencia(10, (digitos(x)-digitosQuitar)));
  }
  
  /*
   * Añade un dígito al final de un long.
   * @param x               long del que se desea añadir el digito
   * @param digitoAdd       digito a añadir
   * @return                long con el dígito añadido
  */
  public static long pegaPorDetras(long x, int digitoAdd){
    return (x*10) + digitoAdd;
  }
  
  /*
   * Añade un dígito al principio de un long.
   * @param x               long del que se desea añadir el digito
   * @param digitoAdd       digito a añadir
   * @return                long con el dígito añadido
  */
  public static long pegaPorDelante(long x, int digitoAdd){
    return (digitoAdd * potencia(10, digitos(x))) + x;
  }
  
  /*
   * Seleccionamos solo un trozo de un long, según las posiciones introducidas por del usuario.
   * @param x               long del que se desea seleccionar el trozo
   * @param posEmpieza      posición inicial del trozo
   * @param posTermina      posición final del trozo
   * @return                long con el trozo deseado
  */
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
  
  /*
   * Juntamos dos long introducidos por el usuario.
   * @param x               primer long a juntar, este trozo será el comienzo del nuevo número
   * @param y               segundo long a juntar, este trozo será el final del nuevo número
   * @return                nuevo long con los dos números juntados
  */
  public static long juntaNumeros(long x, long y){
    return (x * potencia(10,digitos(y))) + y;
  }
  
  /*
   * Esta función devuelve el número de veces que aparece un dígito dentro de 
   * un número.
   * 
   * @param digito            Dígito a comprobar
   * @param n                 Número donde comprobar cuantas veces está el dígito
   * @return                  Número de veces que aparece digito en n.
  */
  public static int ocurrencias(int digito, int n){
    int counter = 0;
    for(int i=0; i<digitos(n); i++){
      if(digitoN((long)n, i) == digito) counter++;
    }
    return counter;
  }
  
  //////////////////////////////////////////////////////////////////////////////
  /*                                 Conversor de Sistemas                    */
  ////////////////////////////////////////////////////////////////////////////// 
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
   * @return                long en traducido a octal
  */
  public static long conversorDecimalOctalRapido(long x){
    if(x == 0){
      return 0;
    }
    long result = 7;
    while(x > 7){
      result = Matematicas.OperacionesEnteros.pegaPorDetras(result, (int)x%7);
      x /= 7;
    }
    result = Matematicas.OperacionesEnteros.pegaPorDetras(result, 7);
    result = Matematicas.OperacionesEnteros.volteado(result);
    result = Matematicas.OperacionesEnteros.quitaPorDetras(result, 7);
    return result;
  }
   
}



