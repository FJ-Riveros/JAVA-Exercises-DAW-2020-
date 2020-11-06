public class C06Ejercicio02 {
  public static void main (String [] args){
    int paloRandom = (int)((Math.random()*3) + 1);
    String result = "";
    int carta = (int)((Math.random()*12) + 1);
    
    if( carta == 1 || carta < 10 ){
      switch (carta){
        
        case 1:
          result = String.valueOf(carta);
        break;
        
        case 11:
          result = String.valueOf(carta);
        break;
        
        case 12:
          result = String.valueOf(carta);
        break;
        
        case 13:
          result = String.valueOf(carta);
        break;
      }  
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
    }
    System.out.println("La carta al azar es : " + result);
  }  
}
