public class Ejercicio03{
  public static void main (String [] args){
    int input = 0;
    int potencia = 1;
    int digito = 0;
    int aux = 0;
    int counter = 0;
    System.out.print("Este programa codifica números enteros en MORSE.\n");
    do{
      potencia=1;
      counter=0;
      System.out.print("Introduzca un valor entero a codificar(>=0): ");
      input = Integer.parseInt(System.console().readLine());
      if(input >= 0){
        while(input / potencia > 9){
          potencia *= 10;
          counter++;
        }
        aux = input;
        do{
          digito = aux / potencia;
          aux %= potencia;
          switch(digito){
            case 1:
              System.out.print(".---- ");
            break;
            
            case 2:
              System.out.print("..--- ");
            break;
            
            case 3:
              System.out.print("...-- ");
            break;
            
            case 4:
              System.out.print("....- ");
            break;
            
            case 5:
              System.out.print("..... ");
            break;
            
            case 6:
              System.out.print("-.... ");
            break;
            
            case 7:
              System.out.print("--... ");
            break;
            
            case 8:
              System.out.print("---.. ");
            break;
            
            case 9:
              System.out.print("----. ");
            break;
            
            case 0:
              System.out.print("----- ");
            break;
          }
          potencia /= 10;
        }while(potencia >0);
        System.out.println();
      }
    }while(input >=0);
  }
}
