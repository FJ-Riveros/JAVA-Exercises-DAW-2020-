public class PruebaTerminal{
  public static void main(String[] args){
    Terminal t1 = new Terminal("678 11 22 33");
    Terminal t2 = new Terminal("677 11 22 33");
    Terminal t3 = new Terminal("676 11 22 33");
    Terminal t4 = new Terminal("675 11 22 33");
    System.out.println(t1);
    System.out.println(t2);
    t1.llama(t2, 320);
    t1.llama(t3, 200);
    System.out.println(t1);
    System.out.println(t2);
    System.out.println(t3);
    System.out.println(t4);
  }
}
