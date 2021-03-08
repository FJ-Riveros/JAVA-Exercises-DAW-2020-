//https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem
public class Jumping_on_the_clouds{
  public static void main(String[] args){
    int[] clouds = {0, 0, 1, 0, 0, 1, 1, 0};
    System.out.print(jumpingOnClouds(clouds,2));
  }
  
  static int jumpingOnClouds(int[] c, int k) {
    int energy = 100;
    int index = 0;
    do{
      index += k;
      if(index >= c.length){
        index -= c.length;
      }
      if(c[index] == 1){
        energy -= 3;
      }else{
        energy -=1;
      }
    }while(index != 0);
    return energy;
  }
}
