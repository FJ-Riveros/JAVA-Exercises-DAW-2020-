public class Ejercicio04{
  public static void main(String [] args){
    String[] input = {"Almohada", "Coche", "Avión", "Agua", "Hierro"};
    String[] aux = input.clone();
    int random = (int)(Math.random()* input.length);
    String result = desordenaPalabra(aux[random]);
    System.out.print("Juego de " + "Adivina" + "la palabra \n");
    System.out.println("La palabra desordenada es: " + result);
    int counterIntentos = 0;
    String userInput = "";
    boolean endResult = false;
    do{
      System.out.print("Te quedan " + (5-counterIntentos) + ". Di qué palabra es: ");
      userInput = System.console().readLine();
      if(userInput.equals(aux[random])){
        endResult = true;
      }else{
        System.out.print("Palabra incorrecta. ");
      }
      counterIntentos++;
    }while(counterIntentos<5 && !endResult);
    if(endResult){
      System.out.print("\nEnhorabuena, has acertado la palabra " +  input[random]);
    }else{
      System.out.println("Lo siento, has agotado todos los intentos.");
      System.out.print("La palabra era: " + input[random]);
    }
  }
  
  public static String desordenaPalabra(String word){
    char[] arrayFromWord = convierteStringEnArray(word);
    char[] muster = arrayFromWord.clone();
    boolean check = true;
    int randomA = 0;
    int randomB = 0;
    char temp = '0';
    int counterDePosicionesValidas = 0;
    do{
      check = compruebaValoresArray(muster);
      counterDePosicionesValidas = 0;
      for(int item: muster){
        if(item != '*'){
          counterDePosicionesValidas++;
        }
      }
      if(counterDePosicionesValidas == 1) check = true;
      if(counterDePosicionesValidas != 1){
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
      }
    }while(!check);
    word = convierteArrayEnString(arrayFromWord);
    return word;
  }
  
  public static char[] convierteStringEnArray(String input){
    char[] result = new char[input.length()];
    for(int i=0; i<input.length(); i++){
      result[i] = input.charAt(i);
    }
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
