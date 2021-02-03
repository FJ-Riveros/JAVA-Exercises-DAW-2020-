public class presentaArrayBidiComoUni{
  public static void main(String [] args){
    int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
      presentaArrayBidi(arr);
  }
  
  public static void presentaArrayUni(int[] arrUni){
    for(int item: arrUni) System.out.print(item + " ");
  }
  
  public static void presentaArrayBidi(int[][] arrBidi){
    for(int i=0; i<arrBidi.length; i++){
      presentaArrayUni(arrBidi[i]);
      System.out.println();
    }
  }
}
