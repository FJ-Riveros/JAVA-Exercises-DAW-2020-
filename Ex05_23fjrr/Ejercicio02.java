/**
 * @Author: FJ-Riveros
 */
import OperacionesNumericas.Funciones;
public class Ejercicio02{
  public static void main(String[] args){
    int[] a = {3,8,1,9,33,3,9,10,12};
    //int[] a = {11,7,5,21};
    int[] pares = Funciones.extraePares(a);
    for(int item: pares) System.out.print(item + " ");
    System.out.println();
    int[] impares = Funciones.extraeImpares(a);
    for(int item: impares) System.out.print(item + " ");
    System.out.println();
    int[] coloca = Funciones.colocaParesEImpares(a);
    for(int item: coloca) System.out.print(item + " ");
  }
}
