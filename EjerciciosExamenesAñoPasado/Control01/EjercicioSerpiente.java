public class EjercicioSerpiente{
  public static void main( String [] args){
  System.out.println("Este programa dibuja un gusano en la pantalla");
  System.out.println("Controles: j= Abajo izquierda.  k= Abajo. l= Abajo derecha");
  System.out.println("Presione 's' para salir");
  int pos = 0;
  char userInput = 'a';
  while(userInput != 's'){
   for(int i = 0; i < pos; i++){
        System.out.print(" ");
      }
  System.out.print("*");
    for(int j = pos; j < 20; j++){
      System.out.printf(" ");
    }
  System.out.print("¿j,k,l,s?: ");
  userInput = System.console().readLine().charAt(0);
  switch(userInput){
    case 'j':
      pos = pos > 0 ? pos - 1 : pos;
      break;
    
    case 'l':
      pos = pos < 10 ? pos + 1 : pos;
      break;
      
    case 'k':
      break;
    
    case 's':
      System.out.println();
      System.out.println("El programa se cerrará");
      break;
      
    default:
      System.out.println("Comando no deseado");
  }
 
  }
}
}
