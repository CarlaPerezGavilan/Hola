public class Pasajero extends Persona{
    private String destination; 
    private String pickup;
    public Pasajero(){

    }
    public Pasajero(String nombre){
        super(nombre); 
        System.out.println("PASAJERO: name set");
    }
    public Pasajero(String nombre, String destination, String pickup){
        super(nombre);
        this.destination=destination;
        this.pickup=pickup; 
    }
    public void getinCar(Auto theCar){
        theCar.pickupPasajero(this, pickup);
         System.out.println("PASAJERO: picked up "+getName()+"at"+pickup);
    }
    public void getoutCar(Auto theCar){
        theCar.dropPassenger(this, destination);
        System.out.println("PASAJERO: dropped of "+getName()+"at"+destination);

    }
}