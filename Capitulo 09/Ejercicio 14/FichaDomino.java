public class FichaDomino{
  private String izquierda;
  private String derecha;
  
  public FichaDomino(int ladoIzq, int ladoDer){
    this.izquierda = ladoIzq == 0?" ": "" + ladoIzq;
    this.derecha = ladoDer == 0?" ": "" + ladoDer;
  }
  
  public String voltea(){
    String temp = this.izquierda;
    this.izquierda = this.derecha;
    this.derecha = temp;
    return toString();
  }
  
  public String toString(){
    return "[" + this.izquierda + "|" + this.derecha + "]";
  }
  
  public boolean encaja(FichaDomino objetivo){
    if(this.derecha.equals(objetivo.izquierda) || this.derecha.equals(" ") || objetivo.izquierda.equals(" ")) return true;
    return false;
  }

}
