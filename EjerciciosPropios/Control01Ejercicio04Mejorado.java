public class Control01Ejercicio04Mejorado {
  public static void main (String [] args){
    System.out.print("Introduzca el número que desea estirar: ");
    long num = Long.parseLong(System.console().readLine());
    String result = "";
    System.out.println(num);
    System.out.print("Introduzca el estiramiento que desee: ");
    int estiramiento = Integer.parseInt(System.console().readLine());
    int digito = 0;
    while(num > 0){
      digito = (int)num%10;
      for(int i = 0; i < estiramiento; i++){
        result = "" + digito + result;
      }
      num /= 10;
    }
    System.out.print(result);
  }
}
