public class C04Ejercicio04{
  public static void main (String [] args){
    System.out.println("Introduzca el número de horas trabajadas: ");
    int horas = Integer.parseInt(System.console().readLine());
    int dinero;
    int helper;
    if(horas > 40){
      helper = (horas - 40) * 16;
      dinero = (40 * 12) + helper;
    }else{
      dinero = horas * 12;
    }
    System.out.println("El sueldo semanal que le corresponde es de " + dinero);
  }
}
