public class C04Ejercicio02{
  public static void main (String [] args){
    System.out.println("Introduzca la hora");
    int hora = Integer.parseInt(System.console().readLine());
    if( hora >= 6 && hora <= 12){
      System.out.println("Buenos días");
    }else if ( hora >= 13 && hora <= 20){
      System.out.println("Buenas tardes");
    }else{
      System.out.println("Buenas noches");
    }
  }
}
