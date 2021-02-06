package RecogidaDeDatos;

public class Entrada{
  
  public static int Entero(){
    String entero = "";
    do{
      entero = System.console().readLine();
    }while(!compruebaInputEntero(entero));
    return Integer.parseInt(entero);
  }
  
  public static boolean compruebaInputEntero(String input){
    try{
      Integer.parseInt(input);
    }catch(Exception e){
    System.out.print("El input(entero) no es correcto, vuelva a introducirlo: ");
    return false;
    }
    return true;
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
