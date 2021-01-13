
public class C08Ejercicio52{
  public static void main(String [] args){
    int[] arr = {23,15,4,98};
    System.out.print("Aleatoriamente se ha seleccionado el número: " + aleatorioDeArray(arr));
  }
  
  public static int aleatorioDeArray(int[] a){
    return a[(int)(Math.random() * (a.length))];
  }
}
