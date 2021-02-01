import funcionesAux03.funcionesAuxiliares03.*;
public class Ejercicio03{
  public static void main(String[] args){
    System.out.println("Este programa visualiza los números perfectos en un rango");
    System.out.print("Indique hasta que número desea comprobar: ");
    long userInput = Long.parseLong(System.console().readLine());
    System.out.println("\nLos números perfectos en ese rango son: ");
    for(int i=2; i<userInput; i++){
      if(funcionesAux03.funcionesAuxiliares03.esPerfecto(i)) System.out.println(i);
    }
  }
}
