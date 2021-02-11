package FuncionesAuxCuenta;
public class FuncionesCuenta{
  
  public static boolean ingreso(String titular, double cantidad, String[] arrTitulares,
  double[] arrSaldos){
    int indexTitular = buscaIndexTitular(titular, arrTitulares);
    if(compruebaIndexTitular(indexTitular)){
      arrSaldos[indexTitular] = arrSaldos[indexTitular] + cantidad;
      return true;
    }else{
      return false;
    }
  }
  
  public static boolean retirada(String titular, double cantidad, String[] arrTitulares,
  double[] arrSaldos){
    int indexTitular = buscaIndexTitular(titular, arrTitulares);
    if(compruebaIndexTitular(indexTitular) && saldoSuficiente(indexTitular, arrSaldos, 
      cantidad)){
      arrSaldos[indexTitular] = arrSaldos[indexTitular] - cantidad;
      return true;
    }else{
      return false;
    }
  }
  
  public static boolean traspaso(String titularOrigen, String titularDestino,
                double cantidad, String[] arrTitulares, double[] arrSaldos){
    int indexOrigen = buscaIndexTitular(titularOrigen, arrTitulares);
    int indexDestino = buscaIndexTitular(titularDestino, arrTitulares);
    if(compruebaIndexTitular(indexOrigen) && compruebaIndexTitular(indexDestino)
    && saldoSuficiente(indexOrigen, arrSaldos, cantidad)){
      retirada(titularOrigen, cantidad, arrTitulares, arrSaldos);
      ingreso(titularDestino, cantidad, arrTitulares, arrSaldos);
      return true;
    }else{
      return false;
    }
  }
  
  public static String informeTitular(String titular, String[] arrTitulares,
   double[] arrSaldos){
    String result = "";
    int indexTitular = buscaIndexTitular(titular, arrTitulares);
    if(compruebaIndexTitular(indexTitular)){
      //result = String.format("%-20d %8f.2",titular,arrSaldos[indexTitular]);
      result = titular + "                     " + arrSaldos[indexTitular];
    }
    return result;
  }
  
  public static int buscaIndexTitular(String titular, String[] arrTitulares){
    for(int i=0; i<arrTitulares.length; i++){
      if(arrTitulares[i] == titular){
        return i;
      }
    }
    return -1;
  }
  //Comprueba si el usuario introducido está en la base de datos
  public static boolean compruebaIndexTitular(int input){
    if(input == -1){
      return false;
    }else{
      return true;
    }
  }
  //Comprueba si hay saldo suficiente para realizar una operación
  public static boolean saldoSuficiente(int indexTitular, double[] arrSaldos, 
  double cantidadNecesaria){
    if(arrSaldos[indexTitular]>= cantidadNecesaria){
      return true;
    }else{
      return false;
    }
  }
}
