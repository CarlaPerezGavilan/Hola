public class Vendedor extends Persona{
    public Vendedor(){

    }
    public Vendedor(String nombre){
        super(nombre);
        System.out.println("VENDEDOR: el nombre del vendedor es "+nombre);
    } 
    public void sellCar(Conductor theConductor, Auto theCar){
        theConductor.buyCar(theCar);
        System.out.println("VENDEDOR: El conductor "+theConductor.getName()+" ha comprado "+theCar.getModel());
    }
}