public class ConcatenacionArrays{
  public static void main( String [] args){
    System.out.print("Introduzca el tamaño del Array 1: ");
    final int arrx = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el tamaño del Array 2: ");
    final int arr1x = Integer.parseInt(System.console().readLine());
    int [] arrFirst = new int[arrx];
    int [] arrSecond = new int[arr1x];
    int [] arrConcat = new int[arrx + arr1x];
    for(int i = 0; i< arrFirst.length; i++){
      arrFirst[i] = 6;
      System.out.print(arrFirst[i]);
    }
    System.out.println();
    for(int i = 0; i< arrSecond.length; i++){
      arrSecond[i] = 1;
      System.out.print(arrSecond[i]);
    }
    System.out.println();
    for( int i = 0; i < arrx+arr1x; i++){
      if(i<arrFirst.length){
        arrConcat[i] = arrFirst[i];
      }else{
        arrConcat[i] = arrSecond[i - arrFirst.length];
      }
      System.out.print(arrConcat[i]);
    }
  }
}
