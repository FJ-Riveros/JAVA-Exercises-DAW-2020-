public class C06Ejercicio01{
  public static void main (String [] args){
    int num = 0;
    int result = 0;
    for( int i = 0; i < 3; i++){
      num = (int)(Math.random()* 6) + 1;
      System.out.println("El dado " + (i + 1) + " ha obtenido un valor de " + num);
      result += num;
    }
    System.out.println("El total ha sido " + result);
  }
}
