public class Ejercicio01 {
  public static void main (String [] args){
    int h = 0;
    int dist = 0;
    System.out.print("Este programa dibuja un triángulo dentro de otro.\n");
    do{
      System.out.print("Indica la altura(>=3): ");
      h = Integer.parseInt(System.console().readLine());
      if(h<3){ 
        System.out.print("Incorrecto. ");
      }
    }while(h < 3);
    
    do{
      System.out.print("Indica el margen(>=1): ");
      dist = Integer.parseInt(System.console().readLine());
      if(dist<1){
        System.out.print("Incorrecto. ");
      }
    }while(dist<1);
    for(int i=0;i<h;i++){
      for(int j=0;j<h-i-1;j++){
        System.out.print(" ");
      }
      for(int x=0;x<(i*2)+1;x++){
        if((i*2)+1>dist*2 && i>=dist && h-i>dist && x>dist-1 && x<((i*2)+1)-dist){
          System.out.print(" ");
        }else{
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }
}
