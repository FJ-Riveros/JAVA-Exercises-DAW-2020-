public class Control01Ejercicio02Mejorado {
  public static void main (String [] args){
    System.out.print("Introduzca el número que desee diseccionar: ");
    long num = Long.parseLong(System.console().readLine());
    long aux = num;
    int digito = 0;
    int impares = 0;
    int pares = 0;
    int potencia10 = 1;
    while(aux > 0){
      digito = (int)aux%10;
      if(digito % 2 != 0){
        impares = (impares * 10) + digito;
      }else{
        pares = (digito * potencia10) + pares;
        potencia10 *= 10;
      }
      aux/= 10;
    }
    System.out.println("Tenemos los impares: " + impares);
    System.out.println("Tenemos los pares: " + pares);
  }
}
