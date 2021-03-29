public class Gestisimal{
  public static void main(String[] args){
    Articulo[] articulos = new Articulo[0];
    int userOption = 0;
    String descripcion = "";
    double precioCompra = 0f;
    double precioVenta = 0f;
    int mercancia = 0;
    int indexMercancia = -1;
    do{
      menu();
      userOption = Integer.parseInt(System.console().readLine());
      switch(userOption){
        case 1:
          for(Articulo item : articulos){
            System.out.print(item);
          }
        break;
        
        case 2:
          System.out.print("Introduzca la descripción del artículo: ");
          descripcion = System.console().readLine();
          System.out.print("Introduzca el precio de compra del artículo: ");
          precioCompra = Double.parseDouble(System.console().readLine());
          System.out.print("Introduzca el precio de venta del artículo: ");
          precioVenta = Double.parseDouble(System.console().readLine());
          articulos = addNewArticulo(articulos, descripcion, precioCompra, precioVenta);
        break;
        
        case 3:
        
        break;
        
        case 4:
        
        break;
        
        case 5:
          System.out.print("Introduzca el código de la mercancia: ");
          indexMercancia = buscadorCodigo(articulos, Integer.parseInt(System.console().readLine()));
          if(indexMercancia != -1){
            System.out.print("Introduzca la cantidad a ingresar: ");
            mercancia = Integer.parseInt(System.console().readLine());
            articulos[indexMercancia].setStock(mercancia);
          }
        break;
        
        case 6:
          System.out.print("Introduzca el código de la mercancia: ");
          indexMercancia = buscadorCodigo(articulos, Integer.parseInt(System.console().readLine()));
          if(indexMercancia != -1){
            System.out.print("Introduzca la cantidad a retirar: ");
            mercancia = Integer.parseInt(System.console().readLine());
            if(mercancia > 0) mercancia *= -1;
            System.out.print("Mercancia lol: " + mercancia);
            articulos[indexMercancia].setStock(mercancia);
          }
        break;
        
        default:
      }
    }while(userOption != 7);
  }
  
  public static Articulo[] addNewArticulo(Articulo[] input, String descripcion, double precioCompra, double precioVenta){
    Articulo[] newList = new Articulo[input.length + 1];
    for(int i=0; i<input.length; i++){
    newList[i] = input[i];
    }
    newList[newList.length - 1] = new Articulo(descripcion, precioCompra, precioVenta);
    return newList;
  }
  
  //Si devuelve -1 no se ha encontrado en el arr
  public static int buscadorCodigo(Articulo[] articulos, int codigoArticulo){
    for(int i=0; i<articulos.length; i++){
      if(articulos[i].getCodArticulo() == codigoArticulo) return i;
    }
    return -1;
  }
  public static void menu(){
    System.out.println("------------------------\n");
    System.out.println("Seleccione una opción");
    System.out.println("1. Listado");
    System.out.println("2. Alta");
    System.out.println("3. Baja");
    System.out.println("4. Modificación");
    System.out.println("5. Entrada de mercancía");
    System.out.println("6. Salida de mercancía");
    System.out.println("7. Salir");
    System.out.println("------------------------\n");
  }
}

