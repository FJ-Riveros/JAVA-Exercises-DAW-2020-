//https://www.hackerrank.com/challenges/strong-password/problem

public class Strong_Password{
  public static void main(String[] args){
    int result = minimumNumber(3,"A@#");
    System.out.println(result);
  }
  
  static int minimumNumber(int n, String password) {
    String special_characters = "!@#$%^&*()-+";
    int result = 0;
    int numbersCount = 0;
    int lower = 0;
    int upper = 0;
    int special = 0;
    for(int i=0; i<password.length(); i++){
      if(password.charAt(i)>= '0' && password.charAt(i)<= '9'){
        numbersCount++;
      }else if(password.charAt(i)>= 'a' && password.charAt(i)<= 'z'){
        lower++;
      }else if(password.charAt(i)>= 'A' && password.charAt(i)<= 'Z'){
        upper++;
      }else{
        char charActual = password.charAt(i);
        for(int j=0; j<special_characters.length(); j++){
          if(charActual == special_characters.charAt(j)){
            special++;
          }
        }
      }
    }
    result = numbersCount == 0 ? result+1 : result;
    result = lower == 0 ? result+1 : result;
    result = upper == 0 ? result+1 : result;
    result = special == 0 ? result+1 : result;
    if(result + n < 6){
      result += 6 - (result + n)
    }
    return result;
  }
}
