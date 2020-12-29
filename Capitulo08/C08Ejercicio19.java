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
    String resultHexa = "";
    long resultNoHexa = 0;
    long helper = 0;
    switch ( conversion ){
      case 1:
        resultNoHexa = Matematicas.ConversorDeSistemas.conversorDecimalBinarioLento(Long.parseLong(input));
      break;
      
      case 2:
        resultNoHexa = Matematicas.ConversorDeSistemas.conversorDecimalOctal(Long.parseLong(input));
      break;
      
      case 3:
        resultHexa = Matematicas.ConversorDeSistemas.conversorDecimalHexadecimal(Long.parseLong(input));
      break;
      
      case 4:
        resultNoHexa = Matematicas.ConversorDeSistemas.conversorBinarioDecimal(Long.parseLong(input));
      break;
      
      case 5:
        resultNoHexa = Matematicas.ConversorDeSistemas.conversorBinarioDecimal(Long.parseLong(input));
        resultNoHexa = Matematicas.ConversorDeSistemas.conversorDecimalOctal(resultNoHexa);
      break;
      
      case 6:
        helper = Matematicas.ConversorDeSistemas.conversorBinarioDecimal(Long.parseLong(input));
        resultHexa = Matematicas.ConversorDeSistemas.conversorDecimalHexadecimal(helper);
      break;
      
      case 7:
        resultNoHexa = Matematicas.ConversorDeSistemas.conversorOctalDecimal(Long.parseLong(input));
      break;
      
      case 8:
        resultNoHexa = Matematicas.ConversorDeSistemas.conversorOctalDecimal(Long.parseLong(input));
        resultNoHexa = Matematicas.ConversorDeSistemas.conversorDecimalBinarioLento(resultNoHexa);
      break;
      
      case 9:
        helper = Matematicas.ConversorDeSistemas.conversorOctalDecimal(Long.parseLong(input));
        resultHexa = Matematicas.ConversorDeSistemas.conversorDecimalHexadecimal(helper);
      break;
      
      case 10:
        resultNoHexa = Matematicas.ConversorDeSistemas.conversorHexadecimalDecimal(input);
      break;
      
      case 11:
        resultNoHexa = Matematicas.ConversorDeSistemas.conversorHexadecimalDecimal(input);
        resultNoHexa = Matematicas.ConversorDeSistemas.conversorDecimalBinarioRapido(resultNoHexa);
      break;
      
      case 12:
        resultNoHexa = Matematicas.ConversorDeSistemas.conversorHexadecimalDecimal(input);
        resultNoHexa = Matematicas.ConversorDeSistemas.conversorDecimalOctal(resultNoHexa);
      break;
      default:
    }
    if(conversion == 3 || conversion == 6 || conversion == 9 ){
      System.out.println(resultHexa);
    }else{
      System.out.println(resultNoHexa);
    }
  }
}
