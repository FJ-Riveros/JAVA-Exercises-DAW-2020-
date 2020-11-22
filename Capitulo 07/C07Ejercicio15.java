public class C07Ejercicio15 {
  public static void main (String [] args){
    int person = 0;
    int[] mesas = new int[10];
    int temp = 0;
    for( int i = 0; i < 10; i++){
      mesas[i] = (int)(Math.random() * 5);
    }
    do{
      System.out.print("Introduzca cuantos comensales son: ");
      person = Integer.parseInt(System.console().readLine());
      if(person > 4 || person < 1 && person != -1){
        System.out.print("Lo siento, no admitimos grupos de " + person + " ,haga grupos de 4 como máximo.   ");
      }else if( person != -1 ){
        //Print
        System.out.print("Nº Mesa   ");
        for( int i = 0; i < 10; i++){
          System.out.print((i + 1) + " ");
        }
        System.out.println();
        System.out.print("Ocupación ");
        for( int i = 0; i < 10; i++){
          System.out.print(mesas[i] + " ");
        }
        System.out.println();
        int counter = 0;
        boolean empty = false;
        while( counter < 10 && empty != true ){
          if( mesas[counter] == 0 ){
            mesas[counter] = person;
            temp = counter;
            empty = true;
          }
          if( !empty ){
            counter++;
          }
        }
        counter = 0;
        boolean aux = false;
        if( !empty ){
          while( counter < 10 && aux != true ){
            if( mesas[counter] + person <= 4 ){
              mesas[counter] += person;
              temp = counter;
              aux = true;
            }
            counter++;
          }
        }
        System.out.println();
        //Print
        System.out.print("Nº Mesa   ");
        for( int i = 0; i < 10; i++){
          System.out.print((i + 1) + " ");
        }
        System.out.println();
        System.out.print("Ocupación ");
        for( int i = 0; i < 10; i++){
          System.out.print(mesas[i] + " ");
        }
        System.out.println();
        System.out.println();
        if( !empty && !aux ){
          System.out.println("Lo siento, no hay sitio libre, venga otro día.");
        }else {
          System.out.println("Por favor, siéntese en la mesa " + (temp + 1));
        }
      }
    }while( person != -1 );
    System.out.println("Gracias, hasta luego");
  }
}
