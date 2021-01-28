public class quitarEspaciosEnBlancoAntesDeString{
  public static void main(String [] args){
    String prueba = "          prueba";
    System.out.print(sinEspaciosEnBlanco(prueba));
  }
  
  
  public static String sinEspaciosEnBlanco(String input){
    boolean check = false;
    int count = 0;
    String result = "";
    do{
      if(input.charAt(count) == ' '){
        count++;
      }else{
        check = true;
      }
    }while(count<input.length() && !check);
    for(int i=count; i<input.length(); i++){
      result += input.charAt(i);
    }
    return result;
  }
}
