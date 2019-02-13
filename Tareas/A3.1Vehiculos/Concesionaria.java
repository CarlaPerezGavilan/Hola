import java.util.*;

public class Concesionaria{

    private Mecanico[] listMecanics;
    private Vendedor[] listSeller;
    private int contSeller;
    private int contMecanics;
    private String date; 
    private String name; 

    public Concesionaria(String name){
        this.name=name;
        contMecanics=0;
        contSeller=0;
        listMecanics= new Mecanico[100];
        listSeller= new Vendedor[100];
    }
    private Concesionaria(){
    }
    public void hiresMecanic(Mecanico theMecanic){
        if(contMecanics<20){
            listMecanics[contMecanics]=theMecanic;
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
    public String getConcesionaria(){
        return name;
    }
    public void scheduleServicio(Conductor c, int dia, int mes, int ano){
        date= dia+"-"+mes+"-"+ano;
          System.out.println("Agendado servicio para"+c.getName()+" para  "+date); 
    }
    public void repararCar(Auto theCar, Mecanico theMecanic){
          System.out.println("Reparación de coche"+theCar.getConductor());
        theMecanic.repair(theCar);
    }
    public void repararCar(Auto theCar){
          System.out.println("Reparación de coche"+theCar.getConductor());
    }

}