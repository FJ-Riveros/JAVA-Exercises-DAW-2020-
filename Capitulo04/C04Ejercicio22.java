public class C04Ejercicio22{
  public static void main (String [] args){
    int horas;
    int minutos;
    int result;
    int diaHelper = 1;
    String dia = "";
    System.out.println("Introduzca el dia de la semana en el que se encuentra");
    dia = System.console().readLine();
    System.out.println("Introduzca la hora en la que se encuentra (Solo la hora)");
    horas = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca los minutos de la hora en la que se encuentra");
    minutos = Integer.parseInt(System.console().readLine());
    switch (dia){
      
      case "lunes":
        diaHelper = 0;
      break;
      
      case "martes":
        diaHelper = 1 * 1440;
      break;
      
      case "miercoles":
        diaHelper = 2 * 1440;
      break;
      
      case "jueves":
        diaHelper = 3 * 1440;
      break;
      
      case "viernes":
        diaHelper = 4 * 1440;
      break;
      
      default:
    }
    result = 6660 - ((((horas * 60) + minutos) + diaHelper));
    System.out.println("Faltan exactamente " + result + " minutos para el fin de semana!");
  }
}
