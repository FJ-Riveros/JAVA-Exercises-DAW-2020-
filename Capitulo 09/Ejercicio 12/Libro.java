public class Libro extends Publicacion implements Prestable{
  private boolean prestado;
  
  public Libro(String ISBN, String titulo, int anio ){
    super(ISBN, titulo, anio);
    this.prestado = false;
  }
  
  public String toString(){
    String result = super.toString();
    result += this.prestado ? " (prestado)": " (no prestado)";
    return result;
  }
  
  public void presta(){
    this.prestado = true;
  }
  
  public void devuelve(){
    this.prestado = false;
  }
  public boolean estaPrestado(){
    return this.prestado;
  }
}
