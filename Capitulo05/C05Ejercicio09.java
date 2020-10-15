public class C05Ejercicio09 {
  public static void main (String [] args){
    float num;
    int digitos = 0;
    System.out.print("Introduzca un número para saber de cuantos dígitos se trata: ");
    num = Math.abs(Integer.parseInt(System.console().readLine()));
    System.out.println();
    do {
      num = num / 10;
      digitos++;
    } while( num >= 1);
    System.out.println("El número está compuesto por " + digitos + " dígitos");
  }
}
  
