public class Incidencia{
  private static int codIncidencia;
  private static int contadorPendientes;
  private int codPuesto;
  private String estado;
  private int codPropio;
  private String mensajeIncidencia;
  private String mensajeSolucion;
  
  
  public Incidencia(int codigoPuesto, String mensaje){
    this.codPuesto = codigoPuesto;
    this.estado = "Pendiente";
    this.mensajeIncidencia = mensaje;
    this.codPropio = codIncidencia + 1;
    codIncidencia++;
    contadorPendientes++;
    this.mensajeSolucion = "";
  }
  
  public void resuelve(String mensaje){
    this.estado = "Resuelto";
    this.mensajeSolucion = mensaje;
    contadorPendientes--;
  }
  
  public static int getPendientes(){
    return contadorPendientes;
  }
  public String toString(){
    return "Incidencia " + codPropio + " - Puesto: " + this.codPuesto + " - " +
    this.mensajeIncidencia + " - " + this.estado + (this.mensajeSolucion.equals(
    "")? "" : " - " + this.mensajeSolucion);
  }
}
