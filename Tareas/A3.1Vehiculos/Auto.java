import java.lang.Math;

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
        numDoors=4;
        theDoors = new Puerta[numDoors];
        nameFact="",yearMod=0;
    }
    //Agregación de conductor
    public void buyCar(Conductor theConductor)
    {
       this.theConductor= theConductor;
       System.out.println("Vendido a: "+theConductor.getName());
    }

    //GET para todos los atributos 
    public void getModel()
    {
        return name;
    }
     public void getYear()
    {
        return yearMod;
    }
    public void getColor()
    {
        return color;
    }
    public void getPrice()
    {
        return price;
    }
    public void getNameFact()
    {
        return nameFact;
    }
    public void getNumDoors()
    {
        return numDoors;
    }
     public void getKm()
    {
        return km;
    }
    public void setConductor(Strng theConductor)
    {
      this.theConductor=theConductor;
    }

  //SET para todos los atributos
 public void setModel(String model)
    {
        name=model;
    }
     public void setYear(String yearMod)
    {
        this.yearMod=yearMod;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    public void setPrice(String price)
    {
        this.price=price;
    }
    public void setNameFact(String nameFact)
    {
        this.nameFact;
    }
    public void setNumDoors(String numDoors)
    {
        this.numDoors= numDoors;
    }
     public void settKm(String km)
    {
        this.km=km;
    }
    public void getConductor()
    {
        return theConductor.getName();
    }
 //Métodos 
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
     public void drop Drive(Conductor theConductor)
        {
            System.out.println("CAR:"+theConductor.getName()+" is driving ");
        }

        //Imprimir descripción del vehículo
         public void print()
        {
            System.out.println("CAR:"+yearMod+" "+nameFact+" "+name+" "color+);
        }

        //Imprimir edad de vehículo 
         public void getAge(int year)
        {
            System.out.println("CAR: the age of the car is"+(year-yearMod));
        }
        //Imprimir precio de venta
        public void calculatePrice(int year)
        {
            int age= year-yearMod
            double newPrice= price*(Math.pow(0.2,age);
            System.out.println("El precio actual es"+newPrice);
        }
        public void nextService()
        {
            int kmFalta;
            if(km>80,000){
                kmFalta= 80,000-km;
                if(kmFalta==0){
                    System.out.println("El coche debe acudir al servicio COMPLETO");
                }else{
                    System.out.println("Al coche le falta"+kmFalta+"para el servicio COMPLETO");
                }
            }
            if(km>80,000){
                kmFalta= 80,000-km;
                if(kmFalta==0){
                    System.out.println("El coche debe acudir al servicio COMPLETO");
                }else{
                    System.out.println("Al coche le falta"+kmFalta+"para el servicio COMPLETO");
                }
            }
        }
}