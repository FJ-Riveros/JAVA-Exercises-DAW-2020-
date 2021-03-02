package CuentaAux;
public class FuncionesAux{
  
  public static boolean ingreso(String titularInput, float ingreso, String[] titulares, float[] saldos){
    if(indexUsuario(titulares,titularInput)!= -1){
      saldos[indexUsuario(titulares,titularInput)] += ingreso;
      return true;
    }else{
      return false;
    }
  }
  
  public static boolean retirada(String titularInput, float retirada, String[] titulares, float[] saldos){
    int indexUser = indexUsuario(titulares,titularInput);
    if(indexUser!= -1 && checkRetirada(saldos[indexUser], retirada)){
      saldos[indexUser] -= retirada;
      return true;
    }else{
      return false;
    }
  }
  
  public static boolean traspaso(String titularInputOrigen, String titularInputDestino, float cantidadTransferencia, String[] titulares, float[] saldos){
    int indexUserOrigen = indexUsuario(titulares, titularInputOrigen);
    int indexUserDestino = indexUsuario(titulares, titularInputDestino); 
    if(indexUserOrigen != -1 && indexUserDestino != -1 && checkRetirada(saldos[indexUserOrigen],cantidadTransferencia)){
      saldos[indexUserOrigen] -= cantidadTransferencia;
      saldos[indexUserDestino] += cantidadTransferencia;
      return true;
    }else{
      return false;
    }
  }
  
  public static String informeTitular(String titularInput, String[] titulares, float[] saldos){
    int indexUser = indexUsuario(titulares, titularInput);
    if(indexUser!= -1){
      String result = String.format("%-20s%8.2f", titulares[indexUser], saldos[indexUser]);
      return result;
    }else{
      return "";
    }
  }
  
  public static String informeCuentas(String[] titulares, float[] saldos){
    String result = "";
    if(titulares.length>0){
      for(int i=0; i<titulares.length; i++){
        result += informeTitular(titulares[i], titulares, saldos) + "\n";
      }
    }
    return result;
  }
  
  public static boolean checkRetirada(float saldo, float cantidadRetirar){
    if(saldo>=cantidadRetirar){
      return true;
    }else{
      return false;
    }
  }
  
  public static int indexUsuario(String[] titulares, String input){
    for(int i=0; i<titulares.length; i++){
      if(titulares[i].equals(input)){
        return i;
      }
    }
    return -1;
  }  
}
