package libreriaPalotes;
public class funcionesPalotes{
  public static String sumaPalotes(String input1, String input2){
    int conversorA = funcionesAuxiliaresPalotes.conviertePalotesEnDecimal(input1);
    int conversorB = funcionesAuxiliaresPalotes.conviertePalotesEnDecimal(input2);
    int suma = conversorA+conversorB;
    return funcionesAuxiliaresPalotes.convierteDecimalEnPalotes(suma);
  }
  
  public static String restaPalotes(String input1, String input2){
    int conversorA = funcionesAuxiliaresPalotes.conviertePalotesEnDecimal(input1);
    int conversorB = funcionesAuxiliaresPalotes.conviertePalotesEnDecimal(input2);
    int resta = conversorA>conversorB ? conversorA-conversorB : conversorB-conversorA;
    return funcionesAuxiliaresPalotes.convierteDecimalEnPalotes(resta);
  }
  
  public static String divisionPalotes(String input1, String input2){
    int conversorA = funcionesAuxiliaresPalotes.conviertePalotesEnDecimal(input1);
    int conversorB = funcionesAuxiliaresPalotes.conviertePalotesEnDecimal(input2);
    int division = conversorA>conversorB ? conversorA/conversorB : conversorB/conversorA;
    return funcionesAuxiliaresPalotes.convierteDecimalEnPalotes(division);
  }
  
  public static String restoPalotes(String input1, String input2){
    int conversorA = funcionesAuxiliaresPalotes.conviertePalotesEnDecimal(input1);
    int conversorB = funcionesAuxiliaresPalotes.conviertePalotesEnDecimal(input2);
    int resto = conversorA%conversorB;
    return funcionesAuxiliaresPalotes.convierteDecimalEnPalotes(resto);
  }
}
