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
    String flotante = "";
    do{
      flotante = System.console().readLine();
    }while(!compruebaInputFlotante(flotante));
    return Float.parseFloat(flotante);
  }
  
  public static boolean compruebaInputFlotante(String input){
    try{
      Float.parseFloat(input);
    }catch(Exception e){
    return false;
    }
    return true;
  }
  
  public static char Caracter(){
    String caracter = "";
    do{
      caracter = System.console().readLine();
    }while(!compruebaInputChar(caracter));
    return caracter.charAt(0);
  }
  
  public static boolean compruebaInputChar(String input){
    if(input == "" || input.length() != 1){
      return false;
    }
    return true;
  }
  
}
