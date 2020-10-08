public class C04Ejercicio01 {
  public static void main (String [] args){
    System.out.println("Escriba un día de la semana");
    String weekDay = System.console().readLine();
    switch (weekDay){
      
      case "Lunes":
        System.out.println("El " + weekDay + "a primera hora toca Programación");
      break;
      
      case "Martes":
        System.out.println("El " + weekDay + " a primera hora toca Sistemas Informáticos");
      break;
      
      case "Miércoles":
        System.out.println("El " + weekDay + " a primera hora toca Programación");
      break;
      
      case "Jueves":
        System.out.println("El " + weekDay + " a primera hora toca Programación");
      break;

      case "Viernes":
        System.out.println("El " + weekDay + " a primera hora toca Programación");
      break;
    }
  }
}
