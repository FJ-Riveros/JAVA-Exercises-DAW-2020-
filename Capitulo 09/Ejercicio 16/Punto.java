public class Punto{
  private double coordX;
  private double coordY;
  
  public Punto(double X, double Y){
    this.coordX = X;
    this.coordY = Y;
  }
  
  public String toString(){
    return "(" + coordX + "," + coordY + ")";
  }
}
