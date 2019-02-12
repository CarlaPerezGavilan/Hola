public class Conductor extends Persona{
    public void scheduleServicio(Concesionaria c)
    {
        c.scheduleServicio(this);
        System.out.println("Quiero un servicio en "+c.getConcesionaria);
    }
    public Conductor{

    }
    public Conductor(String nombre){
        super(nombre);
    }
    public void getName(){
        return name;
    }
    public void buyCar(Auto myCar){
        myCar.buyCar(this);
        System.out.println("Compra de auto: "+myCar.getModel());
    }
    public void pickUp(Pasajero thePassenger){
        System.out.println(name+" is driving with"+thePassenger.getName());
        thePassanger.getinCar();
    }
    public void droppedOff(Pasajero thePassenger){
        System.out.println(name+" dropped off "+thePassenger.getName());
        thePassanger.getoutCar();
    }
    public void drive(Auto theCar){
        System.out.println(name+" driving  "+theCar.getModel());
        theCar.drive();
    }
}    
