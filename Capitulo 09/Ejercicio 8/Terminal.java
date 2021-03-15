public class Terminal{
  private int tiempo_conversacion = 0;
  private String numero_telf;
  
  public Terminal(String num){
    this.numero_telf = num;
  }
  
  public void llama(Terminal destinatario, int duracion){
    this.tiempo_conversacion += duracion;
    destinatario.tiempo_conversacion += duracion;
  }
  
  public String toString(){
    return "Nº " + this.numero_telf + " - " + this.tiempo_conversacion + "s de conversación";
  }
}
