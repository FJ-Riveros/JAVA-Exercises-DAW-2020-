public class Elemento{
  private String nombreProducto;
  private double precio;
  private int cantidad;
  
  public Elemento(String nombre, double precio, int cantidad){
    this.nombreProducto = nombre;
    this.precio = precio;
    this.cantidad = cantidad;
  }
  
  public double getPrecio(){
    return this.precio;
  }
  
  public int getCantidad(){
    return this.cantidad;
  }
  
  public String getNombre(){
    return this.nombreProducto;
  }
  
  public void setCantidad(int addCantidad){
    this.cantidad += addCantidad;
  }
  
}
