//https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem
public class BeautifulDays{
  public static void main(String[] args){
    int counter = 0;
    int reverse = 0;
    int aux = 0;
    for(int i=Integer.parseInt(args[0]); i<=Integer.parseInt(args[1]); i++){
      aux = i;
      reverse = 0;
      while(aux>0){
        reverse = (reverse * 10) + (aux%10);
        aux/= 10;
      }
      if((i-reverse)%Integer.parseInt(args[2]) == 0) counter++;
    }
    System.out.println(counter);
  }
}
