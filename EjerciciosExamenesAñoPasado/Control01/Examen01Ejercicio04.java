public class Examen01Ejercicio04 {
  public static void main ( String [] args ){
    System.out.println("Este programa codifica números en letras similares");
    int numero;
    String resultado;
    do{
      System.out.println("Introduzca un número( 0 para salir)");
      numero = Integer.parseInt(System.console().readLine());
      
      switch (numero){
        
        case 1:
          resultado = resultado + "A";
        break;
        
        case 2:
          resultado = resultado + "B";
        break;
        
        case 3:
          resultado = resultado + "C";
        break;
      }
  
    }while(numero != 0);
  }
}
