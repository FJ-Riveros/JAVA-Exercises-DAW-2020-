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
    System.out.print("Error de formato(entero), vuelva a introducirlo: ");
    return false;
    }
    return true;
  }
  
  public static long Long(){
    String largo = "";
    do{
      largo = System.console().readLine();
    }while(!compruebaInputLong(largo));
    return Long.parseLong(largo);
  }
  
  public static boolean compruebaInputLong(String input){
    try{
      Long.parseLong(input);
    }catch(Exception e){
    System.out.print("Error de formato(Long), vuelva a introducirlo: ");
    return false;
    }
    return true;
  }
  
  public static String Cadena(){
    String input = "";
    do{
      input = System.console().readLine();
    }while(input.equals(""));
    return input;
  }
  
  public static float Flotante(){
    return Float.parseFloat(System.console().readLine());
  }
  
  public static char Caracter(){
    return System.console().readLine().charAt(0);
  }
  
}
