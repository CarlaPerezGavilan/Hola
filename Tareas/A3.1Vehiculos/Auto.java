import java.lang.Math;

public class Auto{
    private String nameFact;
    private String model;

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
    public Auto(){}
    public Auto(String model, String color, double price, int yearMod, int km, String nameFact)
    {
       
        this.price=price; 
        this.km=km;
        this.color=color;
        this.yearMod= yearMod;
        this.nameFact= nameFact;
        this.model=model;

        //Inicializar componentes
        numDoors=0;
        theWindows = new Ventanas[4];
        theEngine = new Motor();
        theDoors = new Puertas[numDoors];
        yearMod=this.yearMod;
    }
    //Agregación de conductor
    public void buyCar(Conductor theConductor)
    {
       this.theConductor= theConductor;
       System.out.println("Vendido a: "+theConductor.getName());
    }

    //Get para todos los atributos 
    public String getModel()
    {
        return model;
    }
     public int getYear()
    {
        return yearMod;
    }
    public String getColor()
    {
        return color;
    }
    public double getPrice()
    {
        return price;
    }
    public String getNameFact()
    {
        return nameFact;
    }
    public int getNumDoors()
    {
        return numDoors;
    }
     public double getKm()
    {
        return km;
    }
    public void setConductor(String name)
    {
      theConductor.setName(name);
    }

  //SET para todos los atributos
    public void setModel(String model)
    {
        this.model=model;
    }
     public void setYear(int yearMod)
    {
        this.yearMod=yearMod;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    public void setPrice(double price)
    {
        this.price=price;
    }
    public void setNameFact(String nameFact)
    {
        this.nameFact= nameFact;
    }
    public void setNumDoors(int numDoors)
    {
        this.numDoors= numDoors;
    }
     public void setKm(double km)
    {
        this.km=km;
    }
    public String getConductor()
    {
        return theConductor.getName();
    }
 //Métodos 
    public void repair(Mecanico mecanic)
        {
        mecanic.repair(this);
         System.out.println("AUTO: Car reppaired");
        }

     public void service(Mecanico mecanic)
        {
        mecanic.service(this);
        System.out.println("AUTO: service done");
        }
    public void pickupPasajero(Pasajero newPassanger, String pickup)
        {
            System.out.println(newPassanger.getName()+" picked up at "+pickup);
            System.out.println(newPassanger.getName()+" is riding car");
        }
    public void dropPassenger(Pasajero newPassanger, String destination)
        {
            System.out.println(newPassanger.getName()+" arrived at "+destination);
        }
    public void drive(Conductor theConductor)
        {
            System.out.println("CAR:"+theConductor.getName()+" is driving ");
        }

        //Imprimir descripción del vehículo
         public void print()
        {
            System.out.println("CAR:"+yearMod+", "+nameFact+", "+model+" ,"+color);
        }

        //Imprimir edad de vehículo 
         public void getAge(int year)
        {
            System.out.println("CAR: the age of the car is "+(year-yearMod));
        }
        //Imprimir precio de venta
        public void calculatePrice(int year)
        {
            int age= year-yearMod;
            double newPrice= price*(Math.pow(0.8,age));
            System.out.println("CAR: El precio actual es "+newPrice);
        }
        public void nextService(){
            int i=0;
            double kilometros=km;
            while(kilometros>=10000){
                kilometros=-10000;
                i++;
            }
            if(i==1 || i==3 || i==5 || i==7 || i==9){
                System.out.println("Faltan "+kilometros+"para el servicio BÁSICO");
            }
            if(i==2 || i==6){
                System.out.println("Faltan "+kilometros+"para el servicio MEDIO");
            }
            if(i==4 || i==8){
                System.out.println("Faltan "+kilometros+"para el servicio COMPLETO");
            }
            if(i==10){
                System.out.println("Faltan "+kilometros+"para el servicio COMPLETO PLUS ");
            }
        }
        public void changeTire(Llanta nuevaLlanta){
            Llanta.addTire(this);
            System.out.println("New tire in "+theConductor);
        }
    }          