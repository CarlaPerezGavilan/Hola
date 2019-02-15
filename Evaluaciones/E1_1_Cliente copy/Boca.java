public class Boca{
    private int tamano;
    private String color;
    private Labio[] myLips;
    private Persona kiss;

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
        String nombreA= p.getName();
        String nombreB= kiss.getName();
        if (nombreB.equals(nombreA)){
            System.out.println(" estoy besando a "+p.getName());
        }else{
            System.out.println(p.getName()+" no se deja besuquear ");
        }
       
    }
    public void allowKiss(Persona p){
        kiss=p;
    }

    public void talk(String words){
        System.out.println(" dice: "+words);
    }
}