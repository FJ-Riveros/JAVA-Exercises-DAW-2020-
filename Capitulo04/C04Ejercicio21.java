public class C04Ejercicio21{
  public static void main (String [] args){
    float primerExamen;
    float segundoExamen;
    float media;
    String recuperacion = "";
    System.out.println("Este programa calcula la nota de un trimestre de la asignatura Programación");
    System.out.println("Introduzca la nota del primer examen");
    primerExamen = Float.parseFloat(System.console().readLine());
    System.out.println("Introduzca la nota del segundo examen");
    segundoExamen = Float.parseFloat(System.console().readLine());
    media = (primerExamen + segundoExamen) / 2;
    if( media >= 5){
      System.out.println("Estás aprobado con una media de: " + media );
    }else{
      System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto / no apto)");
      recuperacion = System.console().readLine();
      if(recuperacion.equals("apto")){
        System.out.println("Estás aprobado con una media de: 5");
      }else{
        System.out.println("Tu nota de programación es: " + media );
      }
    }
  }
}
