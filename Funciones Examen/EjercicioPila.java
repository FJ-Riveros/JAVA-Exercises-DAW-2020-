public class EjercicioPila{
  public static void main(String[] args){
    int input;
    int[] pila = new int[0];
    do{
      presentaMenu();
      input = Integer.parseInt(System.console().readLine());
      if(input != 5){
        switch(input){
          case 1:
            int num = Integer.parseInt(System.console().readLine());
            pila = addItem(pila,num);
          break;
          
          case 2:
            pila = eliminaItem(pila);
          break;
          
          case 3:
            consultarUltimoPila(pila);
          break;
          
          case 4:
            presentaPila(pila);
          break;
          default:
        }
      }else{
        System.out.print("Hasta luego");
      }
    }while(input != 5);
  }
  
  public static void presentaMenu(){
    System.out.println("Elija una opción: ");
    System.out.println("1. Añadir dato. ");
    System.out.println("2. Eliminar dato. ");
    System.out.println("3. Consultar último pila. ");
    System.out.println("4. Presentar pila. ");
    System.out.println("5. Salir. ");
    System.out.println();
  }
  
  public static int[] addItem(int[] input, int num){
    int[] result = new int[input.length+1];
    for(int i=0; i<input.length; i++){
      result[i] = input[i];
    }
    result[result.length-1] = num;
    return result;
  }
  
  public static int[] eliminaItem(int[] input){
    if(input.length>0){
      int[] result = new int[input.length-1];
      for(int i=0; i<input.length-1; i++){
        result[i] = input[i];
      }
      return result;
    }else{
      System.out.println("La matriz ya está vacia");
      return input;
    }
  }
  
  public static void presentaPila(int[] pila){
    if(pila.length>=1){
      for(int item: pila) System.out.print(item + " ");
    }else{
      System.out.println("La matriz está vacia");
    }
    System.out.println();
  }
  
  public static void consultarUltimoPila(int[] pila){
    if(pila.length>=1){
      System.out.print(pila[pila.length-1]);
    }else{
      System.out.println("La matriz está vacia");
    }
    System.out.println();
  }
  
}
