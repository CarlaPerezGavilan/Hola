public class Llantas{
    private double diameter;
    public Llantas(){
    }
    public Llantas(double diameter){
        this.diameter=diameter;
    }
    public void addTire(Auto theCar){
        System.out.println("TIRE was changed");
    }
}