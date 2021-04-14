import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class quita_comentarios{
  public static void main(String[] args){
    try{
      if(args.length == 2){
        BufferedReader lectura = new BufferedReader(new FileReader(args[0]));
        BufferedWriter escritura = new BufferedWriter(new FileWriter(args[1]));
        String linea = "";
        while(linea != null){
          linea = lectura.readLine();
          linea.replace("//", " ");
          escritura.write(linea + "\n");
        }
        lectura.close();
        escritura.close();
      }else{
        System.out.println("Ejecute el programa con el siguiente formato: ");
        System.out.println("quita_comentarios <archivoOriginal> <archivoDestino>");
        System.exit(-1);
      }
    }catch(FileNotFoundException notFound){
      System.out.println("Uno de los archivos no ha podido ser encontrado.");
    }catch(IOException falloEjecutar){
      System.out.println("No se ha podido ejecutar el programa.");
    }
  }
}
