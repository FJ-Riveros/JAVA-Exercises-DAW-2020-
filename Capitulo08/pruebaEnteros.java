import Matematicas.ConversorDeSistemas;
public class pruebaEnteros{
public static void main(String [] args){
    //System.out.print("Introduzca un número :" );
    //String num = System.console().readLine();
    //System.out.print("Introduzca el digito a buscar :" );
    //int num = Integer.parseInt(System.console().readLine());
    //int exponente = Integer.parseInt(System.console().readLine());
    //System.out.println("Los digitos que tiene son " + Matematicas.OperacionesEnteros.potencia(num, exponente));
    int[] prueba = new int[5];
    for(int i=0; i< prueba.length; i++){
      prueba[i] = (int)(Math.random() * (20 + 1 - 10) + 10);
      System.out.print(prueba[i] + " ");
    }
    int[] minimo= Matematicas.ManipulacionArraysUnidimensionales.rotaDerechaArrayInt(prueba, 2);
    //System.out.println("Finish: " + minimo);
    System.out.println();
    for(int iteration: minimo){
      System.out.print(iteration + " ");
    }
  }
  
  
}
