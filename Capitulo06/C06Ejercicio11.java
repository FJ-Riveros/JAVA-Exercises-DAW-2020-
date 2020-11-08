public class C06Ejercicio11 {
  public static void main (String [] args){
    int note = 0;
    int suspensos = 0;
    int suficiente = 0;
    int bien = 0;
    int notable = 0;
    int sobresaliente = 0;
    for( int i = 0; i < 20; i++){
      note = (int)(Math.random() * 11);
      System.out.print(note + " ");
      if( note < 5 ){
        suspensos++;
      }else if( note < 6 && note >= 5){
        suficiente++;
      }else if( note < 7 && note >= 6){
        bien++;
      }else if( note >= 7 && note < 9 ){
        notable++;
      }else if ( note >= 9 && note <= 10){
        sobresaliente++;
      }
    }
    System.out.println();
    System.out.println("Tenemos " + suspensos + " suspensos," + suficiente + " suficientes," + bien + " bien," + notable + "notables y " + sobresaliente + " sobresalientes."); 
  }
}
