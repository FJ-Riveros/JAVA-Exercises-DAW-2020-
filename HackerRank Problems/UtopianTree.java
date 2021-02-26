//https://www.hackerrank.com/challenges/utopian-tree/problem
public class UtopianTree{
  public static void main(String[] args){
    int result = 0;
    for(int i = 0; i < Integer.parseInt(args[0]); i++){
      result = 0;
      for(int j= 0; j<=Integer.parseInt(args[i+1]); j++){
        if(j%2==0){
          result += 1;
        }else{
          result *= 2;
        }
      }
      System.out.println(result);
    }
  }
}
