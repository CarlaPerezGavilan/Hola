public class Auto{
    private String nameFact;
    private String name;

    private int yearMod;
    private String color;
    private int numDoors;
    private double price;
    private double km;

    //Composición partes
    //Duda: ¿Estas pueden ir dentro del constructor?
    private Llantas theWheel;
    private Ventanas[] theWindows;
    private Motor theEngine;
    private Puertas[] theDoors;

    //Agregación conductor y pasajero
    private Conductor theConductor;
    private int contPassenger;

    //Constructor por default
    public Auto()
    {
        //Instancias de partes 
        theWindows = new Ventanas[4];
        theEngine = new Motor();
        theDoors = new Puerta[4];
        nameFact="",yearMod=0;
    }
    //Agregación de conductor
    public void buyCar(Conductor theConductor)
    {
       this.theConductor= theConductor;
       System.out.println("Vendido a: "+theConductor.getName());
    }
        
    public void getModel()
    {
        return name;
    }

    public void getConductor()
    {
        return theConductor.getName();
    }
       

    public buyCar(Conductor theConductor){
        //Instancias de partes 
        this.theConductor = theConductor;
        theWindows = new Ventanas[4];
        theEngine = new Motor();
        theDoors = new Puerta[4];
        nameFact="",yearMod=0;
        }
    public void repair(Mecanico mecanic)
        {
        mecanic.repair();
         System.out.println("AUTO: Car reppaired");
        }

     public void service(Mecanico mecanic)
        {
        mecanic.service();
        System.out.println("AUTO: srvice done");
        }
    public void pickupPassanger(Pasajero newPassanger, String pickup)
        {
            System.out.println(newPassanger.getName()+" picked up at "+pickup);
            System.out.println(newPassanger.getName()+" is riding car");
        }
    public void drop Passanger(Pasajero newPassanger, String destination)
        {
            System.out.println(newPassanger.getName()+" arrived at "+destination);
        }
        
}