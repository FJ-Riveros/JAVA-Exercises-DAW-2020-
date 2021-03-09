//https://www.hackerrank.com/challenges/camelcase/problem

public class CamelCase{
  public static void main(String[] args){
    System.out.print(camelCase("saveChangesInTheEditor"));
  }
  
  static int camelCase(String s) {
    int counter = s.length()>0? 1:0;
    for(int i=0; i<s.length(); i++){
      if(s.charAt(i)>'z' || s.charAt(i)<'a') counter++;
    }
    return counter;
  }
}
