/**
 * @Author: FJ-Riveros
 */

public class Ejercicio03{
  public static void main(String[] args){
    //No hace fala un Array de mesas, simplemente uno de capacidades, si se desea
    //añadir una mesa simplemente se añade una nueva capacidad.
    int[] capacidad = {4,4,4,2,2,4,4,6,6,8};
    int[] ocupacion = new int[capacidad.length];
    rellenaMesa(capacidad, ocupacion);
    int input = 0;
    do{
      presentaMesas(capacidad, ocupacion);
      System.out.println();
      System.out.print("¿Cúantos son? (Introduzca -1 para salir del programa): ");
      input = Integer.parseInt(System.console().readLine());
      if(input>0) System.out.println(asignacionMesas(capacidad,ocupacion,input));
      System.out.println();
    }while(input!=-1);
  }
  public static String asignacionMesas(int[] capacidad, int[] ocupacion, int personas){
    String result = "";
    boolean check = false;
    if(personas>8){
      result = "Lo siento, sólo se admiten grupos de hasta 8 personas.";
    }else{
      if(personas==1||personas==2){
        if(compruebaSiEntran(capacidad[3],ocupacion[3], personas)){
          if(ocupacion[3] != 0){
            result = "Tendrán que compartir mesa. ";
          }
          ocupacion[3]+= personas;
          result += "Por favor, siéntense en la mesa número 4.";
          check = true;
        }else if(compruebaSiEntran(capacidad[4],ocupacion[4], personas)){
          if(ocupacion[4] != 0){
            result = "Tendrán que compartir mesa. ";
          }
          ocupacion[4]+= personas;
          result += "Por favor, siéntense en la mesa número 5.";
          check = true;
        }
      }
      if(!check){
        for(int i=0; i<capacidad.length && !check; i++){
          if(compruebaSiEntran(capacidad[i], ocupacion[i], personas)){
            if(ocupacion[i] != 0){
            result = "Tendrán que compartir mesa. ";
            }
            ocupacion[i] += personas;
            result += "Por favor, siéntense en la mesa número " + (i+1) + ".";
            check = true;
          }
        }
      }
      if(!check){
        result = "Lo siento, en estos momentos no queda sitio.";
      }
    }
    return result;
  }
  public static boolean compruebaSiEntran(int capacidad, int ocupacion, int personas){
    if(capacidad-ocupacion>=personas){
      return true;
    }else{
      return false;
    }
  }
  
  public static void rellenaMesa(int[] capacidad, int[] ocupacion){
    for(int i=0; i<capacidad.length; i++){
      ocupacion[i] = (int)(Math.random()*(capacidad[i]+1));
    }
  }
  
  public static int[] addItem(int[] input, int newElement){
    int[] result = new int[input.length+1];
    for(int i=0; i<input.length; i++){
      result[i] = input[i];
    }
    result[result.length-1] = newElement;
    return result;
  }
  
  public static void presentaMesas(int[]capacidad, int[]ocupacion){
    System.out.print("┌");
    System.out.print("─────────┬");
    for(int i=0; i<10; i++){
      for(int j=0; j<5; j++){
        System.out.print("─");
      }
      if(i<= 8){
        System.out.print("┬");
      }
    }
    System.out.print("┐");
    System.out.println();
    //Parte central
    System.out.print("│Mesa nº: │");
    for(int x=0; x<10; x++){
      if(x!=9){
        System.out.print("  " + (x+1) + "  ");
        System.out.print("│");
      }else{
        System.out.print(" " + (x+1) + "  ");
        System.out.print("│");
      }
    }
    System.out.println();
    System.out.print("├");
    System.out.print("─────────┼");
    for(int i=0; i<10; i++){
      for(int j=0; j<5; j++){
        System.out.print("─");
      }
      if(i<9){
        System.out.print("┼");
      }
    }
    System.out.print("┤");
    System.out.println();
    System.out.print("│Ocupación│");
    for(int x=0; x<10; x++){
      System.out.print(" " + ocupacion[x] + "/" + capacidad[x] + " ");
      System.out.print("│");
    }
    System.out.println();
    System.out.print("└");
    System.out.print("─────────┴");
    for(int i=0; i<10; i++){
      for(int j=0; j<5; j++){
        System.out.print("─");
      }
      if(i!= 9){
        System.out.print("┴");
      }
    }
    System.out.print("┘");
  }
}
