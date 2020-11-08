public class C06Ejercicio12 {
  public static void main (String [] args){
    //NOT FINISHED
    for( int i = 0; i < 40; i++){
      for(int j = 0; j < 70; j++){
        System.out.print("\033[32m");
        if( j % 2 == 0 ){
          System.out.print((char)((Math.random() * (126 - 32 + 1) + 32)));
        }else{
          System.out.print("  ");
        }  
      }
      System.out.println();
    }
  }
}
