public class EjercicioPropio01 {
  public static void main (String [] args){
    System.out.print("Introduzca un número, del cual se hará un cuadrado(>=3): ");
    int input = Integer.parseInt(System.console().readLine());
    String[][] arr = new String[input][input];
    for(int i=0;i<input;i++){
      for(int j=0;j<input;j++){
        arr[i][j]="*";
      }
    }
    for(int i=0;i<input;i++){
      for(int j=0;j<input;j++){
        System.out.print(arr[i][j]);
      }
      System.out.println();
    }
    if( input%2==0 ){
      System.out.print("\nIntroduzca la cantidad de capas que desea rebajar: ");
      int capas = Integer.parseInt(System.console().readLine());
      if(((input /2)-1) < capas){
        do{
          capas--;
        }while(((input /2)-1) < capas);
      }
      for(int capa=0;capa<capas;capa++){
        for(int i=0;i<input;i++){
          arr[capa][i]="";
          arr[input-1-capa][i]="";
          arr[i][capa]="";
          arr[i][input-1-capa]="";
        }
      }
    }else{
      System.out.println("Impar");
    }
    for(int i=0;i<input;i++){
      for(int j=0;j<input;j++){
        System.out.print(arr[i][j]);
      }
      System.out.println();
    }
  }
}
