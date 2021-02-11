/**
 * @Author: FJ-Riveros
 */
 
public class Ejercicio02{
  public static void main(String[] args){
    System.out.print("Introduzca la altura de la pirámide: ");
    int h = Integer.parseInt(System.console().readLine());
    System.out.println();
    for(int i=0; i<h-1; i++){
      System.out.print(linea(h-i-1, ' ', ' '));
      System.out.println(linea((i*2) + 1, '*', ' '));
      
    }
    System.out.print(linea(h*2-1, '*', '*'));
  }
  
  public static String linea(int longitud, char extremo, char relleno){
    String result = "";
    for(int i=0; i<longitud; i++){
      if(i==0 || i==longitud-1){
        result += extremo;
      }else{
        result += relleno;
      }
    }
    return result;
  }
}
