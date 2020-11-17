public class C06Ejercicio32 {
  public static void main(String [] args){
    System.out.print("Introduzca la longitud del sendero en metros: ");
    int longitude = Integer.parseInt(System.console().readLine());
    int obstacleProb = 0;
    int obstacle = 0;
    boolean obstacleCheck = false;
    String obstaclePrint = "";
    int path = 0;
    int space = 0;
    int position = 0;
    for(int i = 0; i < longitude; i++){
      position = (int)(Math.random() * 4) + 1;
      obstacleCheck = false;
      path = (int)(Math.random() * 3);
      obstacleProb = (int)(Math.random() * 2);
      if( obstacleProb == 1 ){
        obstacleCheck = true;
        obstacle = (int)(Math.random() * 2);
        if(obstacle == 0){
          obstaclePrint = "*";
        }else{
          obstaclePrint = "O";
        }
      }
      if( path == 1 ){
        space++;
      }else if( path == 2 && space != 0){
        space--;
      }
      for( int h = 0; h < space; h++){
        System.out.print(" ");
      }
      for(int j = 0; j < 6; j++){
        if( j == 0 || j == 5 ){
          System.out.print("|");
        }else if( obstacleCheck && position == j){
          System.out.print(obstaclePrint);
        }else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
