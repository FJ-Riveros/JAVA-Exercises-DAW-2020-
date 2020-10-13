public class C04Ejercicio23 {
  public static void main (String [] args){
    float baseImponible;
    String iva = "";
    int realIva = 0;
    double ivaAplicado = 0;
    String promocion = "";
    double resultadoPromocion = 0;
    System.out.print("Introduzca la base imponible: ");
    baseImponible = Float.parseFloat(System.console().readLine());
    System.out.println();
    System.out.print("Introduzca el tipo de IVA ( general, reducido o superreducido): ");
    iva = System.console().readLine();
    System.out.println();
    System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
    promocion = System.console().readLine();
    switch (iva){
      
      case "general":
        realIva = 21;
        ivaAplicado = baseImponible * 0.21;
      break;
      
      case "reducido":
        realIva = 10;
        ivaAplicado = baseImponible * 0.10;
      break;
      
      case "superreducido":
        realIva = 4;
        ivaAplicado = baseImponible * 0.04;
      break;
      
      default:
    }
    
    switch (promocion){
      
      case "nopro":
      
      break;
      
      case "mitad":
        resultadoPromocion = -((baseImponible + ivaAplicado) / 2);
      break;
      
      case "meno5":
        resultadoPromocion = -5;
      break;
      
      case "5porc":
        resultadoPromocion = -((baseImponible + ivaAplicado) * 0.05);
      break;
      
      default:
    }
    System.out.println();
    System.out.println(" Base imponible" + "       " + baseImponible);
    System.out.println(" IVA " + "(%" + realIva + ")" + "            " + ivaAplicado);
    System.out.println(" Precio con IVA" + "       " + (baseImponible + ivaAplicado));
    System.out.println(" Cod. promo.(" + promocion + ")  " + resultadoPromocion);
    System.out.println(" Base imponible" + "       " + ((baseImponible + ivaAplicado) + resultadoPromocion));
  }
}
