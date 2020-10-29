public class EjercicioExamen03 {
  public static void main (String [] args){
    int numero;
    int desplazamiento;
    int longitud = 0;
    System.out.print("Introduzca un número: ");
    numero = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el número de posiciones a rotar a la derecha: ");
    desplazamiento = Integer.parseInt(System.console().readLine());
    int aux = numero;
    while( aux > 0 ){
      longitud++;
      aux /= 10;
    }
    
    for( int i = 0; i < desplazamiento; i++){
      aux = numero % 10;
      numero /= 10;
      for( int j = 0; j < longitud - 1; j++){
        aux *= 10;
      }
      numero = aux + numero;
    }
    System.out.println(numero);
  }
}
