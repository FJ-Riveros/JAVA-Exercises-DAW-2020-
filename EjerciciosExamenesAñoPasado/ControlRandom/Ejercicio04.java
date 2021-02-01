public class Ejercicio04{
  public static void main(String[] args){
    int input = 0;
    String[] information = new String[100];
    for(int i=0; i<information.length; i++){
      information[i] = " ";
    }
    do{
      System.out.print("Introduzca un número entre 1-100(incluidos), -1 para salir: ");
      input = Integer.parseInt(System.console().readLine());
      if(input >= 1 && input <=100){
        information[input] += "*";
        for(int i=0; i<information.length; i++){
          if(information[i] != " "){
            System.out.printf("%6d:%s\n",i, information[i]);
          }
        }
      }else if(input!=-1){
        System.out.print("El número introducido no es válido. ");
      }
    }while(input!=-1);
  }
}
