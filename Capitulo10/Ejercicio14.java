import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author FJ-Riveros
 */
 
public class Ejercicio14{
  public static void main(String[] args){
    String userInput = "";
    int cantidadUserInput = 0;
    String result = "";
    double total = 0f;
    HashMap<String, Double> catalogo = new HashMap<String, Double>();
    catalogo.put("avena", 2.21);
    catalogo.put("garbanzos", 2.39);
    catalogo.put("tomate", 1.59);
    catalogo.put("jengibre", 3.13);
    catalogo.put("quinoa", 4.50);
    catalogo.put("guisanates", 1.60);
    ArrayList<String> compraName = new ArrayList<>();
    ArrayList<Integer> compraUserCant = new ArrayList<>();
    System.out.println("Bienvenido, introduzca los productos que desea junto con la cantidad, para salir escriba 'fin'.\n");
    do{
      System.out.print("Producto: ");
      userInput = System.console().readLine();
      if(!(userInput.equals("fin"))){
        System.out.print("Cantidad: ");
        cantidadUserInput = Integer.parseInt(System.console().readLine());
        compraName.add(userInput);
        compraUserCant.add(cantidadUserInput);
      }
    }while(!(userInput.equals("fin")));
    result = "\nProducto Precio Cantidad Subtotal\n";
    result += "----------------------------------\n";
    for(int i=0; i<compraName.size(); i++){
      result = listing(result, compraName.get(i), catalogo.get(compraName.get(i)),
      compraUserCant.get(i));
      total += catalogo.get(compraName.get(i)) * compraUserCant.get(i);
    }
    result += "----------------------------------\n";
    result += String.format("%-6s %4.2f", "TOTAL:", total);
    System.out.println(result);
  }
  
  private static String listing(String cadenaPrevia, String productName, double productPrice, int productCuantity){
    String result = cadenaPrevia;
    result += String.format("%-7s %6.2f %5d %10.2f\n", productName, productPrice, productCuantity, (productPrice*productCuantity));
    return result;
  }
}
