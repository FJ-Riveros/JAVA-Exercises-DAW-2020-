//https://www.hackerrank.com/challenges/circular-array-rotation/problem
public class Circular_Array_Rotation{
  public static void main(String[] args){
    int[] input = {1,2,3};
    int rotations = 2;
    int[] queries = {0,1,2};
    int[] result = circularArrayRotation(input, rotations, queries);
    for(int item: result)System.out.print(item + " ");
  }
  
  //Faster solution.
  static int[] circularArrayRotation(int[] a, int k, int[] queries) {
    int[] store = new int[a.length];
    int[] result = new int[queries.length];
    int calc = 0;
    calc = k%store.length;
    for(int i=0; i<a.length; i++){
      if(i+1+calc> a.length){
        store[(i+calc)-a.length] = a[i];
      }else{
        store[i+calc] = a[i];
      }
    }
    for(int i=0; i<queries.length; i++){
      result[i] = store[queries[i]];
    }
    return result;
  }
  
  //Too slow
  /*static int[] circularArrayRotation(int[] a, int k, int[] queries) {
    int[] result = new int[queries.length];
    int temp = 0;
    for(int i=0; i<k; i++){
      temp = a[a.length-1];
      for(int j=a.length-1; j>0; j--){
          a[j] = a[j-1];
      }
      a[0] = temp;
    }
    int counter = 0;
    for(int j=0; j<queries.length; j++){                
      result[counter++] = a[queries[j]];
    } 
    return result;
  }*/
}
