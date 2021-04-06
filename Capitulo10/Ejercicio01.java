import java.util.ArrayList;

/**
 *
 * @author FJ-Riveros
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> nombres = new ArrayList<>();
        System.out.print("Hola");
        nombres.add("Fran");
        nombres.add("Raquel");
        nombres.add("Pepe");
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Luis");
        nombres.stream().forEach((item) -> {
            System.out.println(item);
        });
        
    }
    
}
