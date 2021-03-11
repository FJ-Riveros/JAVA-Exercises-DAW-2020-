public class Movil extends Terminal{
  private float importe = 0;
  private String tarifa;
  
  public Movil(String num, String tar){
    super(num);
    this.tarifa = tar;
  }
  
  public void llama(Terminal destinatario, int duracion){
    super.llama(destinatario, duracion);
    if(this.tarifa.equals("rata")){
      this.importe += ((int)(duracion/60)) * 0.6;
    }else if(this.tarifa.equals("mono")){
      this.importe += ((int)(duracion/60)) * 0.12;
    }else{
      this.importe += ((int)(duracion/60)) * 0.3;
    }
  }
  
  public String toString(){
    String resultado = super.toString();
    resultado = resultado + " - tarificados "+ this.importe + " euros.";
    return resultado;
  }
}
