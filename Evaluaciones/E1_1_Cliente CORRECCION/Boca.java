public class Boca{
    private int tamano;
    private String color;
    private Labio[] myLips;
    private String kiss; 

    public Boca(){
        myLips = new Labio[2];
        myLips[0]= new Labio();
        myLips[1]= new Labio();
    }

    public Boca(int tamano, String color){
        tamano= this.tamano;
        color = this.color;
        myLips = new Labio[2];
        myLips[0]= new Labio();
        myLips[1]= new Labio();
    }
    
    public void kissPerson(Persona p){
        System.out.println(" y estoy besando a "+p.getName());
    }
    public void allowKiss(Persona p){
        kiss =p.getName(); 
    }

    public void talk(String words){
        System.out.println(" dice: "+words);
    }
}