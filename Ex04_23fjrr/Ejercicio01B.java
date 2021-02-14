/**
 * @Author: FJ-Riveros
 */
import FuncionesAuxCuenta.FuncionesCuenta;
public class Ejercicio01B{
  public static void main(String[] args){
    final int SIZE = 5;
    String[] Titulares = new String[SIZE];
    double[] Saldos = new double[SIZE];
    double inputUser = 0;
    String nombreUsuarios = "";
    int inputMenu = -1;
    for(int i=0; i<SIZE; i++){
      System.out.print("Indique el nombre del titular " + (i+1) + ": ");
      nombreUsuarios = System.console().readLine();
      Titulares[i] = nombreUsuarios;
      System.out.print("Indique el saldo de " + nombreUsuarios + ":");
      Saldos[i] = Double.parseDouble(System.console().readLine());
    }
    do{
      presentaMenu();
      inputMenu = Integer.parseInt(System.console().readLine());
      if(inputMenu!=6){
        String titular = "";
        double cantidad = 0;
        switch(inputMenu){
          case 1:
            System.out.print(FuncionesAuxCuenta.FuncionesCuenta.informeCuentas(Titulares, Saldos));
          break;
          
          case 2:
            System.out.print("Indique el titular de la cuenta: ");
            titular = System.console().readLine();
            if(FuncionesAuxCuenta.FuncionesCuenta.informeTitular(titular, Titulares, Saldos) == ""){
              System.out.print("No se encuentra el titular.");
            }else{
              System.out.println(FuncionesAuxCuenta.FuncionesCuenta.informeTitular(titular, Titulares, Saldos));
            }
          break;
          
          case 3:
            System.out.print("Indique el titular de la cuenta: ");
            titular = System.console().readLine();
            System.out.print("Indique la cantidad a ingresar: ");
            cantidad = Double.parseDouble(System.console().readLine());
            if(FuncionesAuxCuenta.FuncionesCuenta.ingreso(titular, cantidad, Titulares,Saldos)){
              System.out.print("Operación realizada satisfactoriamente: ");
            }else{
              System.out.print("No se ha podido realizar la operación: ");
            }
            
          break;
          
          case 4:
            System.out.print("Indique el titular de la cuenta: ");
            titular = System.console().readLine();
            System.out.print("Indique la cantidad a extraer: ");
            cantidad = Double.parseDouble(System.console().readLine());
            if(FuncionesAuxCuenta.FuncionesCuenta.retirada(titular, cantidad, Titulares, Saldos)){
              System.out.print("Operación realizada satisfactoriamente: ");
            }else{
              System.out.println("No se ha podido realizar la operación. ");
            }
          break;
          
          case 5:
            System.out.print("Indique el titular de la cuenta de origen: ");
            String titularOrigen = System.console().readLine();
            System.out.print("Indique el titular de la cuenta de destino: ");
            String titularDestino = System.console().readLine();
            System.out.print("Indique la cantidad a transferir: ");
            cantidad = Double.parseDouble(System.console().readLine());
            if(FuncionesAuxCuenta.FuncionesCuenta.traspaso(titularOrigen, titularDestino, cantidad, Titulares, Saldos)){
              System.out.print("Operación realizada satisfactoriamente: ");
            }else{
              System.out.print("No se ha podido realizar la operación: ");
            }
          break;
          default:
        }
      }
    }while(inputMenu != 6);
  }
  
  
  public static void presentaMenu(){
    System.out.println("¿Qué desea hacer?");
    System.out.println("1. Presentar saldos de todas las cuentas");
    System.out.println("2. Presentar el saldo de una cuenta");
    System.out.println("3. Ingresar dinero en una cuenta");
    System.out.println("4. Retirar dinero de una cuenta");
    System.out.println("5. Traspasar dinero entre cuentas");
    System.out.println("6. Salir");
  }
}
