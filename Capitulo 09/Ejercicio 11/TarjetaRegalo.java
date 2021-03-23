public class TarjetaRegalo{
  private float saldo;
  private int numId;
  private static int[] registrosId = new int[0];
  
  public TarjetaRegalo(float SaldoInicial){
    this.saldo = SaldoInicial;
    this.numId = creaId();
    this.registrosId = addNuevaId(this.registrosId,this.numId);
  }
  
  
  public String toString(){
    return "Tarjeta nº " + this.numId + " - Saldo " + this.saldo + "$";
  }
  
  public String gasta(float cantidad){
    if(this.saldo - cantidad < 0){
      return "No tiene suficiente saldo para gastar " + cantidad + "$";
    }else{
      this.saldo -= cantidad;
    }
    return "";
  }
  
  
  public TarjetaRegalo fusiona(TarjetaRegalo segunda){
    return new TarjetaRegalo(this.saldo + segunda.saldo);
  }
  
  private int creaId(){
    int result = 0;
    boolean check = false;
    do{
      for(int i=0; i<5; i++){
        if(i==0){
          result = (int)(Math.random()*9) + 1;
        }else{
          result = (result*10)+(int)(Math.random()*10);
        }
      }
      if(!compruebaExistenciaId(result)) check = true;
    }while(!check);
    return result;
  }
  
  private boolean compruebaExistenciaId(int idGenerado){
    boolean check = false;
    for(int item : this.registrosId){
      if(item == idGenerado) return true;
    }
    return false;
  }
  
  private int[] addNuevaId(int[] registros, int idNueva){
    int[] result = new int[registros.length+1];
    for(int i=0; i<registros.length; i++){
      result[i] = registros[i];
    }
    result[result.length-1] = idNueva;
    return result;
  }
}
