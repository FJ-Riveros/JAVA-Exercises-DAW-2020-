import java.util.ArrayList;

/**
 *
 * @author FJ-Riveros
 */
 
public class Ejercicio02{
  public static void main(String[] args){
    int media = 0;
    int max = 0;
    int min = 101;
    ArrayList<Integer> nums = new ArrayList<>();
    for(int i=0; i<(int)(Math.random()*11)+10;i++){
      nums.add((int)(Math.random()*101));
    }
    for(int item: nums){
      System.out.println(item);
      min = min > item ? item : min;
      max = max < item ? item : max;
      media += item;
    }
    media /= nums.size();
    System.out.println("El mínimo es: " + min);
    System.out.println("El máximo es: " + max);
    System.out.print("La media es: " + media);
  }
}
