package libreriaPalotes;
public class funcionesAuxiliaresPalotes{
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
      input /= 10;
      result = composicion + result;
      if(input >0) result = "-" + result;
    }
    return result;
  }
}
