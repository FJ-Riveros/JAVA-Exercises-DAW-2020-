public class Examen01Ejercicio02 {
  public static void main ( String [] args ) {
  int h;
  String orientacion;
  String primerCaracter;
  String segundoCaracter;
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
  primerCaracter = System.console().readLine();
  System.out.println(primerCaracter);
  
  System.out.println("Introduzca el segundo caracter: ");
  segundoCaracter = System.console().readLine();
  System.out.println(segundoCaracter);
  int reductor = 0;
  //Introducir un for aquí para hacer las iteraciones de la altura y imprimir cada fila
  for(int j = 0; j < h;j++){
  for( int i = h - reductor; i > 0; i--){
    System.out.print("-");
  }
  System.out.print("*\n");
  reductor++;
}
}
}
