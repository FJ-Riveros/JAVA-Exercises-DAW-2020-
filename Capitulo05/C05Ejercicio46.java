public class C05Ejercicio46 {
  public static void main (String [] args){
    System.out.print("Introduzca la anchura del rectángulo (como mínimo 2): ");
    int w = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la altura del rectángulo (mínimo 2): ");
    int h = Integer.parseInt(System.console().readLine());
    if(w >= 2 && h >= 2){
      for(int i = 0; i < h; i++){
        for(int j = 0; j < w; j++){
          if(i == 0 || i == h - 1){
            System.out.print("*");
          }else{
            if(j == 0 || j == w - 1){
              System.out.print("*");
            }else{
              System.out.print(" ");
            }
          }
        }
        System.out.println();
      }
    }else{
      System.out.println("Error, los valores mínimos son 2 altura y 2 de anchura");
    }
  }
}
