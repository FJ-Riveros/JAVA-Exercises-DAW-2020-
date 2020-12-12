public class Ejercicio02 {
  public static void main (String [] args){
    System.out.print("Este programa calcula CENTROS NUMÉRICOS\n");
    long num = 0;
    do{
      System.out.print("Indique hasta que número desea procesar: ");
      num = Long.parseLong(System.console().readLine());
      if(num <2){
        System.out.print("Incorrecto. ");
      }
    }while(num<2);
    long sumAfter=0;
    long sumBefore=0;
    long center=2;
    for(long x=2; x<num; x++){
      sumAfter=0;
      sumBefore=0;
      for(long i=1; i<x; i++){
        sumBefore+=i;
      }
      for(long j=x+1; j<num; j++){
        sumAfter+=j;
        if(sumAfter==sumBefore){
          System.out.println("Centro numérico: " + x);
        }
      }
    }
  }
}
