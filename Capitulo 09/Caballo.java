import funcionesCaballo.HelperCaballo;
public class Caballo{
  float altura, peso;
  int edad;
  
  char[] foodEnergy = {'▓','▓','▓','▓','▓','░','░','░','░','░'};
  char[] sleepEnergy ={'▓','▓','▓','▓','▓','░','░','░','░','░'};
  char[] water = {'▓','▓','▓','▓','▓','░','░','░','░','░'};
  
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
    result += String.format("\n%-14s%10s\n","Descanso:", HelperCaballo.contenidoBarra(this.sleepEnergy));
    result += String.format("\n%-14s%10s\n","Hidratación: ", HelperCaballo.contenidoBarra(this.water));
    return result;
  }
  
  //Comprueba si se puede aumentar una barra en especial
  public boolean checkAumento(String input){
    char[] choose;
    if(input == "Comida"){
      choose = this.foodEnergy;
    }else if(input == "Agua"){
      choose = this.water;
    }else{
      choose = this.sleepEnergy;
    }
    if(HelperCaballo.checkBarraCompleta(choose)) return false;
    return true;
  }
  
  //Comprueba si se puede disminuir una barra en especial
  public boolean checkDisminucion(String input){
    char[] choose;
    if(input == "Comida"){
      choose = this.foodEnergy;
    }else if(input == "Agua"){
      choose = this.water;
    }else{
      choose = this.sleepEnergy;
    }
    if(HelperCaballo.checkBarraVacia(choose)) return false;
    return true;
  }
  
  public void aumentaBarra(String input){
    if(input == "Comida"){
      HelperCaballo.aumentaContenidoBarra(this.foodEnergy);
    }else if(input == "Agua"){
      HelperCaballo.aumentaContenidoBarra(this.water);
    }else{
      HelperCaballo.aumentaContenidoBarra(this.sleepEnergy);
    }
  }
  
  public void disminuyeBarra(String input){
    if(input == "Comida"){
      HelperCaballo.disminuyeContenidoBarra(this.foodEnergy);
    }else if(input == "Agua"){
      HelperCaballo.disminuyeContenidoBarra(this.water);
    }else{
      HelperCaballo.disminuyeContenidoBarra(this.sleepEnergy);
    }
  }
  
  
  
  public String saltoCaballo(){
    String result = "";
    for(int i=0; i<10; i++){
      for(int j=0; j<50; j++){
        if(i==9){
          result+="-";
        }else if(j==0|j==49){
          result+="|";
        }else{
          result+=" ";
        }
      }  
      result+="\n";
    }
    return result;
  }
}
