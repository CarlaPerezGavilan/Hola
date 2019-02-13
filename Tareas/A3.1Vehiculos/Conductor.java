public class Conductor extends Persona{
    private Auto myCar;
    public void scheduleServicio(Concesionaria c, int day, int month, int year)
    {
        c.scheduleServicio(this, day, month, year);
        System.out.println("Quiero un servicio en "+c.getConcesionaria());
    }
    public Conductor(){
    }
    public Conductor(String nombre){
        super(nombre);
    }
    public void buyCar(Auto myCar){
        this.myCar=myCar;
        myCar.buyCar(this);
        System.out.println("CONDUCTOR Compra de auto: "+myCar.getModel());
    }
    public void pickUp(Pasajero p){
        System.out.println(p.getName()+" is driving with"+p.getName());
        p.getinCar(myCar);
    }
    public void droppedOff(Pasajero thePassenger){
        System.out.println(getName()+" dropped off "+thePassenger.getName());
        thePassenger.getoutCar(myCar);
    }
    public void drive(Auto theCar){
        System.out.println(getName()+" driving  "+theCar.getModel());
        theCar.drive(this);
    }
}    
