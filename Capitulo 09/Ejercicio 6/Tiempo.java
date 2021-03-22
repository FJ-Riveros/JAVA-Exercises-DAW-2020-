public class Tiempo{
  private int horas;
  private int minutos;
  private int segundos;
  
  public Tiempo(int horas, int minutos, int segundos){
    this.horas = horas;
    this.minutos = minutos;
    this.segundos = segundos;
  }
  
  public String toString(){
    return this.horas + "h " + this.minutos + "m " + this.segundos + "s.";
  }
  
  public void suma(Tiempo secundario){
    if(this.segundos + secundario.segundos > 59){
      this.segundos = (this.segundos + secundario.segundos)% 60;
      this.minutos++;
    }else{
      this.segundos = this.segundos + secundario.segundos;
    }
    if(this.minutos + secundario.minutos > 59){
      this.minutos = (this.minutos + secundario.minutos)% 60;
      this.horas++;
    }else{
      this.minutos = this.minutos + secundario.minutos;
    }
    
    if(this.horas + secundario.horas > 23){
      this.horas = (this.horas + secundario.horas)% 24;
    }else{
      this.horas = this.horas + secundario.horas;
    }
  }
  
  public void resta(Tiempo secundario){
    this.horas = Math.abs(this.horas - secundario.horas);
    this.minutos = Math.abs(this.minutos - secundario.minutos);
    this.segundos = Math.abs(this.segundos - secundario.segundos);
  }
}
