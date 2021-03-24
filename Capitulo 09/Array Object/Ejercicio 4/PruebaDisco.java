public class PruebaDisco{
  private static int tamanioDiscos = 5;
  public static void main(String[] args){
    Discos[] disco = new Discos[tamanioDiscos];
    for(int i=0; i<disco.length; i++){
      disco[i] = new Discos();
    }
    int selectedOption = 0;
    int indexDiscoBuscar = 0;
    String discoBusqueda = "";
    String codDisco = "";
    do{
      menu();
      selectedOption = Integer.parseInt(System.console().readLine());
      switch(selectedOption){
        case 1:
          int seleccionListado = 0;
          System.out.println("============================");
          System.out.println("============================");
          System.out.println("Elija el listado que desea");
          System.out.println("1. Listado completo.");
          System.out.println("2. Listado por autor.");
          System.out.println("3. Listado por género.");
          System.out.println("4. Listado rango de duracion.");
          seleccionListado = Integer.parseInt(System.console().readLine());
          switch( seleccionListado){
            case 1:
              for(int i=0; i<disco.length; i++){
                if(!disco[i].getCodigo().equals("libre")){
                  System.out.println(disco[i]);
                }
              }
            break;
            
            case 2:
              String autorBuscar = "";
              System.out.print("Introduzca el autor: ");
              autorBuscar = System.console().readLine();
              for(int i=0; i<disco.length; i++){
                if(!disco[i].getCodigo().equals("libre") && disco[i].getAutor().equals(autorBuscar)){
                  System.out.println(disco[i]);
                }
              }
            break;
            
            case 3:
              String generoBuscar = "";
              System.out.print("Introduzca el género: ");
              generoBuscar = System.console().readLine();
              for(int i=0; i<disco.length; i++){
                if(!disco[i].getCodigo().equals("libre") && disco[i].getGenero().equals(generoBuscar)){
                  System.out.println(disco[i]);
                }
              }
            break;
            
            case 4:
              int limiteInferior = 0;
              int limiteSuperior = 0;
              System.out.print("Introduzca el limite inferior de duracion: ");
              limiteInferior = Integer.parseInt(System.console().readLine());
              System.out.print("Introduzca el limite superior de duracion: ");
              limiteSuperior = Integer.parseInt(System.console().readLine());
              for(int i=0; i<disco.length; i++){
                if(!disco[i].getCodigo().equals("libre") && disco[i].getDuracion  () >= limiteInferior && disco[i].getDuracion() <= limiteSuperior){
                  System.out.println(disco[i]);
                }
              }
            break;
            
            default:
          }
          
          
        break;
        
        case 2:
          int index = indexDiscoLibre(disco);
          if(index == -1){
            System.out.println("Lo siento, no queda ningún disco libre, borre alguno");
          }else{
            do{
              System.out.print("Introduzca el código del disco: ");
              codDisco = System.console().readLine();  
              if(codDiscoUsado(disco, codDisco)){
                System.out.println("Lo siento, ese codigo está en uso, introduzca otro.");
              } 
            }while(codDiscoUsado(disco, codDisco));
            disco[index].setCodigo(codDisco);
            System.out.print("Introduzca el título del disco: ");
            disco[index].setTitulo(System.console().readLine());
            System.out.print("Introduzca el autor del disco: ");
            disco[index].setAutor(System.console().readLine());
            System.out.print("Introduzca el género del disco: ");
            disco[index].setGenero(System.console().readLine());
            System.out.print("Introduzca la duración del disco: ");
            disco[index].setDuracion(Integer.parseInt(System.console().readLine()));
            System.out.println("El disco ha sido guardado con éxito");
          }
        break;
        
        case 3:
          System.out.print("Introduzca el código del disco a modificar: ");
          discoBusqueda = System.console().readLine();
          indexDiscoBuscar = indexDiscoBusqueda(disco, discoBusqueda);
          if(indexDiscoBuscar == -1){
            System.out.println("Lo siento el disco no se ha encontrado");
          }else{
            do{
              System.out.print("Introduzca el nuevo código del disco: ");
              codDisco = System.console().readLine();  
              if(codDiscoUsado(disco, codDisco)){
                System.out.println("Lo siento, ese codigo está en uso, introduzca otro.");
              } 
            }while(codDiscoUsado(disco, codDisco));
            disco[indexDiscoBuscar].setCodigo(codDisco);
            System.out.print("Introduzca el nuevo título del disco: ");
            disco[indexDiscoBuscar].setTitulo(System.console().readLine());
            System.out.print("Introduzca el nuevo autor del disco: ");
            disco[indexDiscoBuscar].setAutor(System.console().readLine());
            System.out.print("Introduzca el nuevo género del disco: ");
            disco[indexDiscoBuscar].setGenero(System.console().readLine());
            System.out.print("Introduzca la nueva duración del disco: ");
            disco[indexDiscoBuscar].setDuracion(Integer.parseInt(System.console().readLine()));
            System.out.println("El disco ha sido modificado con éxito");
          }
        break;
        
        case 4:
          System.out.print("Introduzca el código del disco a borrar: ");
          discoBusqueda = System.console().readLine();
          indexDiscoBuscar = indexDiscoBusqueda(disco, discoBusqueda);
          if(indexDiscoBuscar == -1){
            System.out.println("Lo siento el disco no se ha encontrado");
          }else{
            disco[indexDiscoBuscar].setCodigo("libre");
            disco[indexDiscoBuscar].setTitulo("");
            disco[indexDiscoBuscar].setAutor("");
            disco[indexDiscoBuscar].setGenero("");
            disco[indexDiscoBuscar].setDuracion(0);
            System.out.println("El disco ha sido borrado con éxito");
          }
        break;
        
        default:
      }
      
    }while(selectedOption != 5);
  }
  
  private static void menu(){
    System.out.println("============================");
    System.out.println("============================");
    System.out.println("Gestor de discos");
    System.out.println("Elija una de las opciones:");
    System.out.println("1. Listado de discos");
    System.out.println("2. Nuevo disco");
    System.out.println("3. Modificar");
    System.out.println("4. Borrar");
    System.out.println("5. Salir");
    System.out.println("============================");
    System.out.println("============================");
  }
  
  //Si devuelve -1 significa que no hay ninguno libre
  public static int indexDiscoLibre(Discos[] disco){
    int indexLibre = -1;
    do{
      indexLibre++;
      if(indexLibre >= disco.length) return -1;
    }while(!(disco[indexLibre].getCodigo().equals("libre")) && (indexLibre <disco.length));
    return indexLibre;
  }
  
  //Si devuelve -1 el disco no se ha encontrado.
  private static int indexDiscoBusqueda(Discos[] disco, String codDisco){
    for(int i=0; i<disco.length; i++){
      if(disco[i].getCodigo().equals(codDisco)) return i;
    }
    return -1;
  }
  
  //Comprueba si el codigo de disco existe o no
  private static boolean codDiscoUsado(Discos[] disco, String codigoAComprobar){
    for(int i=0; i<disco.length; i++){
      if(disco[i].getCodigo().equals(codigoAComprobar)) return true;
    }
    return false;
  }
  
  //Filtra por autor
  
}
