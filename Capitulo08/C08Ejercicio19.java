import Matematicas.ConversorDeSistemas;
public class C08Ejercicio19{
  public static void main (String [] args){
    System.out.println("Este programa es un conversor, elija la conversión que desee: ");
    System.out.println("1.  Decimal-Binario.");
    System.out.println("2.  Decimal-Octal.");
    System.out.println("3.  Decimal-Hexadecimal.");
    System.out.println("4.  Binario-Decimal.");
    System.out.println("5.  Binario-Octal.");
    System.out.println("6.  Binario-Hexadecimal.");
    System.out.println("7.  Octal-Decimal.");
    System.out.println("8.  Octal-Binario.");
    System.out.println("9.  Octal-Hexadecimal.");
    System.out.println("10. Hexadecimal-Decimal.");
    System.out.println("11. Hexadecimal-Binario.");
    System.out.println("12. Hexadecimal-Octal.");
    int conversion = Integer.parseInt(System.console().readLine());
    System.out.println("Ahora introduzca el número a convertir: ");
    String input = System.console().readLine();
    switch ( conversion ){
      case 1:
        System.out.print(Matematicas.ConversorDeSistemas.conversorDecimalBinarioLento(Long.parseLong(input)));
      break;
      
      case 2:
      
      break;
      
      case 3:
      
      break;
      
      case 4:
        System.out.print(Matematicas.ConversorDeSistemas.conversorBinarioDecimal(Long.parseLong(input)));
      break;
      
      case 5:
      
      break;
      
      case 6:
      
      break;
      
      case 7:
      
      break;
      
      case 8:
      
      break;
      
      case 9:
      
      break;
      
      case 10:
      
      break;
      
      case 11:
      
      break;
      
      case 12:
      
      break;
    }
  }
}