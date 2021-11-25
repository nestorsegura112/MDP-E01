import java.util.Scanner;
public class Cliente {
  
  public long cedula;
  public int tipoVehiculo;
  public int pagar;
  public int tiempo;
  Scanner sc=new Scanner(System.in);
  Factura f;
  Cliente(){
    ingresarDatosClientes();
    elegirVehiculo();
  }

  public String ingresarMatricula(){
    System.out.println("Digite la Matricula");
    String s=sc.nextLine();
    return s;
  }

  public void ingresarTiempo(){
    System.out.println("");
    System.out.println("Digite el tiempo que duro en minutos");
    tiempo=sc.nextInt();
  }

  public void elegirVehiculo(){
    System.out.println("");
    System.out.println("pulse el numero de el Vehiculo a elegir");
    System.out.println("1 - Carro");
    System.out.println("2 - Moto");
    System.out.println("3 - Cicla");
    tipoVehiculo=sc.nextInt();
    sc.nextLine();
    System.out.println("");
    
    switch(tipoVehiculo){
      case 1:
        Carro car= new Carro();
        car.setMatricula(ingresarMatricula());
        ingresarTiempo();
        car.calcularPrecio(tiempo);
        crearFactura();
        f.imprimir(car);
      break;
      case 2:
        Moto motorbike = new Moto();
        motorbike.setMatricula(ingresarMatricula());
        ingresarTiempo();
        motorbike.calcularPrecio(tiempo);
        crearFactura();
        f.imprimir(motorbike);
      break;
      case 3:
        Cicla bike= new Cicla();
        System.out.println("Digite el codigo de propiedad");
        int c=sc.nextInt();
        bike.setCodigoPropiedad(c);
        ingresarTiempo();
        bike.calcularPrecio(tiempo);
        crearFactura();
        f.imprimir(bike);
      break;
      default:
        System.out.println("Ingrese un valor permitido");
        elegirVehiculo();
      break;
    }
  }

  public void ingresarDatosClientes(){
    System.out.println("Ingrese su cedula");
    cedula=sc.nextLong();
  }

  public void crearFactura(){
    f=new Factura(cedula);
  }
}