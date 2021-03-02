import CuentaAux.FuncionesAux;
public class Ejercicio1{
  public static void main(String[] args){
    final int arrSize = 5;
    String[] titulares = new String[arrSize];
    float[] saldo = new float[arrSize];
    String nombreCuenta = "";
    float saldoCuenta = 0;
    for(int i=0; i<arrSize; i++){
      System.out.print("Introduzca el nombre de la cuenta " + (i+1) + ":");
      titulares[i] = System.console().readLine();
      System.out.print("Introduzca el saldo de " + titulares[i] + ":");
      saldo[i] = Float.parseFloat(System.console().readLine());
    }
    int input = 0;
    String nombreTitularOrigen = "";
    String nombreTitularDestino = "";
    float cantidad = 0;
    do{
      presentaMenu();
      input = Integer.parseInt(System.console().readLine());
      switch(input){
        case 1:
          System.out.println(FuncionesAux.informeCuentas(titulares, saldo));
        break;
        
        case 2:
          System.out.print("Introduzca el nombre del titular que desee: ");
          nombreTitularOrigen = System.console().readLine();
          if(!(FuncionesAux.informeTitular(nombreTitularOrigen, titulares, saldo).equals(""))){
            System.out.println(FuncionesAux.informeTitular(nombreTitularOrigen, titulares, saldo));
          }else{
            System.out.println("El titular que ha introducido no existe.");
          }
        break;
        
        case 3:
          System.out.print("Introduzca el nombre del titular que desee: ");
          nombreTitularOrigen = System.console().readLine();
          if(FuncionesAux.indexUsuario(titulares, nombreTitularOrigen) != -1){
            System.out.print("Introduzca la cantidad a ingresar: ");
            cantidad = Float.parseFloat(System.console().readLine());
            FuncionesAux.ingreso(nombreTitularOrigen, cantidad, titulares, saldo);
            System.out.println("Se ha hecho el ingreso con éxito.");
          }else{
            System.out.println("El titular que ha introducido no existe.");
          }
        break;
        
        case 4:
          System.out.print("Introduzca el nombre del titular que desee: ");
          nombreTitularOrigen = System.console().readLine();
          int indexUser = FuncionesAux.indexUsuario(titulares, nombreTitularOrigen);
          if( indexUser!= -1 ){
            System.out.print("Introduzca la cantidad a retirar: ");
            cantidad = Float.parseFloat(System.console().readLine());
            if(FuncionesAux.checkRetirada(saldo[indexUser], cantidad)){
              FuncionesAux.retirada(nombreTitularOrigen, cantidad, titulares, saldo);
              System.out.println("Se ha retirado con éxito.");
            }else{
              System.out.println("No hay dinero suficiente en la cuenta para retirar.");
            }
          }else{
            System.out.println("El titular que ha introducido no existe.");
          }
        break;
        
        case 5:
          System.out.print("Introduzca el nombre del titular que hace la transferencia: ");
          nombreTitularOrigen = System.console().readLine();
          int indexUserOrigen = FuncionesAux.indexUsuario(titulares, nombreTitularOrigen);
          if( indexUserOrigen!= -1 ){
            System.out.print("Introduzca el nombre del titular de destino: ");
            nombreTitularDestino = System.console().readLine();
            int indexUserDestino = FuncionesAux.indexUsuario(titulares, nombreTitularDestino);
            if(indexUserDestino != 1){
              System.out.print("Introduzca la cantidad a traspasar: ");
              cantidad = Float.parseFloat(System.console().readLine());
              if(FuncionesAux.checkRetirada(saldo[indexUserOrigen], cantidad)){
                FuncionesAux.retirada(nombreTitularOrigen, cantidad, titulares, saldo);
                FuncionesAux.ingreso(nombreTitularDestino, cantidad, titulares, saldo);
                System.out.println("Se ha traspasado con éxito.");
              }else{
                System.out.println("No hay dinero suficiente en la cuenta para traspasar.");
              }
            }else{
              System.out.println("El titular de destino no existe.");
            }
          }else{
            System.out.println("El titular de origen no existe.");
          }
        break;
        
        default:
      }
    }while(input!=6);
    
  }
  
  public static void presentaMenu(){
    System.out.println("1.Presenta el saldo de todas las cuentas.");
    System.out.println("2.Presenta el saldo de una cuenta.");
    System.out.println("3.Ingresar dinero en una cuenta.");
    System.out.println("4.Retirar dinero de una cuenta.");
    System.out.println("5.Traspasar dinero entre cuentas.");
    System.out.println("6.Salir");
  }
}
