public class Ejercicio04{
  public static void main(String[] args){
    int a,b,c;
    do{
      a = tirada();
      b = tirada();
      c = tirada();
      System.out.println(a + " " + b + " " + c);
    }while(compruebaTiradas(a,b,c)<2);
  }
  
  public static int tirada(){
    return (int)(Math.random()*6)+1;
  }
  
  public static int compruebaTiradas(int a, int b, int c){
    int result = 0;
    if(a==b && a==c){
      result = 3;
    }else if(a==b || a==c || b==c){
      result = 2;
    }
    return result;
  }
}
