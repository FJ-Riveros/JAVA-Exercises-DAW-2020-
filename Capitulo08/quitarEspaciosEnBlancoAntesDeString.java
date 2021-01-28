//Hacer función que quite los espacios en blanco delante de un string
public class quitarEspaciosEnBlancoAntesDeString{
  public static void main(String [] args){
    String prueba = "   prueba";
    System.out.print(sinEspaciosEnBlanco(prueba));
  }
  
  
  public static String sinEspaciosEnBlanco(String input){
    boolean check = true;
    int count = 0;
    do{
      if(input.chartAt(count).equals(" ")){
        count++;
      }
    }while(counter<input.length() && !check);
  }
}
