public class Pizza{
  private static int pedidas;
  private static int servidas;
  private String estado;
  private String tipo;
  private String tamanio;
  public Pizza(String tipoPizza, String tamanioPizza){
    this.estado = "pedida";
    this.tipo = tipoPizza;
    this.tamanio = tamanioPizza;
    this.pedidas++;
  }
  
  public void sirve(){
    if(this.estado.equals("pedida")){
      this.estado = "servida";
      this.servidas++;
    }else{
      System.out.println("esa pizza ya se ha servido");
    }
  }
  
  public String toString(){
    return this.tipo + " " + this.tamanio + " , " + this.estado + "\n";
  }
  
  public String getTotalPedidas(){
    return "pedidas: " + this.pedidas + "\n";
  }
  
  public String getTotalServidas(){
    return "servidas: " + this.servidas + "\n";
  }
}
