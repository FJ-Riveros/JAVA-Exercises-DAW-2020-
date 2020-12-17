/*

@author: Francisco Javier Riveros Racero
Date: 16/12/2020
Turn: 2º

*/

public class Ex25fjrr2 {
  public static void main (String [] args)
    throws InterruptedException {
      String [][] arr = new String[23][60];
      String [] aux = {"F","E","L","I","C","E","S", " ", "F", "I", "E", "S", "T", "A", "S"};
      String [] aux2 = new String[60];
      for(int i = 0; i < 23; i++){
        for(int j = 0; j < 60; j++){
          arr[i][j] = " ";
        }
      }
      int random = 0;
      int counter = 0;
      counter = 0;
        for(int u = 20; u < 35; u++){
          arr[10][20 + counter] = aux[counter++];
        }
      for(int x = 0; x < 23; x++){
        for(int i = 0; i < 60; i++){
          random = (int)(Math.random() * 15);
          if( random == 0 ){
            arr[0][i] = "*";
          }else{
            arr[0][i] = " ";
          }
        }
        for(int y = 0; y < 23; y++){
          for(int k = 0; k < 60; k++){
            System.out.print(arr[y][k]);
          }
        System.out.println();
        }
        Thread.sleep(600);
        for(int y = 22; y > 0; y--){
          for(int k = 0; k < 60; k++){
            aux2[k] = arr[9][k];
            if( y == 11){
              arr[y][k] = aux2[k];
            }else{
              arr[y][k] = arr[y-1][k];
            }
            counter = 0;
            for(int u = 20; u < 35; u++){
              arr[10][20 + counter] = aux[counter++];
            }
          }
        }        
      }
    }
  }

