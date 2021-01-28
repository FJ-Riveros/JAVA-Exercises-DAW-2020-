//package libreriaPalotes;
public class Ejercicio1{
  public static void main(String [] args){
    //System.out.print(conviertePalotesEnDecimal("---|-|||---|---"));
    System.out.print(convierteDecimalEnPalotes(2345));
  }


  public static int conviertePalotesEnDecimal(String inputPalotes){
    int counterDigito = 0;
    int numeroResultado = 0;
    for(int i=0; i<inputPalotes.length(); i++){
      if(inputPalotes.charAt(i) == '|'){
        counterDigito++;
      }else{
        numeroResultado = numeroResultado * 10 + counterDigito;
        counterDigito = 0;
      } 
    }
    numeroResultado = numeroResultado * 10 + counterDigito;
    return numeroResultado;
  }
  
  public static String convierteDecimalEnPalotes(int input){
    String result = "";
    String composicion = "";
    while(input > 0){
      composicion = "";
      for(int i=0; i<input%10; i++){
        composicion += "|";
      }
      result = composicion + "-" + result;
      input /= 10;
    }
    return result;
  }
}
