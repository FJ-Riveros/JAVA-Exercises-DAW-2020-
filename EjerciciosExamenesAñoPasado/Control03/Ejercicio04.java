public class Ejercicio04{
  public static void main(String [] args){
    String[] input = {"Almohada", "Coche", "Avión", "Agua", "Hierro"};
    String[] aux = input.clone();
    int random = (int)(Math.random()* input.length);
    String result = desordenaPalabra(aux[1]);
  }
  
  public static String desordenaPalabra(String word){
    String[] arrayFromWord = convierteStringEnArray(word);
    String[] muster = arrayFromWord.clone();
    boolean check = false;
    do{
      check = false;
      //Seguir
      
    }while();
    return word;
  }
  
  public static String[] convierteStringEnArray(String input){
    String[] result = new String[input.length()];
    for(int i=0; i<input.length(); i++){
      result[i] = input.charAt(i);
    }
    return result;
  }
}
