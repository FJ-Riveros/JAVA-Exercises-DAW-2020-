public class C04Ejercicio24 {
  public static void main (String [] args){
    int cargo;
    int viajes;
    int estadoCivil;
    float sueldoBase = 0;
    int irpf = 0;
    double retencionIrpf = 0;
    System.out.println("1 - Programador Junior");
    System.out.println("2 - Programador Senior");
    System.out.println("3 - Jefe de proyecto");
    System.out.print("Introduzca el cargo del empleado (1 - 3) ");
    cargo = Integer.parseInt(System.console().readLine());
    System.out.println();
    System.out.print("¿Cuantos días ha estado de viaje visitando clientes? ");
    viajes = Integer.parseInt(System.console().readLine());
    System.out.println();
    System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): "); 
    estadoCivil = Integer.parseInt(System.console().readLine());
    System.out.println();
    switch (cargo) {
      case 1:
        sueldoBase = 950;
      break;
        
      case 2:
        sueldoBase = 1200;
      break;
      
      case 3:
        sueldoBase = 1600;
      break;
      
      default:
    }
    if( estadoCivil == 1 ){
      irpf = 25;
    }else {
      irpf = 20;
    }
    retencionIrpf = ((( viajes * 30) + sueldoBase) * irpf) /  100;
    System.out.printf(" %s \n", "--------------------------------------");
    System.out.println("| Sueldo Base                " + sueldoBase + "   |");
    System.out.println("| Dietas " + "(" + viajes + ")                 " +  (viajes * 30) + "      |");
    System.out.printf(" %s \n", "--------------------------------------");
    System.out.println("| Sueldo bruto               " + (( viajes * 30) + sueldoBase + "   |"));
    System.out.println("| Rentención IRPF " + "(" + irpf + ")       " + retencionIrpf + "    |");
    System.out.printf(" %s \n", "--------------------------------------");
    System.out.println("| Sueldo neto                " + ((( viajes * 30) + sueldoBase) - retencionIrpf) + "   |");
    System.out.printf(" %s \n", "--------------------------------------");
  }
}
