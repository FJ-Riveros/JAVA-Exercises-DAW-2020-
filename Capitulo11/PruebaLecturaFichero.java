import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class PruebaLecturaFichero{
  public static void main(String[] args){
    try{
      BufferedReader lectura = new BufferedReader(new FileReader("malaga.txt"));
      String linea =  "";
      String texto = "";
      while(linea != null){
        //System.out.println(linea);
        texto += linea + "\n";
        linea = lectura.readLine();
      }
	  System.out.println(texto);
    }catch(FileNotFoundException prueba){
      System.out.println("El fichero no se encuentra");
    }catch(IOException ioe){
      System.out.println("No se puede leer el fichero");
    }
  }
}
