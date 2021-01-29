package libreriaPalotes;
public class funcionesPalotes{
  public static String sumaPalotes(String input1, String input2){
    int conversorA = funcionesAuxiliaresPalotes.conviertePalotesEnDecimal(input1);
    int conversorB = funcionesAuxiliaresPalotes.conviertePalotesEnDecimal(input2);
    int suma = conversorA+conversorB;
    return funcionesAuxiliaresPalotes.convierteDecimalEnPalotes(suma);
  }
}
