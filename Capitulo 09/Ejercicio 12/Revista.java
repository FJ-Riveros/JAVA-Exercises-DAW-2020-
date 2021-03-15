public class Revista extends Publicacion{
  private int numeroRevista;
  
  public Revista(String ISBN, String titulo, int anio, int num){
    super(ISBN, titulo, anio);
    this.numeroRevista = num;
  }
}
