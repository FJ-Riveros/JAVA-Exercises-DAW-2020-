package funcionesAux03;
public class funcionesAuxiliares03{
  public static boolean divisorPropio(long divisor, long num){
    if(num%divisor == 0 && num!= divisor) return true;
    return false;
  }
  
  public static long sumaDivisoresPropios(long num){
    long result = 0;
    for(int i=1; i<num; i++){
      if(divisorPropio(i, num)) result+=i;
    }
    return result;
  }
  
  public static boolean esPerfecto(long num){
    if(sumaDivisoresPropios(num) == num) return true;
    return false;
  }
}
