public class EjercicioHKArrayManipulation {
  public static void main (String [] args){
    long [] arr = new long[n];
    long max= 0;
    for(int i=0;i<queries.length;i++){
      for(int x=(queries[i][0])-1;x<queries[i][1];x++){
        arr[x]= arr[x] + queries[i][2];
        if(arr[x] > max){
          max=arr[x];
        }
      }
    }
    return max;
  }
}
