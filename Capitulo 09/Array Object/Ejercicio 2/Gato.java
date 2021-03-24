public class Gato{
  private String nombre;
  private String color;
  private String raza;
  private int codGato;
  private static int numGatos = 0;
  
  public Gato(String nombreGato, String colorGato, String razaGato){
    this.nombre = nombreGato;
    this.color = colorGato;
    this.raza = razaGato;
    numGatos++;
    this.codGato = numGatos;
  }
  
  public String toString(){
    return "\nGato nº " + this.codGato + " con nombre " + this.nombre + "de raza " + this.raza + " de color " + this.color; 
  }
}
