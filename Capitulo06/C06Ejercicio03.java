public class C06Ejercicio03 {
  public static void main (String [] args){
    String result = "";
    int palo = (int)((Math.random()*4) + 1);
    int num = (int)((Math.random()*10) + 1);
    
    switch ( num ){
      case 1:
        result ="As";
      break;
      
      case 8:
        result ="Sota";
      break;
      
      case 9:
        result ="Caballo";
      break;
      
      case 10:
        result ="Rey";
      break;
      default:
        result = String.valueOf(num);
    }
    
    switch ( palo ){
      case 1:
        result = result + " de Bastos";
      break;
      
      case 2:
        result = result + " de Espadas";
      break;
        
      case 3:
        result = result + " de Copas";
      break;
      
      case 4:
        result = result + " de Oro";
      break;
      default:
    }
    System.out.println(result);
  }
}
