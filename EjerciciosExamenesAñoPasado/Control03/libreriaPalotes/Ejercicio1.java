//package libreriaPalotes;
public class Ejercicio1{
  public static void main(String [] args){
    System.out.print(conviertePalotesEnDecimal("|-||-|||-"));
  }


  public static int conviertePalotesEnDecimal(String inputPalotes){
    //System.out.print(inputPalotes.length());
    int counterDigito = 0;
    int numeroResultado = 0;
    /*for(int i=0; i<inputPalotes.length(); i++){
      if(inputPalotes.charAt(i) != '-' && i!=inputPalotes.length()-1){
        System.out.println("Ocurro en " + i);
        counterDigito++;
      }else{
        if(i==inputPalotes.length()-1 && inputPalotes.charAt(i)!= '-') counterDigito++;
        numeroResultado = (numeroResultado * 10) + counterDigito;
        System.out.println("Digito en " + i + "numero que creo " + numeroResultado);
        counterDigito = 0;
      }
    }*/
    //Suma uno de más
    char siguienteChar = 'x';
    for(int i=0; i<inputPalotes.length(); i++){
       siguienteChar = i!=(inputPalotes.length()-1) ? inputPalotes.charAt(i+1) : '0';
      if(siguienteChar == '-'){
        if(inputPalotes.charAt(i) != '-')counterDigito++;
        numeroResultado = (numeroResultado * 10) + counterDigito;
        System.out.println("Digito en " + i + "numero que creo " + numeroResultado);
        counterDigito = 0;
      }else if(siguienteChar == '0' && inputPalotes.charAt(i) == '-'){
        numeroResultado = (numeroResultado * 10) + counterDigito;
        counterDigito = 0;
        }else{
        counterDigito++;
      }
    }
    return numeroResultado;
  }
}
