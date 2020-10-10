public class C04Ejercicio16{
  public static void main (String [] args){
    String response = "";
    int points = 0;
    System.out.println("Test de infidelidad, responda con v (verdadero) o f (falso)");
    System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente");
    response = System.console().readLine();
    if(response.equals("v")){
      points = points + 3;
    }
    System.out.println("Ha aumentado sus gastos de vestuario  ");
    response = System.console().readLine();
    if(response.equals("v")){
      points = points + 3;
    }
    System.out.println("Ha perdido el interés que mostraba anteriormente por ti");
    response = System.console().readLine();
    if(response.equals("v")){
      points = points + 3;
    }
    System.out.println("Ahora se afeita y se asea con más frecuencia(si es hombre) o ahora se arregla el pelo y se asea con más frecuencia(si es mujer)");
    response = System.console().readLine();
    if(response.equals("v")){
      points = points + 3;
    }
    System.out.println("No te deja que mires la agenda de su teléfono móvil");
    response = System.console().readLine();
    if(response.equals("v")){
      points = points + 3;
    }
    System.out.println("A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
    response = System.console().readLine();
    if(response.equals("v")){
      points = points + 3;
    }
    System.out.println("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
    response = System.console().readLine();
    if(response.equals("v")){
      points = points + 3;
    }
    System.out.println("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
    response = System.console().readLine();
    if(response.equals("v")){
      points = points + 3;
    }
    System.out.println("Has notado que últimamente se perfuma más");
    response = System.console().readLine();
    if(response.equals("v")){
      points = points + 3;
    }
    System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
    response = System.console().readLine();
    if(response.equals("v")){
      points = points + 3;
    }
    System.out.println();
    if(points >= 0 && points <= 10){
      System.out.println("!Enhorabuena! tu pareja parece ser totalmente fiel.");
    }else if(points >= 11 && points <= 22){
      System.out.println("Quizás exista el peligro de otra persona de otra persona en su vida o en su");
      System.out.println("mente aunque seguramente será algo sin importancia. No bajes la guardia.");
    }else{
      System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona");
      System.out.println("Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza");
    }
  }
}
