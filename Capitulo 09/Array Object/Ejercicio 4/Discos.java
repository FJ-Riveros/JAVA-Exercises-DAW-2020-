public class Discos{
  private String codigo = "libre";
  private String autor = "";
  private String titulo = "";
  private String genero = "";
  private int duracion = 0;
  private static int numDiscos = 0;
  private int numDisco;
  
  public Discos(){
    numDiscos++;
    this.numDisco = numDiscos;
  }
  public String getCodigo(){
    return this.codigo;
  }
  public void setCodigo(String cod){
    this.codigo = cod;
  }
  
  public void setAutor(String autor){
    this.autor = autor;
  }
  
  public String getAutor(){
    return this.autor;
  }
  
  public void setTitulo(String titulo){
    this.titulo = titulo;
  }
  
  public void setGenero(String genero){
    this.genero = genero;
  }
  
  public String getGenero(){
    return this.genero;
  }
  
  public void setDuracion(int duracion){
    this.duracion = duracion;
  }
  
  public int getDuracion(){
    return this.duracion;
  }
  
  public String toString(){
    String result = "";
    result = "\n         DISCO " + this.numDisco;
    result+= "\n=========================";
    result+= "\nCodigo: " + this.codigo;
    result+= "\nTitulo: " + this.titulo;
    result+= "\nAutor: " + this.autor;
    result+= "\nGénero: " + this.genero;
    result+= "\nDuración: " + this.duracion;
    result+= "\n=========================";
    return result;
  }
}
