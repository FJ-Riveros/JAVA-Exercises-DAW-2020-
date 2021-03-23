public class Linea{
  private Punto puntoA;
  private Punto puntoB;
  
  public Linea(Punto a, Punto b){
    this.puntoA = a;
    this.puntoB = b;
  }
  
  public String toString(){
    return "Línea formada por los puntos " + puntoA + puntoB;
  }
}
