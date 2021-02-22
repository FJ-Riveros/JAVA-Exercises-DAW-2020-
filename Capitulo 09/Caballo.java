import funcionesCaballo.HelperCaballo;
public class Caballo{
  float altura, peso;
  int edad;
  
  char[] foodEnergy = {'#','#','#','#','#',' ',' ',' ',' ',' '};
  char[] sleepEnergy ={'#','#','#','#','#',' ',' ',' ',' ',' '};
  char[] water = {'#','#','#','#','#',' ',' ',' ',' ',' '};
  
  Caballo(){
    this.altura = (float)0;
    this.peso = (float)0;
    this.edad = -1;
  }
  
  Caballo(float inputAltura){
    this.altura = inputAltura;
    this.peso = (float)0;
    this.edad = -1;
  }
  
  Caballo(float inputAltura, float inputPeso){
    this.altura = inputAltura;
    this.peso = inputPeso;
    this.edad = -1;
  }
  
  Caballo(float inputAltura, float inputPeso, int inputEdad){
    this.altura = inputAltura;
    this.peso = inputPeso;
    this.edad = inputEdad;
  }
  
  
  //Setters
  public void alimentaCaballo(){
    HelperCaballo.aumentaContenidoBarra(this.foodEnergy);
  }
  //Getters
  public String devuelveDatosCaballo(){
    String info = "";
    info = "Altura: " + this.altura + "\n";
    info = info + "Peso: " + this.peso + "\n";
    info = info + "Edad: " + this.edad + "\n";
    return info;
  }
  //Presenta por barras el status del caballo actualmente
  public String presentaStats(){
    String result = "";
    result = String.format("%-14s%10s\n", "Alimentación:",HelperCaballo.contenidoBarra(this.foodEnergy));
    result += String.format("%-14s%10s\n","Descanso:", HelperCaballo.contenidoBarra(this.sleepEnergy));
    result += String.format("%-14s%10s\n","Hidratación: ", HelperCaballo.contenidoBarra(this.water));
    return result;
  }
  
  //Comprueba si se puede aumentar una barra en especial
  public boolean checkAumento(char[] input){
    if(HelperCaballo.checkBarraCompleta(char[] input)) return false;
    return true;
  }
  
  

  
}
