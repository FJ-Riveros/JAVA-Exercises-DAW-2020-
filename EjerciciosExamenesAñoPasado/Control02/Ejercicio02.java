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
    long sum=4;
    for(long x=2; x<num; x++){
      sumBefore+= x-1;
      sumAfter=x+1;
      sum=sumAfter+1;
      while(sumAfter < sumBefore){
        sumAfter+= sum;
        sum++;
      }
      if(sumAfter==sumBefore){
        System.out.println("Centro numérico: " + x);
      }
    }
  }
}
