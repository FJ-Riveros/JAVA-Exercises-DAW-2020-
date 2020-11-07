public class C06Ejercicio02 {
  public static void main (String [] args){
    int paloRandom = (int)((Math.random()*4) + 1);
    String result = "";
    int carta = (int)((Math.random()*13) + 1);
        switch (carta){
        case 1:
          result = "A";
        break;
        
        case 11:
          result = "J";
        break;
        
        case 12:
          result = "Q";
        break;
        
        case 13:
          result = "K";
        break;
        default:
          result = String.valueOf(carta);
      }  
    
    switch( paloRandom ){
      case 1:
        result = result + " de picas";
      break;
      
      case 2:
        result = result + " de corazones";
      break;
      
      case 3:
        result = result + " de diamantes";
      break;
      
      case 4:
        result = result + " de tréboles";
      break;
      default:
    }
    System.out.println("La carta al azar es: " + result);
  }  
}
