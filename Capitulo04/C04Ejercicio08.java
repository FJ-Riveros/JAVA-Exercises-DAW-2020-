public class C04Ejercicio08 {
  public static void main(String [] args){
    float primeraNota;
    float segundaNota;
    float terceraNota;
    float media;
    String boletin = "";
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
    if(media >= 0 && media < 5){
      boletin = "insuficiente";
    }else if(media >= 5 && media < 6){
      boletin = "suficiente";
    }else if(media >= 6 && media < 7){
      boletin = "bien";
    }else if(media >= 7 && media < 9){
      boletin = "notable";
    }else if(media >= 9 && media <= 10){
      boletin = "sobresaliente";
    }else{
      System.out.println("Alguna de las notas introducidas es un número no válido");
    }
    System.out.println();
    System.out.printf("%s %.2f %s %s", "La nota media resultante es:", media,"es decir, un", boletin);
  }
}
