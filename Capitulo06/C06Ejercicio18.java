public class C06Ejercicio18{
  public static void main (String [] args){
    int uno = 0;
    int dos = 0;
    int tres = 0;
    int cuatro = 0;
    int cinco = 0;
    int seis = 0;
    int first = 0;
    int second = 0;
    int third = 0;
    for( int i = 0; i < 1000; i++){
      first = (int)(Math.random() * 6) + 1;
      do{
        second = (int)(Math.random() * 6) + 1;
      }while(first == second);
      switch ( first ){
        case 1:
          uno++;
        break;
        
        case 2:
          dos++;
        break;
        
        case 3:
          tres++;
        break;
        
        case 4:
          cuatro++;
        break;
        
        case 5:
          cinco++;
        break;
        
        case 6:
          seis++;
        break;
        default:
      }
      
      switch ( second ){
        case 1:
          uno++;
        break;
        
        case 2:
          dos++;
        break;
        
        case 3:
          tres++;
        break;
        
        case 4:
          cuatro++;
        break;
        
        case 5:
          cinco++;
        break;
        
        case 6:
          seis++;
        break;
        default:
      }
    
      do{
        third = (int)(Math.random() * 6) + 1;
      }while(third == first || third == second);
      
      switch ( third ){
        case 1:
          uno++;
        break;
        
        case 2:
          dos++;
        break;
        
        case 3:
          tres++;
        break;
        
        case 4:
          cuatro++;
        break;
        
        case 5:
          cinco++;
        break;
        
        case 6:
          seis++;
        break;
        default:
      }
    }
      System.out.println("El número 1 se ha repetido " + uno + " veces");
      System.out.println("El número 2 se ha repetido " + dos + " veces");
      System.out.println("El número 3 se ha repetido " + tres + " veces");
      System.out.println("El número 4 se ha repetido " + cuatro + " veces");
      System.out.println("El número 5 se ha repetido " + cinco + " veces");
      System.out.println("El número 6 se ha repetido " + seis + " veces");
  }
}
