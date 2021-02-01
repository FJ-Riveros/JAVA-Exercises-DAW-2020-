package funcionesAux02A;
public class funcionesAux{
  public static int numeroPremiado(int[] yaPremiados){
    int random = 0;
    boolean repetido = false;
    do{
      repetido = false;
      random = (int)(Math.random()*9998)+1;
      for(int i=0; i<yaPremiados.length; i++){
        if(yaPremiados[i] == random) repetido = true;
      }
    }while(repetido);
    return random;
  }
  
  public static int premio(int[] yaPremiados,int[] premios, int userInput){
    boolean premioGrande = false;
    int premio = 0;
    for(int i=0; i<yaPremiados.length; i++){
      if(yaPremiados[i] == userInput){
        premio = premios[i];
        premioGrande = true;
      }
    }
    if(premioGrande){
      return premio;
    }else if(yaPremiados[0]%10 == userInput%10 || 
    yaPremiados[0]%10 == (int)(userInput/Math.pow(10,(numDigitos(userInput)-1)))){
      return 5;
    }
    return premio;
  }
  
  public static int numDigitos(int num){
    int counter = 0;
    while(num>0){
      counter++;
      num/=10;
    }
    return counter;
  }
}
