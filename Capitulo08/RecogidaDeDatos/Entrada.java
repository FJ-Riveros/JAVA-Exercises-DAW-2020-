package RecogidaDeDatos;

public class Entrada{
  
  public static int Entero(){
    String entero = "";
    do{
      entero = System.console().readLine();
    }while(entero.equals(""));
    return Integer.parseInt(entero);
  }
  
  public static long Long(){
    return Long.parseLong(System.console().readLine());
  }
  
  public static String Cadena(){
    return System.console().readLine();
  }
  
  public static float Flotante(){
    return Float.parseFloat(System.console().readLine());
  }
  
  public static char Caracter(){
    return System.console().readLine().charAt(0);
  }
  
}
