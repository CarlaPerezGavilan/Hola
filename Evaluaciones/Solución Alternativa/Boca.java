public class Boca{
    private int tamano;
    private String color;
    private Labio[] myLips;

    // Constructores
    public Boca(){
        tamano = 5;
        color = "Rosita";
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

    // Metodos
    public void kissPerson(Persona p){
        System.out.println("estoy besando a " + p.getName());
    }

    public void talk(String words){
        System.out.println(" dice: " + words);
    }

    // Getters Setters
    public String getColor(){
        return color;
    }
    public int getTamano(){
        return tamano;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setTamano(int tamano){
        this.tamano = tamano;
    }
}
