public abstract class  Publicacion{
  private String ISBN;
  private String titulo;
  private int anioPublicacion;
  public Publicacion(String ISBN, String titulo, int anio ){
    this.ISBN = ISBN;
    this.titulo = titulo;
    this.anioPublicacion = anio;
  }
  
  public String toString(){
    String resultado = ""; 
    resultado = "ISBN: " + this.ISBN + ", título: " + this.titulo + ", año de publicación: " + this.anioPublicacion;
    return resultado;
  }
}
