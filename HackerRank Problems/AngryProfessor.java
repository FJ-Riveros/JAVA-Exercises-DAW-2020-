//https://www.hackerrank.com/challenges/angry-professor/problem?h_r=next-challenge&h_v=zen
public class AngryProfessor{
  public static void main(String[] args){
    int cancelationTreshHold = Integer.parseInt(args[1]);
    int numberStudents = Integer.parseInt(args[0]);
    int counter = 0;
    for(int i=0; i<numberStudents; i++){
      if(Integer.parseInt(args[i+2]) <= 0){
        counter++;
      }
    }
    if(counter >= cancelationTreshHold){
      System.out.println("NO");
    }else{
      System.out.println("YES");
    }
  }
}
