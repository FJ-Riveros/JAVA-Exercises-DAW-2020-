public class Articulo{
  private static int counterCodigo = 0;
  private int codArticulo;
  private String descripcion;
  private double precioCompra;
  private double precioVenta;
  private int stock;
  
  public Articulo(String descripcionDada, double precioCompra, double precioVenta){
    this.descripcion = descripcionDada;
    counterCodigo++;
    this.codArticulo = counterCodigo;
    this.precioCompra = precioCompra;
    this.precioVenta = precioVenta;
  }
  
  public int getCodArticulo(){
    return this.codArticulo;
  }
  
  public int getStock(){
    return this.stock;
  }
  
  public void setPrecioCompra(double precioCompra){
    this.precioCompra = precioCompra;
  }
  
  public void setPrecioVenta(double precioVenta){
    this.precioVenta = precioCompra;
  }
  
  public void setStock(double controlStock){
    this.stock+= controlStock;
  }
  
  public String toString(){
    String result = "";
    result += "------------------------\n";
    result += "   Código Artículo " + this.codArticulo + "\n";
    result += "------------------------\n";
    result += String.format("%-15s %-5s\n", "Descripcion:", this.descripcion);
    result += String.format("%-15s %-5.2f\n", "Precio compra:" ,this.precioCompra);
    result += String.format("%-15s %-5.2f\n", "Precio venta:" , this.precioVenta);
    result += String.format("%-15s %-5d\n", "Stock:", this.stock);
    result += "------------------------\n";
    return result;
  }
}
