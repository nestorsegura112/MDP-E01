public class Cicla implements Vehiculo{
  public int precioCicla = 20;   
  public int codigoPropiedad;
  public int precio;

  public void setCodigoPropiedad(int codigoPropiedad){
    this.codigoPropiedad=codigoPropiedad;
  }
  
  public int getCodigoPropiedad(){
    return codigoPropiedad;
  }  
  
  public int getPrecio(){
    return precio;
  }

  public void calcularPrecio(int tiempo){
    if(tiempo<60){
      precio=0;
    }
    else{
      precio=precioCicla*tiempo;  
    }
  }
}