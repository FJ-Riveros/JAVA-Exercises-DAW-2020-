public class PruebaMovil{
  public static void main(String[] args){
    Movil m1 = new Movil("678 11 22 33", "rata");
    Movil m2 = new Movil("677 11 22 33", "mono");
    Movil m3 = new Movil("676 11 22 33", "bisonte");
    
    System.out.println(m1);
    System.out.println(m2);
    m1.llama(m2, 320);
    m1.llama(m3, 200);
    m2.llama(m3, 550);
    System.out.println(m1);
    System.out.println(m2);
    System.out.println(m3);
  }
}
