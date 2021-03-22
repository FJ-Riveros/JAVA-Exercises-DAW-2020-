public class Ameba{
  private int peso;
  
  public Ameba(){
    this.peso = 3;
  }
  
  public void come(int cantidad){
    this.peso += cantidad - 1;
  }
  
  public void come(Ameba objetivo){
    this.peso += objetivo.peso - 1;
    objetivo.peso = 0;
  }
  public String toString(){
    return "Soy una ameba y peso " + this.peso + " microgramos.";
  }
}
