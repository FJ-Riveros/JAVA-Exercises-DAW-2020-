public class recursividadEsCapicua{
  public static void main(String[] args){
    String userInput = System.console().readLine();
    if(esCapicua(userInput)){
      System.out.print("Es capicua");
    }else{
      System.out.print("No es capicua");
    }
  }
  
  public static boolean esCapicua(String input){
    boolean respuesta = false;
    if(input.equals("")){
      respuesta = true;
    }else if(input.length() == 1){
      respuesta = true;
    }else if(input.charAt(0) == input.charAt(input.length()-1) &&
     esCapicua(input.substring(1,input.length()-1))){
      respuesta = true;
    }
    return respuesta;
  }
}
