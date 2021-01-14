public class C08Ejercicio55{
  public static void main(String [] args){
    String[] arr = {"hola", "coche", "Coche", "camion", "perro", "perro"};
    String[] result = sinRepetir(arr);
    for(String item: result) System.out.print(item + " ");
  }
  
  /*
   * Esta función devuelve el número de veces que aparece un dígito dentro de 
   * un número.
   * 
   * @param digito            Dígito a comprobar
   * @param n                 Número donde comprobar cuantas veces está el dígito
   * @return                  Número de veces que aparece digito en n.
  */
  public static String[] sinRepetir(String[] s){
    boolean check = false;
    int counter = 0;
    String[] arr = new String[s.length];
    for(int i=0; i<s.length; i++){
      check = false;
      for(int j=0; j<arr.length; j++){
        if(s[i] == arr[j]){
          check = true;
        }
      }
      if(!check) arr[counter++] = s[i];
    }
    String[] result = new String[counter];
    for(int i=0; i<counter; i++){
      result[i] = arr[i];
    }
    return result;
  }
}
