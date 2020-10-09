public class C04Ejercicio12 {
  public static void main(String [] args){
    char response;
    int points = 0;
    System.out.println("Mini test sobre binarios");
    System.out.println("Responde con v de verdadero o f de falso después de cada pregunta");
    System.out.println("Pregunta 1: El número binario 11001 equivale a 21 en decimal");
    response = System.console().readLine().charAt(0);
    if( response == 'v'){
      points++;
    }
    System.out.println("Pregunta 2: El número decimal 128 corresponde al 10000000");
    response = System.console().readLine().charAt(0);
    if( response == 'v'){
      points++;
    }
    System.out.println("Pregunta 3: El sistema binario es un sistema de base 3");
    response = System.console().readLine().charAt(0);
    if( response == 'f'){
      points++;
    }
    System.out.println("Pregunta 4: En el sisema binario no se pueden poner decimales");
    response = System.console().readLine().charAt(0);
    if( response == 'f'){
      points++;
    }
    System.out.println("Pregunta 5: El sistema binario trabaja con múltiplos de 3");
    response = System.console().readLine().charAt(0);
    if( response == 'f'){
      points++;
    }
    System.out.println("Pregunta 6: El número decimal -200 codificado en binario C2 es igual que en binario puro");
    response = System.console().readLine().charAt(0);
    if( response == 'f'){
      points++;
    }
    System.out.println("Pregunta 7: Se pueden realizar sumas y restas en binario");
    response = System.console().readLine().charAt(0);
    if( response == 'v'){
      points++;
    }
    System.out.println("Pregunta 8: La suma de los números binarios 1100 y 11 es 1111");
    response = System.console().readLine().charAt(0);
    if( response == 'v'){
      points++;
    }
    System.out.println("Pregunta 9: La codificación binaria empaquetada existe");
    response = System.console().readLine().charAt(0);
    if( response == 'v'){
      points++;
    }
    System.out.println("Pregunta 10: La codificación binaria rápida existe");
    response = System.console().readLine().charAt(0);
    if( response == 'f'){
      points++;
    }
    System.out.println("Usted ha obtenido " + points + " respuestas correctas en el test");
  }
}
