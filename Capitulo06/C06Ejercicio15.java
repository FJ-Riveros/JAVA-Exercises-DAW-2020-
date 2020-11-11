public class C06Ejercicio15 {
  public static void main (String [] args){
    int longMelodia = (int)(Math.random() * 7 ) * 4 + 4;
    int notas = 0;
    String nota = "";
    String result = "";
    for( int i = 1; i <= longMelodia; i++){
      notas = (int)((Math.random() * 8) + 1);
      switch( notas ){
        case 1:
          nota = "do";
        break;
          
        case 2:
          nota = "re";
        break;
          
        case 3:
          nota = "mi";
        break;
          
        case 4:
          nota = "fa";
        break;
          
        case 5:
          nota = "sol";
        break;
          
        case 6:
          nota = "la";
        break;
          
        case 7:
          nota = "si";
        break;
        default:
      }
      if( i == longMelodia ){
        result += nota + " ||";
      }else{
        if( i % 4 != 0 ){
          result += nota + " ";
        }else{
          result += nota + " | ";
        }
      }
    }
    System.out.println(result);    
  }
}
