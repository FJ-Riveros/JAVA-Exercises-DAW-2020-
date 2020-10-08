public class C04Ejercicio03 {
  public static void main(String [] args){
    System.out.println("Escriba un número del 1 al 7");
    int weekNumber = Integer.parseInt(System.console().readLine());
    switch (weekNumber){
      
      case 1:
        System.out.println("El " + weekNumber + " corresponde al Lunes");
      break;
      
      case 2:
        System.out.println("El " + weekNumber + " corresponde al Martes");
      break;
      
      case 3:
        System.out.println("El " + weekNumber + " corresponde al Miércoles");
      break;
      
      case 4:
        System.out.println("El " + weekNumber + " corresponde al Jueves");
      break;

      case 5:
        System.out.println("El " + weekNumber + " corresponde al Viernes");
      break;
      
      case 6:
        System.out.println("El " + weekNumber + " corresponde al Sábado");
      break;
      
      case 7:
        System.out.println("El " + weekNumber + " corresponde al Domingo");
      break;
    }
  }
}
