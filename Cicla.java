public class Cicla implements Vehiculo{
  public int precioCicla = 20;   
  public int codigoPropiedad;
  public int pago;
  
  Cicla(int codigoPropiedad){
    this.codigoPropiedad=codigoPropiedad;
  }

  public void calcularPrecio(int tiempo){
    if(tiempo<60){
      pago=0;
    }
    else{
      pago=precioCicla*tiempo;  
    }
  }

  public String toString(){
    return "Vehiculo: Cicla\nCodigo de propiedad: "+codigoPropiedad+"\nValor a pagar: "+pago;
  }
}