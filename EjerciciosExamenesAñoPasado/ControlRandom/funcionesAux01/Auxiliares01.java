public class Auxiliares01{
  public static char[] eligePalabra(String palabraElegida){
    char[] result = new char[palabraElegida.length()];
    for(int i=0; i<palabraElegida.length(); i++){
      result[i] = palabraElegida.charAt(i);
    }
    return result;
  }
  
  public static int longitudPalabra(char[] arrChar){
    return arrChar.length;
  }
  
  public static void presentaPalabra(char[] arrChar){
    for(char item: arrChar){
      System.out.print(item + " ");
    }
  }
  
  public static char[] palabraEnBlanco(int numLetras){
    char[] result = new char[numLetras];
    for(int i=0; i<result.length; i++){
      result[i] = '_';
    }
    return result;
  }
  
  public static boolean destapaLetra(char[] arrResultado, char[] arrUser, char letra){
    boolean check = false;
    for(int i=0; i<arrResultado.length; i++){
      if(arrResultado[i] == letra){
        arrUser[i] = letra;
        check = true;
      }
    }
    return check;
  }
  
  public static boolean palabraDescubierta(char[] arrUser){
    boolean check = true;
    for(int i=0; i<arrUser.length; i++){
      if(arrUser[i] == '_'){
        check = false;
      }
    }
    return check;
  }
}
