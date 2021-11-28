public class Carro implements Vehiculo {
  public int precioCarro=50;;
  public String matricula;
  public int pago;
  
  Carro(String matricula){
    this.matricula=matricula;
  }
  public void calcularPrecio(int tiempo){
    pago=precioCarro*tiempo;
  }
  
  public String toString(){
    return "Vehiculo: Carro\nMatricula: "+matricula+"\nValor a pagar: "+pago;
  }
}