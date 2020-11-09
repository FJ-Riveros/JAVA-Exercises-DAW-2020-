public class C06Ejercicio15 {
  public static void main (String [] args){
      int longMelodia = (int)(Math.random() * 7 ) * 4 + 4;
      int notas = 0;
      for( int i = 0; i < longMelodia; i++){
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
        }
      }    
  }
}
