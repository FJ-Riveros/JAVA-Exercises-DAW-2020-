public class PruebaGato{
  public static void main(String [] args){
    Gato[] gatos = new Gato[4];
    String nomGato = "";
    String razaGato = "";
    String colorGato = "";
    
    for(int i=0; i<gatos.length; i++){
      System.out.println("Introduzca el nombre del Gato: ");
      nomGato = System.console().readLine();
      System.out.println("Introduzca la raza del Gato: ");
      razaGato = System.console().readLine();
      System.out.println("Introduzca el color del Gato: ");
      colorGato = System.console().readLine();
      gatos[i] = new Gato(nomGato, razaGato, colorGato);
    }
    for(int i=0; i<gatos.length; i++){
      System.out.println(gatos[i].toString());
    }
  }
}
