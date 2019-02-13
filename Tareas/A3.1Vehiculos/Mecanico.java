public class Mecanico extends Persona{
    public Mecanico(String nombre){
        super(nombre);
        System.out.println(nombre+"MECANIC: name set");
    }
    public Mecanico(){
    }
    
    public void repair(Auto theCar){
        System.out.println(getName()+"MECANIC: Mecanic repaired car for"+theCar.getConductor());
    }
    public void service(Auto theCar){
        System.out.println(getName()+"MECANIC: finished service for"+theCar.getConductor());
    }
}