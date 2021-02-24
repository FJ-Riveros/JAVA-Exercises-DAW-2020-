package funcionesCaballo;

public class HelperCaballo{
  public static int devuelveNivel(char[] input){
    int count = 0;
    boolean check = true;
    for(int i=0; i<input.length&&check; i++){
      if(input[i]=='▓'){
        count++;
      }else{
        check = false;
      } 
    }
    return count;
  }
  
  public static String contenidoBarra(char[] input){
    String result = "";
    for(char item: input) result+= item;
    return result;
  }
  
  public static boolean aumentaContenidoBarra(char[] input){
    if(!checkBarraCompleta(input)){
      for(int i=0; i<input.length; i++){
        if(input[i] != '▓'){
          input[i] = '▓';
          return true;
        }
      }
    }
    return false;
    
  }
  
  //Devuelve true si la barra está completa
  public static boolean checkBarraCompleta(char[] input){
    if(input[input.length-1] == '▓') return true;
    return false;
  }
  
  //Devuelve true si la barra está vacia por completo
  public static boolean checkBarraVacia(char[] input){
    if(input[0] == ' ') return true;
    return false;
  }
}
