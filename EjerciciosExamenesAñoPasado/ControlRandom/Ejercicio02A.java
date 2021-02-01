import funcionesAux02A.*;
public class Ejercicio02A{
  public static void main(String [] args){
    int[] premiados = new int[13];
    int[] premios = {1000,500,250,50,50,50,50,50,50,50,50,50,50};
    
    for(int i=0; i<premiados.length; i++){
      premiados[i] = funcionesAux02A.funcionesAux.numeroPremiado(premiados);
    }
    for(int item: premiados) System.out.print(item + " ");
    System.out.print("\nIntroduzca el número de su loteria: ");
    int userInput = Integer.parseInt(System.console().readLine());
    int premio = funcionesAux02A.funcionesAux.premio(premiados,premios,userInput);
    if(premio == 0){
      System.out.print("Lo siento, no ha sido premiado");
    }else{
      System.out.print("Enhorabuena ha ganado " + premio + " euros");
    }
    
  }
}
