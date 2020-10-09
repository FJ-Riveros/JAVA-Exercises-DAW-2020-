public class C04Ejercicio11{
  public static void main (String [] args){
    int horas;
    int minutos;
    int daySecs = 86400;
    int result;
    System.out.println("Este programa calcula los segundos que faltan hasta medianoche");
    do{
      System.out.println("Introduzca primero las horas");
      horas = Integer.parseInt(System.console().readLine());
    }while(!(horas >= 1 && horas <= 24)); 
    do{
      System.out.println("Introduzca los minutos");
      minutos = Integer.parseInt(System.console().readLine());
    }while(!(minutos >= 0 && minutos < 60));
    result = daySecs - ((horas * 3600) + (minutos * 60));
    System.out.println(result);
  }
}
  
