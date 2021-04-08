import java.util.ArrayList;
public class Carrito{
  private static ArrayList<Elemento> articulos = new ArrayList<>();

  public static void agrega(Elemento input){
    boolean check = false;
    for(Elemento item: articulos){
      if(item.getNombre().equals(input.getNombre())){
        check = true;
        item.setCantidad(input.getCantidad());
      }
    }
    if(!check){
      articulos.add(input);
    }
  }
  
  public static int numeroDeElementos(){
    return articulos.size();
  }
  
  public static double importeTotal(){
    double total = 0f;
    for(Elemento item: articulos){
      total+= item.getCantidad() * item.getPrecio();
    }
    return total;
  }
  
  public String toString(){
    String result = "Contenido del Carrito\n";
    result += "\n==========================\n";
    for(Elemento item: articulos){
      result += String.format("%-20s PVP: %7.2f Unidades: %2d Subtotal: %6.2f\n", item.getNombre(), item.getPrecio(), item.getCantidad(), item.getCantidad() * item.getPrecio());
    }
    return result;
  }
}
