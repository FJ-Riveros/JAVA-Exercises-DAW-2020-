public class Caballo{
  float altura, peso;
  int edad;
  
  char[] foodEnergy = new char[10];
  char[] sleepEnergy = new char[10];
  char[] water = new char[10];
  
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
  //Helper
  public int devuelveNivel(char[] input){
    int count = 0;
    boolean check = true;
    for(int i=0; i<input.length&&check; i++){
      if(input[i]==#){
        count++;
      }else{
        check = false;
      } 
    }
    return count;
  }
  //Setters
  public void alimentaCaballo(){
    
  }
  //Getters
  public String devuelveDatosCaballo(){
    String info = "";
    info = "Altura: " + this.altura + "\n";
    info = info + "Peso: " + this.peso + "\n";
    info = info + "Edad: " + this.edad + "\n";
    return info;
  }
  
  public String
  
  

  
}
