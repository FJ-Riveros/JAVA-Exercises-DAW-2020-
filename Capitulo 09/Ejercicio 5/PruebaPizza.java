public class PruebaPizza{
  public static void main(String [] args){
    Pizza p1 = new Pizza("margarita", "mediana");
    Pizza p2 = new Pizza("funghi", "familiar");
    p2.sirve();
    Pizza p3 = new Pizza("Cuatro quesos", "mediana");
    System.out.print(p1);
    System.out.print(p2);
    System.out.print(p3);
    p2.sirve();
    System.out.print(p1.getTotalPedidas());
    System.out.print(p1.getTotalServidas());
  }
}
