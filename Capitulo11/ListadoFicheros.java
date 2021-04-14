import java.io.File;
import java.io.IOException;
public class ListadoFicheros{
  public static void main(String[] args){
      File f = new File("../..");
      String[] lista = f.list();
      for(String files : lista) System.out.println(files);
  }
}
