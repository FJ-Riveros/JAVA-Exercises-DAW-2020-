public class Movil extends Terminal{
  private int costePorMinuto;
  private double totalTarificado;
  
  public Movil(String num, String tar){
    super(num);
    if(tar.equals("rata")){
      this.costePorMinuto = 6;
    }else if(tar.equals("mono")){
      this.costePorMinuto = 12;
    }else{
      this.costePorMinuto = 3;
    }
    this.totalTarificado = 0;
  }
  
  public void llama(Terminal destinatario, int duracion){
    super.llama(destinatario, duracion);
    float costeEnEstaLlamada = duracion / (float)60;
    this.totalTarificado += (costePorMinuto / (float)100) * costeEnEstaLlamada;
  }
  
  public String toString(){
    String resultado = super.toString();
    resultado = resultado + " - tarificados "+ String.format("%.2f", this.totalTarificado) + " euros.";
    return resultado;
  }
}
