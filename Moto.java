public class Moto implements Vehiculo{
  public int precioMoto = 30;
  public String matricula;
  public int pago;

  Moto(String matricula){
    this.matricula=matricula;
  }

  public void calcularPrecio(int tiempo){
    pago=precioMoto*tiempo;
  }

  public String toString(){
    return "Vehiculo: Moto\nMatricula: "+matricula+"\nValor a pagar: "+pago;
  }
}