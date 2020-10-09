public class C04Ejercicio10{
  public static void main (String [] args){
    String mes;
    int dia;
    String signo = "";
    System.out.println("Este programa le dice su signo del zodíaco");
    System.out.println("Introduzca el dia de nacimiento");
    dia = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca el mes de nacimiento");
    mes = System.console().readLine();
    if((dia >= 22 && mes.equals("diciembre")) || (dia <=20 && mes.equals("enero"))){
      signo = "Capricornio";
    }else if((dia >= 21 && mes.equals("enero")) || (dia <=19 && mes.equals("febrero"))){
      signo = "Acuario";
    }else if((dia >= 20 && mes.equals("febrero")) || (dia <=20 && mes.equals("marzo"))){
      signo = "Piscis";
    }else if((dia >= 21 && mes.equals("marzo")) || (dia <=20 && mes.equals("abril"))){
      signo = "Aries";
    }else if((dia >= 21 && mes.equals("abril")) || (dia <=21 && mes.equals("mayo"))){
      signo = "Tauro";
    }else if((dia >= 22 && mes.equals("mayo")) || (dia <=21 && mes.equals("junio"))){
      signo = "Géminis";
    }else if((dia >= 22 && mes.equals("junio")) || (dia <=23 && mes.equals("julio"))){
      signo = "Cáncer";
    }else if((dia >= 24 && mes.equals("julio")) || (dia <=23 && mes.equals("agosto"))){
      signo = "Leo";
    }else if((dia >= 24 && mes.equals("agosto")) || (dia <=23 && mes.equals("septiembre"))){
      signo = "Virgo";
    }else if((dia >= 24 && mes.equals("septiembre")) || (dia <=23 && mes.equals("octubre"))){
      signo = "Libra";
    }else if((dia >= 24 && mes.equals("octubre")) || (dia <=22 && mes.equals("noviembre"))){
      signo = "Escorpio";
    }else if((dia >= 23 && mes.equals("noviembre")) || (dia <=21 && mes.equals("diciembre"))){
      signo = "Sagitario";
    }
    System.out.println("Tu signo del zodíaco es: " + signo);
  }
}
