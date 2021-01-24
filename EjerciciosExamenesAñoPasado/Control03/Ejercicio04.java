public class Ejercicio04{
  public static void main(String [] args){
    String[] input = {"Almohada", "Coche", "Avión", "Agua", "Hierro"};
    String[] aux = input.clone();
    int random = (int)(Math.random()* input.length);
    String result = desordenaPalabra(aux[1]);
    //System.out.print(result);
  }
  
  public static String desordenaPalabra(String word){
    char[] arrayFromWord = convierteStringEnArray(word);
    char[] muster = arrayFromWord.clone();
    boolean check = true;
    int randomA = 0;
    int randomB = 0;
    char temp = '0';
    do{
      check = compruebaValoresArray(muster);
      if(!check){
        randomA = (int)(Math.random()*muster.length);
        if(muster[randomA] != '*'){
          do{
            randomB = (int)(Math.random()*muster.length);
          }while(randomA == randomB || muster[randomB] == '*');
          temp = muster[randomA];
          arrayFromWord[randomA] = arrayFromWord[randomB];
          arrayFromWord[randomB] = temp;
          muster[randomA] = '*';
          muster[randomB] = '*';
        } 
      }
    }while(!check);
    for(char item: muster) System.out.print(item + " ");
    word = convierteArrayEnString(arrayFromWord);
    return word;
  }
  
  public static char[] convierteStringEnArray(String input){
    char[] result = new char[input.length()];
    for(int i=0; i<input.length(); i++){
      result[i] = input.charAt(i);
    }
    /*for(int i=0; i<result.length; i++){
      System.out.print(result[i] + " ");
    } */
    return result;
  }
  
  public static boolean compruebaValoresArray(char[] input){
    boolean check = true;
    for(int i=0; i<input.length; i++){
        if(input[i] != '*') check = false;
    }
    return check;
  }
  
  public static String convierteArrayEnString(char[] input){
    String result = "";
    for(int i=0; i<input.length; i++) result+= input[i];
    return result;
  }
}
