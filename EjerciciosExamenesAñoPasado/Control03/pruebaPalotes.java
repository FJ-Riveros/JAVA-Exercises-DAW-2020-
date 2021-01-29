import libreriaPalotes.funcionesPalotes;
public class pruebaPalotes{
  public static void main (String[] args){
    String input1 = "|||";
    String input2 = "||-|";
    System.out.println(libreriaPalotes.funcionesPalotes.sumaPalotes(input1,input2));
    System.out.println(libreriaPalotes.funcionesPalotes.restaPalotes(input1,input2));
    System.out.println(libreriaPalotes.funcionesPalotes.divisionPalotes(input1,input2));
    System.out.println(libreriaPalotes.funcionesPalotes.restoPalotes(input1,input2));
  } 
}
