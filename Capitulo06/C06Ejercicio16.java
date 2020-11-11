public class C06Ejercicio16 {
  public static void main (String [] args){
    int tirada = 0;
    String result = "";
    for( int i = 0; i < 3; i++){
      tirada = (int)(Math.random() * 5) + 1;
      switch (tirada) {
        case 1:
          result += "corazón ";
        break;
      
        case 2:
          result += "diamante ";
        break;
      
        case 3:
          result += "herradura ";
        break;
      
        case 4:
          result += "campana ";
        break;
      
        case 5:
          result += "limón ";
        break;
      }
    }
    System.out.println(result);
  }
}
