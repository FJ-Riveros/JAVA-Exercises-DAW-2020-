public class C06Ejercicio10 {
  public static void main (String [] args) {
    int symbol = 0;
    int longitud = 0;
    String printSymbol = "";
    
    for( int i = 0 ; i < 10; i++){
      longitud = (int)((Math.random() * 40) + 1);
      symbol = (int)((Math.random() * 6) + 1);
      switch ( symbol ){
      case 1: 
        printSymbol = "*";
      break;
      
      case 2: 
        printSymbol = "-";
      break;
      
      case 3: 
        printSymbol = "=";
      break;
      
      case 4: 
        printSymbol = ".";
      break;
      
      case 5: 
        printSymbol = "|";
      break;
      
      case 6: 
        printSymbol = "@";
      break;
      default:
      }
      for( int j = 0; j < longitud; j++){
        System.out.print(printSymbol);
      }
      System.out.println();
    }
  }
}
