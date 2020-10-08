public class C04Ejercicio05{
  public static void main (String [] args){
    float A;
    float B;
    float resultado;
    System.out.println("Este programa resuelve ecuaciones del tipo ax + b = 0");
    do{
      System.out.println("Por favor introduzca el valor de A, este no puede ser 0");
      A = Float.parseFloat(System.console().readLine());
    }while( A == 0);
    System.out.println("Por favor introduzca el valor de B");
    B = Float.parseFloat(System.console().readLine());
    resultado = ( -B / A );
    System.out.println(" x = " + resultado);
  }
}
