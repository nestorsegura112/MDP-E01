import java.util.Scanner;
public class Cliente {
  
  public long cedula;
  public int tipoVehiculo;
  public int tiempo;
  Scanner sc=new Scanner(System.in);
  Factura f;
  Vehiculo v;
  Cliente(){
    ingresarDatosClientes();
    elegirVehiculo();
  }

  public void ingresarDatosClientes(){
    System.out.println("Ingrese su cedula");
    cedula=sc.nextLong();
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
        v= new Carro(ingresarMatricula());
      break;
      case 2:
        v = new Moto(ingresarMatricula());
      break;
      case 3:
        System.out.println("Digite el codigo de propiedad");
        int c=sc.nextInt();
        v= new Cicla(c);
      break;
      default:
        System.out.println("Ingrese un valor permitido");
        elegirVehiculo();
      break;
    }
    ingresarTiempo();
    v.calcularPrecio(tiempo);
    f=new Factura();
    f.imprimir(v,cedula);
  }
}