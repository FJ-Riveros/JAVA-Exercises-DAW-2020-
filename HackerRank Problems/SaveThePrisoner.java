 //https://www.hackerrank.com/challenges/save-the-prisoner/problem
 public class SaveThePrisoner{
  static int saveThePrisoner(int n, int m, int s) {
    int result = 0;
    while(m>n){
      m-= n;
    }
    if(m+s-1>n){
      result = ((m+s) - n)-1;
    }else{
      result = (m+s)-1;
    }
    return result;
  }
}
