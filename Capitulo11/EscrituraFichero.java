import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class EscrituraFichero{
  public static void main(String[] args){
    try{
      BufferedWriter escritura = new BufferedWriter(new FileWriter("escritura.txt"));
      escritura.write("Esto \n");
      escritura.write("es \n");
      escritura.write("una \n");
      escritura.write("prueba \n");
      escritura.write("¿se puede sobreescribir? \n");
      escritura.close();
    }catch(IOException ioe){
      System.out.println("No se puede escribir en el fichero");
    }
  }
}
