/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author root
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
