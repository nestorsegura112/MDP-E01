public class Factura{
  Factura(){
    System.out.println("");
    System.out.println("----------------------------");
    System.out.println("FACTURA");
    System.out.println("----------------------------");
  }

  public void imprimir(Vehiculo v,long cedula){
    System.out.println("Cedula: "+cedula);
    System.out.println(""+v.toString());
  }
  
} 