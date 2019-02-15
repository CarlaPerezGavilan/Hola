public class Boca{
    private int tamano;
    private String color;
    private Labio[] myLips;
    private int kiss;

    public Boca(){

    }
    public Boca(int tamano, String color){
        tamano= this.tamano;
        color = this.color;
        myLips = new Labio[2];
        myLips[1]= new Labio();
        myLips[2]= new Labio();
        kiss=0;
    }

    public void kissPerson(Persona p){
        if (kiss==1){
            System.out.println(" estoy besando a "+p.getName());
        }else{
            System.out.println(p.getName()+" no se deja besuquear ");
        }
    }
    public void allowKiss(){
        kiss=1;
    }

    public void talk(String words){
        System.out.println(" dice: "+words);
    }
}