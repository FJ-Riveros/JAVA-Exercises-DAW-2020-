//https://www.hackerrank.com/challenges/permutation-equation/problem
public class Sequence_Equation{
  public static void main(String[] args){
    int[] input = {4,3,5,1,2};
    int[] result = permutationEquation(input);
    for(int item: result) System.out.print(item + " ");
  }
  
  static int[] permutationEquation(int[] p) {
    int[] result = new int[p.length];
    int counter = 0;
    int index = 0;
    int indexb = 0;
    for(int i=1; i<=p.length; i++){
      index = 0;
      indexb = 0;
      while(p[index] != i){
        index++;
      }
      index++;
      while(p[indexb] != index){
        indexb++;
      }
      indexb++;
      result[counter++] = indexb;
    }
    return result;
  }
}
