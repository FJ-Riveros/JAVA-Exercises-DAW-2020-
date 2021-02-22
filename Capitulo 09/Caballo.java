public class Caballo{
  float altura, peso;
  int edad;
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
  
  public  String devuelveDatosCaballo(){
    String info = "";
    info = "Altura: " + this.altura + "\n";
    info = info + "Peso: " + this.peso + "\n";
    info = info + "Edad: " + this.edad + "\n";
    return info;
  }
  
}
