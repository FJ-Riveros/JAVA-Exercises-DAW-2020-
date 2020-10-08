public class C04Ejercicio07 {
  public static void main(String [] args){
    float primeraNota;
    float segundaNota;
    float terceraNota;
    float media;
    System.out.println("Este programa realiza la media de 3 notas");
    do{
      System.out.println("Introduzca la primera nota");
      primeraNota = Float.parseFloat(System.console().readLine());
    }while(!(primeraNota >= 0 && primeraNota <=10));
    
    do{
      System.out.println("Introduzca la segunda nota");
      segundaNota = Float.parseFloat(System.console().readLine());
    }while(!(segundaNota >= 0 && segundaNota <=10));
    
    do{
      System.out.println("Introduzca la tercera nota");
      terceraNota = Float.parseFloat(System.console().readLine());
    }while(!(terceraNota >= 0 && terceraNota <=10));
    media = ((primeraNota + segundaNota + terceraNota) / 3);
    System.out.println();
    System.out.printf("%s %.2f", "La nota media resultante", media);
  }
}
