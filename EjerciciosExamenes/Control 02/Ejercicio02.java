public class Ejercicio02 {
  public static void main (String [] args){
    System.out.print("Este programa calcula CENTROS NUMÉRICOS");
    long num = 0;
    do{
      System.out.print("Indique hasta que número desea procesar: ");
      num = Long.parseLong(System.console().readLine());
      if(num <2){
        System.out.print("Incorrecto. ");
      }
    }while(num<2);
    int sum=0;
    for(int i=2;i<num;i++){
      for(int j=1;j<i;j++){
        
      }
      sum+=i;
    }
  }
}
