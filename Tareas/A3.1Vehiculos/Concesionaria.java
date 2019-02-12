import java.util.Date;

public class Concesionaria{

    private Mecanico[] listMecanics;
    private Vendedor[] listSeller;
    private int contSeller;
    private int contMecanics;
    private Date dateService;
    private String name; 

    public Concesionaria(String name){
        this.name=name;
        contMecanics=0;
        contSeller=0;
        listMecanics[]= new Mecanico[100];
        listSeller[]= new Vendedor[100];
    }
    public Concesionaria(){
        this.name=name;
        contMecanics=0;
        contSeller=0;
        listMecanics[]= new Mecanico[100];
        listSeller[]= new Vendedor[100];

    }

    public void hiresMecanic(Mecanico theMecanic){
        if(contMecanics<20){
            listMecanic[contMecanics]=theMecanic;
            System.out.println("Hired "+theMecanic.getName());
        }else{
            System.out.println("FULL: Not hiring mecanics");
        }
    }
      public void hiresSeller(Vendedor theSeller){
        if(contSeller<20){
            listSeller[contSeller]=theSeller;
            System.out.println("Hired "+theSeller.getName());
        }else{
            System.out.println("FULL: Not hiring sellers");
        }
    }

    public void getConcesionaria(){
        return name;
    }
    public void scheduleService(Conductor c){
          System.out.println("Agendado servicio para"+c.getName());
        
    }
    public void reppairCar(Auto theCar, Mecanico theMecanic){
          System.out.println("Reparación de coche"+theCar.getConductor());
        theMecanic.repair();
    }
    public void reppairCar(Auto theCar){
          System.out.println("Reparación de coche"+theCar.getConductor());
    }

}