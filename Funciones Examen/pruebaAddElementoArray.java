public class pruebaAddElementoArray{
  public static void main(String[] args){
    int[] input = {1,2,3,4};
    for(int item: input) System.out.print(item + " ");
    System.out.println();
    input = añadeItem(input, 5);
    System.out.println("Array más el elemento");
    for(int item: input) System.out.print(item + " ");
  } 
  
  public static int[] añadeItem(int[] input, int num){
    int[] result = new int[input.length+1];
    for(int i=0; i<input.length; i++){
      result[i] = input[i];
    }
    result[result.length-1] = num;
    return result;
  }
}
