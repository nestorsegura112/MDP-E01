public class Moto implements Vehiculo{
  public int precioMoto = 30;
  public String matricula;
  public int precio;
  
  public void setMatricula(String matricula){
    this.matricula=matricula;
  }
  
  public String getMatricula(){
    return matricula;
  }

  public int getPrecio(){
    return precio;
  }

  public void calcularPrecio(int tiempo){
    precio=precioMoto*tiempo;
  }     
}