public class C05Ejercicio52{
  public static void main (String [] args){
    System.out.print("Introduzca un número: ");
    long num = Long.parseLong(System.console().readLine());
    long aux = num;
    int counter = 0;
    while(aux > 0){
      counter++;
      aux /= 10;
    }
    int primero = (int)(num / Math.pow(10, counter - 1));
    num %= Math.pow(10, counter - 1);
    num = (num * 10) + primero;
    System.out.println(num);
    
  }
}
