public class Examen01Ejercicio02 {
  public static void main ( String [] args ) {
  int h;
  String orientacion;
  char primerCaracter;
  char segundoCaracter;
  System.out.println("Este programa pinta piramides");
  do{
  System.out.print("Introduzca la altura (1-10): ");
  h = Integer.parseInt(System.console().readLine());
  System.out.println(h);
  }
  while((h > 10) || (h < 1));
  
  do{
    System.out.println("Introduzca la orientación: izquierda, derecha, arriba, abajo");
    orientacion = System.console().readLine();
  }while(!(orientacion.equals("izquierda") || orientacion.equals("derecha") || orientacion.equals("arriba") 
  || orientacion.equals("abajo")));
  
  System.out.println("Introduzca el primer caracter: ");
  primerCaracter = System.console().readLine().charAt(0);
  System.out.println(primerCaracter);
  
  System.out.println("Introduzca el segundo caracter: ");
  segundoCaracter = System.console().readLine().charAt(0);
  System.out.println(segundoCaracter);
  //Introducir un for aquí para hacer las iteraciones de la altura y imprimir cada fila
  switch (orientacion){
    
    case "arriba":
      for(int j = 0; j < h;j++){
        for(int i = 0; i < h - j - 1; i++){
          System.out.print(" ");
        }
        for(int i = 0; i < j * 2 + 1; i++){
          if( i % 2 == 0){
            System.out.print(primerCaracter);
          }
          else{
            System.out.print(segundoCaracter);
          }
        }
        System.out.println();
      }
    break;
    
    case "abajo":
    
      for(int i = h; i > 0; i--){
        for(int j = 10; j > i; j--){
          
        }
      }
    break;
  }
}
}
