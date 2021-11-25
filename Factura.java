public class Factura{
  long cedula;
  Factura(long cedula){
    System.out.println("");
    System.out.println("----------------------------");
    System.out.println("FACTURA");
    System.out.println("----------------------------");
    this.cedula=cedula;
  }

  public void imprimir(Carro c){
    System.out.println("Vehiculo: Carro");
    System.out.println("Matricula:"+c.getMatricula());
    System.out.println("Precio: $"+c.getPrecio());
  }

  public void imprimir(Moto m){
    System.out.println("Vehiculo: Moto");
    System.out.println("Matricula:"+m.getMatricula());
    System.out.println("Precio: $"+m.getPrecio());
  }

  public void imprimir(Cicla b){
    System.out.println("Vehiculo: Cicla");
    System.out.println("Codigo de Propiedad:"+b.getCodigoPropiedad());
    System.out.println("Precio: $"+b.getPrecio());
  }
} 